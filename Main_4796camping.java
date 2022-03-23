package main_4796camping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int index = 1;
        boolean temp = true;
        while(temp) {
        	StringTokenizer st = new StringTokenizer(bf.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            
            int max = 0;
            if( L == 0 || P == 0 || V == 0) {
            	temp=false;
            } else {
            	if ( V%P > L) {
            		 max = (((int)V/P)  * L ) + L ;
            	} else {
            		 max = (((int)V/P)  * L ) + ( V%P/L * L)  + (V%P)%L ;
            	}
                System.out.print("Case "+index+": ");
                System.out.println(max);
                index++;           	
            }
        }    
	}
}
