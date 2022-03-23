package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int jewels = Integer.parseInt(st.nextToken());
        int bags = Integer.parseInt(st.nextToken());

        int[][] jewelInfo = new int[jewels][2];
        int[] bagInfo = new int[bags];

        int min= 1000001;
        for(int i = 0 ; i < jewels ; i++ ) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            jewelInfo[i][0]=Integer.parseInt(st2.nextToken());
            jewelInfo[i][1]=Integer.parseInt(st2.nextToken());
        }

        for(int i = 0 ; i < bags ; i++ ) {
            bagInfo[i]=Integer.parseInt(bf.readLine());
        }

        Arrays.sort(jewelInfo, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        Arrays.sort(bagInfo);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;

        int j = 0;
        for (int i = 0 ; i < bags; i++ ) {
            if(j!=jewels){
                while(bagInfo[i] >= jewelInfo[j][0]){
                    priorityQueue.add(jewelInfo[j][1]);
                    j++;
                    if(j==jewels){
                        break;
                    }
                }
            }
            if(priorityQueue.size()!=0){
                sum+=priorityQueue.poll();
            }
        }
        System.out.println(sum);
    }
}

//        보석의 무게, 가방의 무게 한계를 둘 다 오름차순으로 설정하는 이유는
//
//        일단 가방의 최소 무게보다 낮은 것들을 미리 다 큐에 넣어놓고,
//        가방의 무게한계가 더 높아질 때만 비교를 통해 넣어주면 된다.
//        10  12 13 14
//        6 7 8   11 12 15
//
//        j는 한번만 순회하면 되기 때문에  for문 밖에서 정의해 준다.
//
//
//        우선 순위 큐를 사용하지 않는다면, 조건을 충족하더라도
//        조건을 충족하는 보석 중 최고의 가격을 뽑기까지 너무 오랜 시간이 걸린다.