import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_1931Meeting{

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int meetingNumber = Integer.parseInt(bf.readLine());
		
		int[][] meetings = new int[meetingNumber][2];
		String[] input = new String[2];
		for(int i=0;i<meetingNumber;i++) {
			input = bf.readLine().split(" ");
			meetings[i]= new int[]{Integer.parseInt(input[1]),Integer.parseInt(input[0])};
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int meetingNumber = sc.nextInt();
		int[][] meetings = new int[meetingNumber][2];
		for(int i=0;i<meetingNumber;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			meetings[i]= new int[]{b,a};
		}
		*/
		Arrays.sort(meetings, new Comparator<int[]>() { 
			@Override public int compare(int[] o1, int[] o2) { 
				if(o1[0] == o2[0]) { 
					return o1[1] - o2[1]; 
				}else { 
					return o1[0] - o2[0]; 
				} 
			} 
		});

		for(int i = 0;i<meetingNumber;i++) {
			System.out.println(meetings[i][0]+" "+meetings[i][1]);
		}
		
		int maxCount = -1;
		int endTime = -1;
		int Count = 0;
		for(int i = 0 ; i<meetingNumber ; i++){	
			if(meetings[i][1]>=endTime) {
				endTime=meetings[i][0];
				Count++;
			}
			maxCount = (Count>maxCount) ? Count : maxCount;	
		}
		System.out.println(maxCount);
	}
}
