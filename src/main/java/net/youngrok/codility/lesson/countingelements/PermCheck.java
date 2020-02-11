package net.youngrok.codility.lesson.countingelements;

/*
 * Scored 70. Why?
 * Result : https://codility.com/demo/results/trainingCYX5Z4-P86/
 */

import java.util.Arrays;

public class PermCheck {
	public static final int MAX_A = 1000000000;
	public static final int MIN_A = 1;
	private static final int OK = 1;
	private static final int NOT_OK = 0;

	public int solution(int[] A) {
		if (!validateParameter(A)) {
			return NOT_OK;
		}

		int max = max(A);
		int min = min(A);

		int width = max - min + 1;
		if (width != A.length) {
			return NOT_OK;
		}

		/*
		 *  Create bucket to check permuattion
		 *  Space complexity : O(N)
		 */
		boolean[] resultBucket = new boolean[width];
		Arrays.fill(resultBucket, false);

		/*
		 * Fill bucket of each number;
		 * If array A is permutation, all bucket element will be set to true;
		 */
		for (int value : A) {
			int position = value - min;
			if (position < 0 || position > resultBucket.length - 1) {
				return NOT_OK;
			}
			resultBucket[value - min] = true;
		}

		// If empty bucket element exist, then not permutation
		for (boolean result : resultBucket) {
			if (result != true) {
				return NOT_OK;
			}
		}

		return OK;
	}

	private static boolean validateParameter(int[] A) {
		if (A.length < 1) {
			return false;
		}

		for (int value : A) {
			if (value < MIN_A || value > MAX_A) {
				return false;
			}
		}

		return true;
	}

	private static int max(int[] A) {
		int max = MIN_A;
		for (int v : A) {
			max = Math.max(max, v);
		}
		return max;
	}

	public static int min(int[] A) {
		int min = MAX_A;
		for (int v : A) {
			min = Math.min(min, v);
		}
		return min;
	}
}
