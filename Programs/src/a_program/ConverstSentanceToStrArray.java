package a_program;

public class ConverstSentanceToStrArray {

	public static void convert() {
	String sent ="Apple is the first object of the Aphabet";
	
	String arr[]=sent.split(" ");
	int count = sent.split(" ").length;
	for(String s:arr) {
		System.out.println(s +count);
		
	}
}
	
public static void main(String[]args) {
	
convert();
}
}
