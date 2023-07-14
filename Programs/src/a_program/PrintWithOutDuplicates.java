package a_program;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintWithOutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "applicationform";
		String nodupli="";
		char []ch = str.toCharArray();
		
		Set<Character> chs = new LinkedHashSet<>();
		
		for(char c:ch) {
			chs.add(c);
		}
		
		for(char a: chs) {
			nodupli = nodupli +a;
		}
		
		System.out.println(nodupli);
		
	}

}
