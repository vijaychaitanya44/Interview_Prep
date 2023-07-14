package june21;

public class BubbleSort {

	static  void sorting (int[] array,int largest) {
		int temp;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}	
		}
		System.out.println("Sorted array: ");
	for(int a:array) {
			System.out.println(a);
	}
		System.out.println(largest+ " largest number is: "+array[array.length-largest]);
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {89,21,55,1,80,2,7,17,99,3,100};
	sorting(array,1);

		
}

}
