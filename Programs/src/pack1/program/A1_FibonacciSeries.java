package pack1.program;

import java.util.Scanner;

public class A1_FibonacciSeries {

	public void fibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values of fibonacci: ");
		int num = sc.nextInt();
		
		int a=0;int b=1;
		int sum=0;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int n=2;n<num;n++) {
			
			sum=a+b;
			System.out.print(sum+" ");
			a =b;
			b= sum;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1_FibonacciSeries a = new A1_FibonacciSeries();
		
		a.fibonacci();
	}

}
