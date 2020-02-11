package net.youngrok.codility.lesson.arrays;

/*
 * https://codility.com/demo/results/training6QGBSS-523/
 */

public class OddOccurrencesInArray {
	public int solution(int[] A) {
		int result = 0;

		for (int odd :  A) {
			result ^= odd;
		}

		return result;
	}
}
