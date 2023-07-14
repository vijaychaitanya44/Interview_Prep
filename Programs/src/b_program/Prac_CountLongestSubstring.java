package b_program;

import java.util.LinkedHashSet;
import java.util.Set;

public class Prac_CountLongestSubstring {

	static int printSizeSubstring(String str) {

		/// String str = "Pineapple";
		int maxlen = Integer.MIN_VALUE;
		for (int i = 0; i < str.length(); i++) {

			Set<Character> subStr = new LinkedHashSet<>();
			for (int j = i; j < str.length(); j++) {

				if (subStr.contains(str.charAt(j))) {
					maxlen = Integer.max(maxlen, j - i);
					break;
				}
				subStr.add(str.charAt(j));
			}
		}

		return maxlen;

	}

	public static void main(String[] args) {

		System.out.println(printSizeSubstring("logitechcchompany"));

	}
}
