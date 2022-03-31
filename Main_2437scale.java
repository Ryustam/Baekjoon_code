package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static TreeSet<Integer> set = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int ans = 1;
        int[] sum = new int[n];
        boolean check=false;
        for (int i = 0; i < n; i++) {
            if (arr[0] != 1) {
                ans = 1;
                break;
            }
            if (i >= 1) {
                sum[i] = arr[i] + sum[i - 1];
            } else {
                sum[i] = arr[i];
            }

            if (i >= 1) {
                if (sum[i] - sum[i - 1] > sum[i - 1]) {
                    if (sum[i-1]+1 == arr[i]) {

                    } else{
                        ans = sum[i - 1] + 1;
                        check=true;
                        break;
                    }
                }

                if (i == n-1 && check ==false) {
                    ans = sum[i] + 1;
                }
            }
        }
        System.out.println(ans);
    }
}




