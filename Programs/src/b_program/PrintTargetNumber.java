package b_program;

public class PrintTargetNumber {

	public static void printPairs(int[]arr,int tar) {

		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
			if(arr[i]+arr[j]==tar) {
				
				System.out.println("Pair is "+arr[i]+","+arr[j]);
				count++;
			}
			}
			
		}System.out.println("total pairs: "+count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		printPairs(arr, 15);

	}

}
