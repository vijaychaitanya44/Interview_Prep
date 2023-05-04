package pack1.program;

public class A1_StringReverse {

	public String reverse(String str) {
			String temp ="";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp+str.charAt(i);
		}
		str = temp;
		return str;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1_StringReverse s = new A1_StringReverse();
		System.out.println(s.reverse("Bananana"));
				
	}

}
