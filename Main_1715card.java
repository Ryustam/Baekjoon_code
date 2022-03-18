package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int decks = Integer.parseInt(bf.readLine());

        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

        for (int i=0 ; i < decks; i++ ){
            priorityQueueLowest.add(Integer.parseInt(bf.readLine()));
        }

        int total=0;
        int one = 0;
        int two = 0;
        while(priorityQueueLowest.size() != 1){
            one = priorityQueueLowest.poll();
            two = priorityQueueLowest.poll();
            total += one + two ;
            priorityQueueLowest.add(one+two);
        }

        System.out.println(total);
    }
}
