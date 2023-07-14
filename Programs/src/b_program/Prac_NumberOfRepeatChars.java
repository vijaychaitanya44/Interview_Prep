package b_program;

public class Prac_NumberOfRepeatChars {

	
	public static String repeatChars(String str) {
		//str = "aaabbbccc";
		String counter="";
		int count = 0;
		char temp = str.charAt(0);
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==temp) {
				count++;
			}
			else {
				//counter+=temp+""+count;
				System.out.print(temp+""+count);
				count =1;
				temp= str.charAt(i);
			}
			
		}
		
		
		return temp+""+count;
		
	}
	
	public static void main(String[]args) {
		
		
		System.out.println(repeatChars("aaabbbccc"));
	}
}
