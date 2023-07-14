package c_program;

public class Char_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "aaabbbbcccd";
		int count =0;
		char temp=str.charAt(0);
		for(int i=0;i<str.length();i++) {
			
			
			if(str.charAt(i)==temp) {
				count++;
			}
			else {
				System.out.println(temp+""+count);
				count=1;
				temp=str.charAt(i);
			}
		}
	}

}
