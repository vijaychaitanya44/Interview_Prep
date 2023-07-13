package dsa;

import java.util.Arrays;

public class LinearSearch {

	static int search(int arr[], int target) {

		if (arr.length == 0) {
			return 0;
		}

		for (int index = 0; index < arr.length; index++) {

			if (target == arr[index]) {

				return index;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { -1, 6, 9, 23, 4, 7, 10, -33, 78, 91, 32, 11, 4 };

		System.out.println(search(arr, 10));
		
		//Arrays.

	}
}
