package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split("");

        int idx;
        idx = (int) s.length/2;
        
        int n = 1;

//		기준점을 기준으로 배열에 넣음

        //팰린드롬을 만족하는지를 확인
        boolean check = false;

        int solution;
        int solution1;
        int solution2;

        if(s.length !=1){
            while(true){
                //숫자를 기준으로 삼고
                if(idx+n > s.length-1) {
                    solution1 = s.length - (1+(n-1)*2);
//                    System.out.println(solution1);
                    break;
                }
                if(s[idx-n].equals(s[idx+n])){
                    n++;
                }else{
                    n = 1;
                    idx++;
                }
            }
//            System.out.println("////");
            idx = (int) s.length/2;
            n=0;
            while(true){
                if(idx+n >= s.length-1) {
                    if(n==0){
                        if(s[(idx-1+n)].equals(s[idx+n])){
                            solution2 = s.length - (2+(n*2));
                        }else{
                            solution2 = s.length - (1+(n*2));
                        }
                    }else{
                        if((idx-1)-n < 0){
                            n = 0;
                            idx++;
                            continue;
                        }else{
                            if(s[(idx-1)-n].equals(s[idx+n])){
                                solution2 = s.length - (2+(n*2));
                            }else{
                                n = 0;
                                idx++;
                                continue;
                            }
                        }
                    }
                    if(solution2<0){
                        solution2=0;
                    }
//                    System.out.println(solution2);
                    break;
                }
                if(s[(idx-1)-n].equals(s[idx+n])){
                    n++;
                }else{
                    n = 0;
                    idx++;
                }
            }

            solution = (solution1>solution2) ? s.length+solution2 : s.length+solution1;
        } else{
            solution = 1;
        }
        System.out.print(solution);
    }
}
