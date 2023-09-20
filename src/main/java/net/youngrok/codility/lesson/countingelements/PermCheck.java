package net.youngrok.codility.lesson.countingelements;

/*
 * Result : https://app.codility.com/demo/results/training92SSSG-BSN/
 */

import java.util.Arrays;
import java.util.Objects;

public class PermCheck {
	public static final int MAX_A = 1000000000;
	public static final int MIN_A = 1;
	private static final int OK = 1;
	private static final int NOT_OK = 0;

	public int solution(int[] A) {
		if (Objects.isNull(A) || A.length == 0) {
			return NOT_OK;
		}

		boolean [] resultBucket = new boolean[A.length];
		Arrays.fill(resultBucket, false);

		for (int value : A) {
			int position = value - 1;
			if (position < 0 || position >= A.length) {
				return NOT_OK;
			}
			resultBucket[position] = true;
		}

		// If empty bucket element exist, then not permutation
		for (boolean result : resultBucket) {
			if (!result) {
				return NOT_OK;
			}
		}

		return OK;
	}
}
