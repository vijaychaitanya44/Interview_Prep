package c_program;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String duplicate="";
		String s="applicationform";
		
		char ch[]=s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					if(count>=1) {
						duplicate= duplicate+ch[j];
					}
				}
			}
		}System.out.println(duplicate);
	}

}
