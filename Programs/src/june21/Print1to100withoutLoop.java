package june21;

public class Print1to100withoutLoop {

	
	static void printNumbers(int num) {
		if(num<=100) {
			System.out.println(num+"");
			printNumbers(num+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		printNumbers(1);

	}

}
