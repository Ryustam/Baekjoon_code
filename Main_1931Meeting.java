import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int meetingNumber = Integer.parseInt(bf.readLine());
		
		int[] meetings = new int[meetingNumber];
		String[] meeting = bf.readLine().split(" ");
		for(int i=0;i<meetingNumber;i++) {
			
		}
		
		
		bw.flush();
        bw.close();
	}

}
