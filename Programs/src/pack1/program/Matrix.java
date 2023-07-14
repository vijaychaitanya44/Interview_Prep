package pack1.program;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int columns = sc.nextInt();

		int arr[][] = new int[rows][columns];

		System.out.println("Enter matrix details");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

		for(int j=0;j<columns;j++) {
			for(int i=0;i<rows;i++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
