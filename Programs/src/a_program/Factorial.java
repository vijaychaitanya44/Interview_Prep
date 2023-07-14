package a_program;

public class Factorial {

	static int numberFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++ ) {
			
			fact = fact *i;
		}
		return fact;
	}
	
	static int fact1(int n) {
		
		int f= n*(n+1)/2;
		
		return f;
		
	}
	
	public static void main(String[]args) {
		
		System.out.println(numberFactorial(6));
		System.out.println(fact1(6));
	}
}
