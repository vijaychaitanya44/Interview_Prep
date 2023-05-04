package pack1.program;

import java.util.Scanner;

public class A1_SumOfIntegers {

	public static int sum() {
		System.out.println("Enter integer: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {

			sum = sum + num % 10;
			num = num / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum());
	}

}
