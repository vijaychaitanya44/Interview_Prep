package pack1.program;

public class A1_StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Vijay";
		String s2 = "Chaitanya";
		
		
		s1 = s1+s2;
		
		s2 = s1.substring(0,s1.length()-s2.length());
		
		System.out.println("S2 = "+s2);
		s1 = s1.substring(s2.length());

		System.out.println("S1 = "+s1);

	}

}
