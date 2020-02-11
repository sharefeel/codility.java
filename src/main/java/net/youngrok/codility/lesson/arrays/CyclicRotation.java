package net.youngrok.codility.lesson.arrays;

/*
 * https://codility.com/demo/results/trainingN52H3V-9J7/
 */

public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		
		if (A.length == 0) {
			return new int[0];
		}
		
		int[] result = new int[A.length];

		int rotate = K % A.length;

		for (int i = 0; i < A.length; i++) {
			result[(i + rotate) % A.length] = A[i];
		}

		return result;
	}
}
