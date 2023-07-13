package b_program;

public class Fibonocci {
	
	
	public static void series(int count) {
		
		int n1 =0;
		int n2=1;
		int n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<count;i++) {
			
			n3=n2+n1;
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		series(20);

	}

}
