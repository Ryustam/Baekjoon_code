package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split("");

        int count=0;
        String temp = input[0];
        boolean check = true;
        for(int i = 1 ; i < input.length ; i++){
            if( !temp.equals(input[i]) ){
                if(check) {
                    count++;
                    temp = input[i];
                    check = false;
                }else{
                    temp = input[i];
                    check = true;
                }
            }
        }
        System.out.println(count);

    }
}
