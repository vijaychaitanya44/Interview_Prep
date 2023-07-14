package b_program;

public class PrintWantedLargestNumber {

	
	public static int largestNumber(int arr[],int largest) {
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
				temp =arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			}
		}
	}	System.out.println("given "+largest+" largest number is: ");
		return arr[arr.length-largest];
}
	
public static void main(String[]args) {
	int arr[]= {4,6,7,7,1,2,3,8,22};
	System.out.println(largestNumber(arr, 2));
	}
}
