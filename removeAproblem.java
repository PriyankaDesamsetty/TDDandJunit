package org.sonatype.examples;

public class removeAproblem {

	public String remove(String word) {
		if (word == "")
			return "";
		if (word.length() == 1) {
			if (word.charAt(0) == 'A')
				return "";
			else
				return "" + word.charAt(0);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 2; i++) {
			if (word.charAt(i) != 'A')
				sb.append(word.charAt(i));
		}
		sb.append(word.substring(2, word.length()));
		return sb.toString();

	}
}
