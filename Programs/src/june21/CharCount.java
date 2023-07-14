package june21;

public class CharCount {

	public static void main(String []args) {
		
		String s = "aaaabbcccd";
		
		char temp = s.charAt(0);
		int count =0;
		for(int i=0;i<s.length();i++) {
		
			if(s.charAt(i)==temp) {
				count++;
			}
			else {
			System.out.println(temp+""+count);
			count=1;
			temp=s.charAt(i);
			}	
		}System.out.println(temp+""+count);
	}
}
