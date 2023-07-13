package june21;

public class DoorsProgram {
	
	public static void printDoorStatus(int doorNo) {
		boolean doors[] = new boolean[101];

		for (int i = 1; i < doors.length; i++) {

			for (int j = i; j < doors.length; j++) {

				if (j % i == 0) {
					//System.out.println(j);
					doors[j] = !doors[j];
				}
			}
		}
		
		for(int i=1;i<doors.length;i++) {
			if(doors[i]==true) {
				//System.out.println("door "+i+" is open");
			}
			else{
				//System.out.println("door "+i+" is closed");
			}
		}
		
		if(doors[doorNo]==true) {
			System.out.println("door "+doorNo+" is open");
		}
		else{
			System.out.println("door "+doorNo+" is closed");
		}
	}

	public static void main(String[] args) {

		printDoorStatus(99 );
	}
}