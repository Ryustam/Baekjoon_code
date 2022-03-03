import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int humanNumber = sc.nextInt();
		sc.nextLine();
		String inputLine = sc.nextLine();
		String[] line = inputLine.split("\\s+");
		
		Arrays.sort(line);
		
		int minutes=0;
		int sum=0;
		
		for ( int i = 0 ; i < humanNumber ; i++) {
			sum += Integer.parseInt(line[i]);
			minutes+=sum;
		}
		
		System.out.print(minutes);
	}

}
