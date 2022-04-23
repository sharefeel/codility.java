package net.youngrok.codility.lesson.arrays;

/*
 * 이 문제는 웹에서 본 솔루션에 감탄해서 복사해둔 것이다.
 * ^= 으로 풀 생각을 하다니.. 아마 나는 아무리 시간을 써도 O(N)에는 못풀었을 것이다.
 *
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
