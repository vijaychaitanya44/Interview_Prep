package pattern;

public class Patterns {

	static void pattern1(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	static void pattern2(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	static void pattern3(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=(n+1)-row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	
	static void pattern4(int n) {
		for(int row=1;row<=2*n-1;row++) {
			
			if(row<=n) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			else {
				for(int col=1;col<=2*n-row;col++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern4(5);
	}

}
