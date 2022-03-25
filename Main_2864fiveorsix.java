package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        //최소
        for(int i=0 ; i<a.length(); i++){
            a=a.replace("6", "5");
        }
        for(int i=0 ; i<b.length(); i++){
            b=b.replace("6", "5");
        }
//        System.out.println(a+""+b);
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int min =  num1+num2;

        for(int i=0 ; i<a.length(); i++){
            a=a.replace("5", "6");
        }
        for(int i=0 ; i<b.length(); i++){
            b=b.replace("5", "6");
        }
//        System.out.println(a+""+b);
        int num3 = Integer.parseInt(a);
        int num4 = Integer.parseInt(b);
        int max =  num3+num4;

        System.out.println(min+" "+max);
    }
}
