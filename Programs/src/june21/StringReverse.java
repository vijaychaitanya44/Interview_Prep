package june21;

public class StringReverse {

	public static String reverse(String str) {
		if(str.length()==0||str.length()==1) {
			return " not a valid string";
		}
		
		String rev="";
			
			for (int i=str.length()-1;i>=0;i--) {
				rev = rev+ str.charAt(i);
			}
			
		return rev;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse("JumpingJack"));
	}

}
