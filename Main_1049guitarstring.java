package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int strings = Integer.parseInt(st.nextToken());
        int brands = Integer.parseInt(st.nextToken());

//        int[] pmoney = new int[brands];
//        int[] money = new int[brands];

        PriorityQueue<Integer> pmoney = new PriorityQueue<>();
        PriorityQueue<Integer> money = new PriorityQueue<>();

        for (int i = 0 ; i < brands; i++ ){
            st = new StringTokenizer(bf.readLine());
            pmoney.add(Integer.parseInt(st.nextToken()));
            money.add(Integer.parseInt(st.nextToken()));

        }

//        Arrays.sort(pmoney);
//        Arrays.sort(money);

        //비교
        int p=pmoney.peek();
        int n=money.peek();

        int sum = 0;

        if(p > n*6){
            //낱개 줄이 패키지보다 싼 경우
            sum += n*strings;
        } else if( p < (strings%6) * n ){
            //패키지만 사는게 싼 경우
            if(strings%6 ==0){
                sum += (strings/6) * p;
            }else{
                sum += (((int)strings/6)+1) * p ;
            }
        } else {
            //패키지와 낱개 줄을 같이 이용해야 하는 경우
            sum += (((int) strings/6) * p) + (strings%6 * n);
        }

        System.out.println(sum);
    }
}

/* 결국 제일 싼 줄을 이용하기 하기 때문에 우선순위 큐에 각각의 패키지와 낱개 줄의 가격을 분리해서 넣었다.
그리고 경우를 3개로 나누어서 생각하였다. */