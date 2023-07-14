package b_program;

public class RemoveDuplicatesNumber {
	
	public static void main(String[]args) {
		
		
		//int arr[]= {5,6,2,1,3,2,5,4,3,1,1,7,8,};
		int arr[]= {3,4,5,1,3,4,5,6,9,6,8,1,6,8,0};
		
		for(int i=0;i<arr.length;i++) {
			boolean dupli = false;
			for(int j=0;j<i;j++) {
				
				if(arr[i]==arr[j]) {
					dupli = true;
				}
			}
			if(!dupli) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
