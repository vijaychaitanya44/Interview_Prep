package b_program;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word ="opportunity";
		String dupli ="";
		
		Set<Character> chs = new LinkedHashSet<>();
		char []dup = word.toCharArray();
		
		for(int i=0;i<word.length();i++) {
			int count =0;
			for(int j=0;j<word.length();j++) {
				if(dup[i]==dup[j]) {
					count++;
					if(count>=1) {
						chs.add(dup[i]);
					}
				}
			}
		}
		for(char c:chs) {
			dupli = dupli+c;
		}
		System.out.println(dupli);
	}

}
