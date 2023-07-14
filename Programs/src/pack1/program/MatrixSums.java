package pack1.program;

import java.util.Scanner;

public class MatrixSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of Columns: ");
		int cols = sc.nextInt();
System.out.println("Enter values for matrix: ");
		int mat1[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			int rowSum=0;
			for (int j = 0; j < cols; j++) {
				
				rowSum = rowSum+mat1[i][j];
					
				}
			System.out.println("sum of row "+(i+1)+" :"+rowSum);
			}
			System.out.println();
			for (int i = 0; i < rows; i++) {
				int colSum=0;
				for (int j = 0; j < cols; j++) {
					
					colSum = colSum+mat1[j][i];
						
					}
				System.out.println("sum of row "+(i+1)+" :"+colSum);
				}
		}
		
		
		
	}


