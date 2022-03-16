import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(bf.readLine());
		int recruits =  0;
		int[] solve = new int[testCases];
		for(int i = 0 ; i < testCases; i++) {
			recruits = Integer.parseInt(bf.readLine());
			String[] input = new String[2];
			int[][] scores= new int[recruits][3];

			List<Integer> testList = new ArrayList<Integer>();
			
			for(int j = 0 ; j < recruits ; j ++) {
				input = bf.readLine().split(" ");
				scores[j] = new int[]{Integer.parseInt(input[0]),Integer.parseInt(input[1]),j};
			}

			Arrays.sort(scores, new Comparator<int[]>() { 
				@Override public int compare(int[] o1, int[] o2) { 
					return o1[0]-o2[0];
			    }
			});
			
			int index = 0;
			for(int j = 1; j < scores.length; j++) {
				if(scores[index][1]<scores[j][1]) {
					testList.add(scores[j][2]);
				} else if(scores[index][1]>scores[j][1]){
					index=j;
				}
			}

			Set<Integer> set = new HashSet<Integer>(testList);
			
			solve[i]=recruits-set.size();
			
		}
		for(int i = 0 ; i < testCases; i++) {
			System.out.println(solve[i]);
		}
	}
}
