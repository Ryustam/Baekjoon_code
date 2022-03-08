import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String input = bf.readLine();
		String[] numbers = input.split("\\-|\\+");
		String check ="";
		for(int i = 0 ; i<input.length();i++) {
			if(input.charAt(i)=='+') {
				check +="1";
			} else if(input.charAt(i)=='-') {
				check +="0";
			}
		}
		/*
		for(int i=0 ;i<check.length();i++ ) {
			System.out.print(check.charAt(i));
		}
		*/
		
		int sum= Integer.parseInt(numbers[0]);
		int tempSum= 0;
		boolean switching = false;
		for(int i = 1 ; i<numbers.length ; i++) {
			if((check.charAt(i-1)=='1') && switching==false) {
				sum+=Integer.parseInt(numbers[i]);
			} else if((check.charAt(i-1)== '0') || switching==true) {
				if((check.charAt(i-1)== '0') && switching==true) {
					sum-=tempSum;
					tempSum=0;
				}
				tempSum+=Integer.parseInt(numbers[i]);
				switching=true;
			}
		}
		sum-=tempSum;
		/*
		for(int i = 0 ; i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		*/
		System.out.println(sum);
	}
}
