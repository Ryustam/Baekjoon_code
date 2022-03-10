import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String in = bf.readLine();
			int in_Int = Integer.parseUnsignedInt(in);
			String[] inputs = in.split("");
			 
			Arrays.sort(inputs);

			/*
			int sum=0;
			for(int i =0 ;i<inputs.length;i++) {
				sum+= Integer.parseInt(inputs[i]);
			}
			*/
			
			if(inputs[0].contains("0") && (in_Int%3 == 0)) {
				for(int i = inputs.length-1 ;i>=0; i--) {
					System.out.print(inputs[i]);
				} 
			} else {
				System.out.println("-1");
			}
		} catch (Exception e) {
			
		}	
	}
}
