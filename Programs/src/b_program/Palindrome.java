package b_program;

public class Palindrome {

	
	public static void palindromeString(String str) {
		String rev= "";
		for(int i=str.length()-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		
		if(rev.equals(str)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
	
	public static void palindromeNumber(int OrgNumber) {
		int reverse=0;
		int number= OrgNumber;
		
		while(number!=0) {
			reverse = reverse*10+number%10;
			number=number/10;
		}
		
		if(OrgNumber==reverse) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
	
	
	public static void main(String[]args) {
		
		//palindromeString("1234321");
		palindromeNumber(12321);
	}
}
