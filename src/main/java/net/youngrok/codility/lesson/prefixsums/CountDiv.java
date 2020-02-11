package net.youngrok.codility.lesson.prefixsums;

/*
 * https://codility.com/demo/results/training3DEKZK-X68/
 */
public class CountDiv {

	public int solution(int A, int B, int K) {
		int first = A / K * K;
		if (first != A) {
			first += K;
		}

		int last = B / K * K;

		int result;
		if (first > last) {
			result = 0;
		} else {
			result = (last - first) / K + 1;
		}

		return result;
	}
}
