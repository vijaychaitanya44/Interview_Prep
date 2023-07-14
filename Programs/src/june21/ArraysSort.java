package june21;

import java.util.Arrays;

public class ArraysSort {

	
	public static void main(String[]args) {
		
		
		int arr[]= {3,1,2,-1,5,-9,8,0,4,7};
		
		Arrays.sort(arr);
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
