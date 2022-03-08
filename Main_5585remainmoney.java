import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int paper = 1000;
		int needMoney = Integer.parseInt(bf.readLine());
		
		int[] kindOfMoney = new int[]{1,5,10,50,100,500};
		
		int remain = paper - needMoney;
		int totalCoin=0;
		int coin=0;
		for(int i = 5 ; i>=0; i--) {
			if(remain>=kindOfMoney[i]) {
				coin = (int) remain / kindOfMoney[i];
				remain = remain - (coin * kindOfMoney[i]);
				totalCoin+=coin;
			}
			coin=0;
		}
		System.out.print(totalCoin);
	}

}
