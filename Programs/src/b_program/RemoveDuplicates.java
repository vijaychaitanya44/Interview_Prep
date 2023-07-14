package b_program;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cd = "ApplicationForm";
		String ac="";
		Set<Character> ch = new LinkedHashSet<>();
		
		for(int i=0;i<cd.length();i++) {
			ch.add(cd.charAt(i));
		}
		
	//System.out.println(ch.toString());
		//System.out.println(ch.size());
		for(char c:ch) {
			System.out.println(c);
			ac = ac+ c;
	}
		System.out.println(ac);
	}
}
