package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String L = st.nextToken();
        String R = st.nextToken();

        int[] RArray = new int[R.length()];
        int[] LArray = new int[R.length()];

        for (int i = 0; i < R.length(); i++) {
            RArray[i] = Integer.parseInt(Character.toString(R.charAt(i)));
        }

        if(L.length()<R.length()){
            for (int i = 0; i < R.length()-L.length(); i++) {
                LArray[i]= 0;
            }
        }
        for (int i= R.length()-L.length(); i<R.length(); i++){
            LArray[i] = Integer.parseInt(Character.toString(L.charAt(i-(R.length()-L.length()) )));
        }

        int ans=0;
        //앞자리가 있는지 없는지
        boolean frontcheck = false;
        boolean eightcheck = false;

        for(int i=0;i<R.length();i++){
            if((LArray[i]==8 && RArray[i]==8) || (LArray[i]==RArray[i])) {
                eightcheck=true;
            }
            if(eightcheck==true && frontcheck==false){
                if(LArray[i]==8){
                    ans++;
                }
                frontcheck=false;
            }else{
                frontcheck=true;
            }
            eightcheck=false;
        }
        System.out.println(ans);
    }
}

