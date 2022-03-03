import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kindOfCoin=0;
		int targetNumber=0;
		
		kindOfCoin = sc.nextInt();
		targetNumber = sc.nextInt();
		
		int[] coinBox = new int[kindOfCoin];
		
		for(int i = 0 ;i<kindOfCoin;i++) {
			coinBox[i]=sc.nextInt();
		}
		
		int max_index=0;
		
		for(int i=1 ; i<kindOfCoin ; i++) {
			if(coinBox[max_index]<targetNumber) {
				max_index++;
			} else {
				if(coinBox[max_index]==targetNumber) {
					break;
				}
				max_index--;
				break;
			}
		}
		
		//System.out.println(max_index);
		
		int remain=targetNumber;
		int coins=0;
		int totalCoins=0;
		
		for(int i=max_index; i>=0; i--) {
			coins=remain/coinBox[i];
			totalCoins+=coins;
			if(coins == 0) {
				
			} else {
				remain = remain-(coinBox[i] * coins);
				if(remain==0) {
					break;
				}
			}
			/*
			System.out.println(coinBox[i]+"원짜리");
			System.out.println(coins);
			System.out.println(totalCoins);
			System.out.println(remain);
			*/
		}
		
		System.out.println(totalCoins);
	}

}
