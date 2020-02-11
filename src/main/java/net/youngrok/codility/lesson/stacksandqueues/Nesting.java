package net.youngrok.codility.lesson.stacksandqueues;

/*
 * https://codility.com/demo/results/trainingFNAMV3-CHD/
 */
public class Nesting {

	public int solution(String s) {
		if (s.length() == 0) {
			return 1;
		}

		int depth = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				depth++;
			} else {
				depth--;
			}
			
			if (depth < 0) {
				return 0;
			}
		}

		return (depth == 0) ? 1 : 0;
	}
}