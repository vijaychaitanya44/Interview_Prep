package c_program;

import java.util.LinkedHashSet;
import java.util.Set;

public class SubStringCount {
	
	static int subStrCount(String str) {
	
		if(str.isEmpty()) {
			return 0;
		}
		
		int maxlen= Integer.MIN_VALUE;
		
		
		for(int i=0;i<str.length();i++) {
			String s="";
			Set <Character> se = new LinkedHashSet<>();
			
			for(int j=0;j<str.length();j++) {
				
				if(se.contains(str.charAt(j))) {
					
					maxlen = Math.max(maxlen, j-i);
					break;
				}
				else {
					se.add(str.charAt(j));
				}
			}for(char c:se) {
				s= s+c;
			}
			System.out.println(s);
			break;
		}
		return maxlen;
	}
	
	public static void main(String []args) {
		System.out.println(subStrCount("TakeUforward"));
	}

}
