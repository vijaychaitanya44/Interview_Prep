package a_program;

public class StringReverse {

	static String reverse(String input) {
		String orignal=input.trim();
		String reverse="";
		
		if(orignal.length()==0) {
			return null;
		}
		
		for(int i=orignal.length()-1;i>=0;i--) {
			reverse = reverse+orignal.charAt(i);
		}
		
		return reverse;
		
	}
	
	public static void main(String[]args) {
		
		System.out.println(reverse("Ball ll"));
	}
}
