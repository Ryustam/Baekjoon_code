package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(cal(N,r+1,c+1));

    }

    public static long cal(int N, int cov_r, int cov_c) {
        int sum = 0;

        if(N==0) {
            return 0;
        }
        if(N==1){
            if(cov_r==1 && cov_c==1){
                return sum+0;
            }else if(cov_r==1 && cov_c==2){
                return sum+1;
            }else if(cov_r==2 && cov_c==1){
                return sum+2;
            }else if(cov_r==2 && cov_c==2){
                return sum+3;
            }
        }else if(N>=2){
            double cov_N = N;
            int half = (int)Math.pow(2,cov_N-1);

            int basic = ((int)Math.pow(2,cov_N)) *((int)Math.pow(2,cov_N)) / 4 ;

            if( cov_r <= half && cov_c <= half){
                sum+=basic *0;
                return sum+cal(N-1,cov_r,cov_c);
            } else if(cov_r <= half && cov_c > half){
                sum+=basic *1;
                return sum+cal(N-1,cov_r,cov_c-half);
            } else if(cov_r > half && cov_c <= half){
                sum+=basic *2;
                return sum+cal(N-1,cov_r-half,cov_c);
            } else if(cov_r > half && cov_c > half){
                sum+=basic *3;
                return sum+cal(N-1,cov_r-half,cov_c-half);
            }
        }
        return 0;
    }
}

