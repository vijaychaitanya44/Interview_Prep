package june21;

public class RemoveDuplicates {
	
	
	public static void main(String[]args) {
		
		
		int arr[]= {3,4,5,1,3,4,5,6,9,6,8,1,6,8,0};
		//int arr[]= {1,2,3,4,5,2,3,4,8,9};
		
		
		for(int i=0;i<arr.length;i++) {
			boolean dupli=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					dupli=true;
				}
			}
			if(!dupli) {
				System.out.println(arr[i]);
			}
		}
	}

}
