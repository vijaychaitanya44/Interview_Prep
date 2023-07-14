package a_program;

public class OnlyDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String duplicate="";
		String str= "applicationform";
		char ch[]= str.toCharArray();
		int count;
		for(int i=0;i<str.length();i++) {
			count =0;
			for(int j=0;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					if(count>=2) {
						duplicate=duplicate+ch[j];
					}
				}
				
			}System.out.println(duplicate);
		}
		
	}

}
