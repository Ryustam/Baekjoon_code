import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int numbers = Integer.parseInt(bf.readLine());
		
		int[] arrayA= new int[numbers];
		Integer[] arrayB= new Integer[numbers];
		String[] inputA,inputB;
		inputA = bf.readLine().split(" ");
		inputB = bf.readLine().split(" ");
		for(int i=0;i<numbers;i++) {
			arrayA[i]= Integer.parseInt(inputA[i]);
			arrayB[i]= Integer.parseInt(inputB[i]);
		}
		
		Arrays.sort(arrayA);
		Arrays.sort(arrayB,Collections.reverseOrder());
		
		for(int i =0 ; i<numbers ; i++) {
			System.out.print(arrayA[i]+" ");
		}
		System.out.println();
		
		for(int i =0 ; i<numbers ; i++) {
			System.out.print(arrayB[i]+" ");
		}
		System.out.println();
		int sum=0;
		
		
		
		for(int i =0 ; i<numbers ; i++) {
			sum+= arrayA[i]*arrayB[i];
		}
		
		
		
		System.out.println(sum);
	}

}
