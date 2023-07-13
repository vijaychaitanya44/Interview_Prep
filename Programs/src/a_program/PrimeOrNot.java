package a_program;

public class PrimeOrNot {

	static boolean primeOrNot(int number) {
		int count = 0;
		for (int n = 1; n <= number; n++) {
			if (number % n == 0) {
				count++;
			}
		}
		if(count ==2) {
			return true;}
		return false;
		

	}
	
		
	

	public static void main(String[]args) {
		
		;System.out.println(primeOrNot(27));
	}
}
