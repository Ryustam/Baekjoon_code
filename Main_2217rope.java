import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int ropes = Integer.parseInt(bf.readLine());
		int[] ropeBox = new int[ropes];
		for( int i = 0 ; i<ropes ; i++ ) {
			ropeBox[i] = Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(ropeBox);
		int max = -1;
		int numberOfRope = ropes;
		for(int i = 0 ; i<ropes ; i++ ) {
			max = ( max > ropeBox[i] * numberOfRope) ? max: ropeBox[i] * numberOfRope;
			numberOfRope--;
		}
		
		System.out.println(max);
	}

}
