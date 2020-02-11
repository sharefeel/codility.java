package net.youngrok.codility.lesson.iteration;

/*
 * Result : https://codility.com/demo/results/training6VVAV3-T6F/
 */

public class BinaryGap {
	public int solution(int N) {
		int n = 1;
		int last1 = -1;
		int maxGap = 0;
		for (int i = 0; i < 32; i++) {
			if ((N & n) == n) {
				if (last1 == -1) {
					last1 = i;
				} else {
					int gap = i - last1 - 1;
					if (gap > maxGap) {
						maxGap = gap;
					}
					last1 = i;
				}
			}
			n <<= 1;
		}
		return maxGap;
	}
}
