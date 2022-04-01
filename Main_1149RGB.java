package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int house, R, G, B, BIG=1000001;
    static int[][] dp;
    static int[][] cost;
    public static void main(String[] args) throws IOException {

        house = getInt();

        dp = new int[house][3];
        cost = new int[house][3];
        for(int i= 0 ; i< house; i++){
            cost[i][0]=getInt();
            cost[i][1]=getInt();
            cost[i][2]=getInt();
        }
        //첫번째 값 초기화
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        System.out.println(Math.min(dphouse(house-1,0),Math.min(dphouse(house-1,1),dphouse(house-1,2))));

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

    public static int dphouse(int i,int color) throws IOException {

        if(dp[i][color] == 0){
            if(color==0){
                dp[i][0] = Math.min(dphouse(i-1,1),dphouse(i-1,2))+cost[i][0];
            } else if(color==1){
                dp[i][1] = Math.min(dphouse(i-1,0),dphouse(i-1,2))+cost[i][1];
            } else if(color==2){
                dp[i][2] = Math.min(dphouse(i-1,0),dphouse(i-1,1))+cost[i][2];
            }
        }
        return dp[i][color];
    }
}
