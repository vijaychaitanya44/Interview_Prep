package b_program;

import java.util.ArrayList;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "abcd";
		int n = word.length();

		// System.out.println(word.substring(0,1));
		ArrayList<String> li = new ArrayList<>();
		int total = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				System.out.println(total);
				System.out.println(word.substring(i, j));
				li.add(word.substring(i, j));
				total++;
			}
		}
		System.out.println(total);
		System.out.println(li);

	}
}
