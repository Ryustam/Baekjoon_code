package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int bottles = Integer.parseInt(st.nextToken());
        int obj = Integer.parseInt(st.nextToken());

        int buy = 0;
        String last = "";


        String binaryString = Integer.toBinaryString(bottles);

        while(true){
            int num = bottles;
            int count = 0;
            while(num!=0){
                if(num%2==1){
                    count+=1;
                }
                num = num/2;
            }
            if(count<=obj){
                break;
            }
            buy++;
            bottles+=1;
        }

//        목표 물통이 현재 물통보다 많은 경우
//        if(bottles < obj){
//            buy = obj - bottles;
//        } else if ( bottles == obj) {
//            buy = 0;
//        } else if (bottles > obj) {
//            String conv=to2(bottles);
//
//            if(countChar(conv, '1') <= obj){
//                buy = 0;
//            }else{
//                int temp = 0;
//                int now =0;
//                for(int i = 0 ; i < obj ; i++ ){
//                    if(conv.charAt(0) == '1'){
//                        last = conv.replace("1","0").replaceFirst("0","1");
//                        conv = conv.replaceFirst("1","0");
//                        temp = twototen(conv);
//                        conv = to2(temp);
//                        now ++;
//                        if(now == obj){
//                            if(!conv.equals("")) {
//                                buy = twototen(last) - twototen(conv);
//                            }
//                        }
//                    }
//
//                }
//            }
//        }
//
//        //2진법으로 바꿨을때 1의 개수가 obj 보다 작거나 같으면 0개 필요

        System.out.println(buy);
    }

    public static int multy(int number){
        int two = 1;
        for(int i = 0; i < number ; i++){
            two *=2;
        }
        return two;
    }

    public static String to2(int number1){
        int number=number1;
        String result = "";

        while(true){
            if(number != 1) {
                if(number % 2 == 0){
                    result = "0" +result;
                } else {
                    result = "1" +result;
                }
                number = (int) number/2;
                if(number==1){
                    result = "1" +result;
                    break;
                }
            }else{
                return "1";
            }

        }
        return result;
    }

    public static int twototen(String two2){
        String two = two2;
        int ten =0;

        while(true){
            if(two.charAt(0) == '0'){
                two = two.replaceFirst("0","");
            }else{
                break;
            }
        }

        for(int i=two.length()-1 ; i>=0; i--){
            int a = two.length()-1 - i;
            if(two.charAt(i)=='1'){
                ten += multy(a);
            }
        }
        return ten;
    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}


