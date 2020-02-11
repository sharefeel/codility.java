package net.youngrok.codility.lesson.timecomplexity;

/*
 * https://codility.com/demo/results/trainingXHB38T-45C/#task-0
 */

public class FrogJmp {
	public int solution(int X, int Y, int D) {

		int result = (Y - X) / D;
		if (Y != X + result * D) {
			result++;
		}

		return result;
	}
}
