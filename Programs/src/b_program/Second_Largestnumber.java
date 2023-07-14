package b_program;

public class Second_Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {23,44,64,1,34,90,34,11,56};
		int temp;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(arr[arr.length-4]);
		for(int n:arr) {
			System.out.println(n);
		}
		
		
	}

}
