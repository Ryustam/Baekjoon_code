package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int answer = -1;

        while( first != second ){
            if(second < first){
                answer = -1;
                break;
            }

            if(second %10 != 1 && second %2 != 0){
                answer = -1;
                break;
            }
            if(second %10 == 1){
                second=removeLast(second);
                answer++;
                if(check(first,second)){
                    break;
                }
            }
            if(second %2 == 0) {
                second =  second / 2;
                answer++;
                if (check(first, second)) {
                    break;
                }
            }
        }
        if(answer == -1){
            System.out.println(answer);
        }else{
            System.out.println(answer+2);
        }
    }

    public static int removeLast(int num){
        int answer2 = (int )num / 10;
        return answer2;
    }

    public static boolean check(int num1, int num2){
        if(num1 == num2){
            return true;
        }else{
            return false;
        }
    }
}

