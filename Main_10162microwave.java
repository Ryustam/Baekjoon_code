import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		int[] times = new int[3];
		
		for(int i = 0 ; i<3 ; i++) {
			if(input >= 300 && input!=0) {
				times[0] = (int) input / 300;
				input = input - (times[0]*300);
			} else if(input >= 60 && input!=0) {
				times[1] = (int) input / 60;
				input = input - (times[1]*60);				
			} else if (input >= 10 && input!=0){
				times[2] = (int) input / 10;
				input = input - (times[2]*10);
			}
		}
		if(input == 0) {
			for(int i = 0 ; i<3 ; i++) {
				System.out.print(times[i]+" ");
			}
		} else {
			System.out.print("-1");
		}	
	}
}
