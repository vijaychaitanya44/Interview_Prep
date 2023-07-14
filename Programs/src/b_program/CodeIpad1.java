package b_program;

public class CodeIpad1 {
	
	public static boolean isPalindrome(String s) {
	    String reversed = "";
	    for (int i = s.length()-1; i >= 0; i--) {
	        reversed = reversed+ s.charAt(i);
	    }
	    return s.contentEquals(reversed);
	}

	public static void main(String[]args) {
		
		
		System.out.println(isPalindrome("Apple"));
	}
}
