package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int box;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        box = getInt();

        dp= new int[box][3];

        dp[0][0]=1;
        dp[0][1]=1;
        dp[0][2]=1;

        System.out.println((dpBox(box-1,0)+dpBox(box-1,1)+dpBox(box-1,2))%9901);

    }

    public static int dpBox(int box, int index){
        if(dp[box][index]==0){
            if(index == 0){
                dp[box][0]= (dpBox(box-1,1)+dpBox(box-1,2)+dpBox(box-1,0))%9901;
            } else if(index == 1){
                dp[box][1]= (dpBox(box-1,0)+dpBox(box-1,2))%9901;
            } else if(index == 2){
                dp[box][2]= (dpBox(box-1,1)+dpBox(box-1,0))%9901;
            }
        }
        return  dp[box][index];
    }

    public static void getToken() throws IOException {
        if(st != null && st.hasMoreTokens()){
            return;
        }
        st = new StringTokenizer(bf.readLine());
    }

    public static int getInt() throws IOException {
        getToken();
        return Integer.parseInt(st.nextToken());
    }
}
