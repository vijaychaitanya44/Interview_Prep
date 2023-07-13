package b_program;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sent = "GeeksForgeeks";
		
		HashMap<Character,Integer> charCounter = new LinkedHashMap<>();
		char [] arr1 = new char[sent.length()];
		for(int i=0;i<sent.length();i++) {
			arr1[i]=sent.charAt(i);
		}
		
		for(int i=0;i<sent.length();i++) {
			int count =0;
			for(int j=1;j<sent.length();j++) {
				if(arr1[i]==arr1[j]) {
					count++;
				}
				charCounter.put(arr1[i], count);
			}	
		}
		
		System.out.println(charCounter.entrySet());
		System.out.println(charCounter.keySet());
		System.out.println(charCounter.values());
		
		
		for(int i=0;i<charCounter.size();i++) {
			System.out.println(charCounter.keySet());
		}
	}
}
