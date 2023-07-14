package b_program;

public class NumberOfWords {

	static int countWords(String sentence) {
		int count;
		String trim = sentence.trim();
		if (trim.isEmpty()) {
			return 0;
		} else {
			count = trim.split(" ").length;
			return count;
		}
	}

	public static void main(String[] args) {
		String sent = "''";
		String trim = sent.trim();
		int count;
		if (trim.isEmpty()) {
			System.out.println("no sentence");
		} else {
			count = trim.split(" ").length;
			System.out.println(count);
		}
		
		
		System.out.println(countWords(" Apple ball bat hot shoot "));

	}
}
