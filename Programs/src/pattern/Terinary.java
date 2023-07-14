package pattern;

public class Terinary {

	static void teri(int n) {
		
		int res= (int) (n>100?n<50:n); 
		System.out.println(res);
		
	}
	
	static void evenOrOdd(int n) {
		n= n;
		
		boolean result = (n%2==0)? true:false;
		System.out.println(result);
	}
	
	public static void main(String[]args) {
		
		teri(10);
		
		evenOrOdd(2);
	}
}
