package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());

        int count = Integer.parseInt(bf.readLine());

//        int[] plus = new int[]{};
//        int[] minus = new int[]{};

        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minus = new PriorityQueue<>();
        boolean checkzero = false;

        //양수 음수 0 을 나누어 담는 과정
        for (int i = 0 ; i < count ; i++ ){
            int temp = Integer.parseInt(bf.readLine());
            if(temp > 0){
                plus.add(temp);
            } else if (temp < 0){
                minus.add(temp);
            } else{
                checkzero=true;
            }
        }

        long sum = 0;

        //숫자가 하나 남을때까지 뽑아서 곱해서 더한다.
        while(plus.size() > 1){
            int a = plus.poll();
            int b = plus.poll();
            if(a*b < a+b){
                sum+= a + b;
            } else{
                sum += a * b;
            }
        }
        if(plus.size() != 0){
            sum+= plus.poll();
        }

        //음수 처리
        while(minus.size() >1){
            int a = minus.poll();
            int b = minus.poll();
            sum += a * b;
        }
        if(minus.size() != 0){
            if(checkzero){
                sum+= minus.poll() * 0;
            } else{
                sum+= minus.poll();
            }
        }
        System.out.print(sum);
    }
}
