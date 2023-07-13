package a_program;

public class NthLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {23,44,5,66,66,23,12,90,45};
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
		
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println(arr[arr.length-2]);
	}

}
