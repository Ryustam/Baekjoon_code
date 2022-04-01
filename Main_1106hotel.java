package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int needs = Integer.parseInt(st.nextToken());
        int citys = Integer.parseInt(st.nextToken());

        int BIG = 999999999;
        int[] dp = new int[2000];
        int cost;
        int person;
        Arrays.fill(dp,BIG);
        dp[0]=0;
        for(int i = 0 ; i < citys; i++) {
            StringTokenizer st1 = new StringTokenizer(bf.readLine());
            cost = Integer.parseInt(st1.nextToken());
            person = Integer.parseInt(st1.nextToken());
            for(int j = 0 ;  j<2000; j++){
                if(dp[j] == BIG){
                    continue;
                }
                for(int k = 1; j+person*k<2000; k++){
                    dp[j+person*k] = Math.min(dp[j+person*k],dp[j]+cost*k);
                }
            }
        }
        int ans = BIG;
        for(int i = needs ; i<2000; i++){
            ans = Math.min(ans,dp[i]);
        }
        System.out.println(ans);
    }
}
