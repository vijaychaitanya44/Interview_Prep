package b_program;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			
			int ar1[] = { 3, 4, 2, 3, 2, 1, 44, 4, 57, 1, 3, 4, 3 };

			int size = ar1.length;
			//int i, j, count=0 ;
			for (int i = 0; i < size; i++) {
				boolean duplicate = false;
				for (int j = 0; j < i; j++) {
					

					if (ar1[i] == ar1[j]) {
						duplicate = true;
						
					}
				}
				if (!duplicate) {
					System.out.println(ar1[i] + " " );
				}
			}
		}
	}


