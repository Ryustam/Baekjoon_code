package main_wordmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int words = Integer.parseInt(bf.readLine());
		String[] word = new String[words];
		for(int i =0 ; i < words ; i++) {
			word[i] = bf.readLine();
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0 ; i < words ; i++ ) {
			for(int j = 0 ; j < word[i].length() ; j++) {
				if( !map.containsKey( Character.toString( word[i].charAt(j) ) ) ) {
					map.put(Character.toString(word[i].charAt(j)), jisu( word[i].length()-j-1 ) );
				} else {
					int temp =map.get( Character.toString( word[i].charAt(j) ) );
					map.replace(Character.toString(word[i].charAt(j)),temp+jisu(word[i].length()-j-1));
				}
			}
		}
		
//		System.out.println(map.keySet());
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
		    @Override
		    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
			return o2.getValue() - o1.getValue();
		    }
		});
		
		int number = 9;
		int sum = 0;
		for(Map.Entry<String, Integer> entry : entryList){
//		    System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		    sum += entry.getValue()*number;
		    number--;
		}
		System.out.println(sum);
		
//		String[][] word_ = new String[words][index];
//		
//		for(int i = 0 ; i<words; i++ ) {
//			String[] temp = new String[]{};
//			if(word[i].length() < index) {
//				for(int j=0 ; j<index-word[i].length() ; j++) {
//					word_[i][j]="0";
//				}
//				temp=word[i].split("");
//				for(int k=0 ; k<word[i].length() ; k++) {
//					word_[i][index-word[i].length()+k]=temp[k];
//				}
//			} else {
//				word_[i]=word[i].split("");
//			}
//		}
//			
//		HashMap<String, Integer> map = new HashMap<>();
//		
//		int number = 9;
//		
//		for(int j = 0 ; j < index ; j++) {
//			for(int i = 0 ; i< words ;i++) {
//				if(!word_[i][j].equals("0") && !map.containsKey(word_[i][j])) {
//					map.put(word_[i][j], number);
//					number--;
//				}
//			}
//		}
//
//		for(int i = 0 ; i< words ;i++) {
//			for(int j = 0 ; j < index ; j++) {
//				System.out.print(map.get(word_[i][j])+" ");
//			}
//			System.out.println();
//		}
//		
//		int sum = 0;
//		for(int i = 0 ; i< words ;i++) {
//			String temp2 = "";
//			for(int j = 0 ; j < index ; j++) {
//				if(map.get(word_[i][j]) != null) {
//					temp2+=map.get(word_[i][j]);
//				}
//			}
//			sum += Integer.parseInt(temp2);
//		}
//		
//		
	}
	
	public static int jisu(int index) {
		
		int number = 1;
		
		for(int i = 0 ; i< index; i++) {
			number*=10;
		}
		return number;
	}
}


