package net.youngrok.codility.lesson.leader;

import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DominatorTest {

	private Dominator testTarget;

	@Before
	public void before() {
		testTarget = new Dominator();
		System.out.println("---- Dominator started ----");
	}

	@Test
	public void example() {
		int[] A = { 3, 4, 3, 2, 3, -1, 3, 3 };
		test(A, 0);
	}

	@After
	public void after() {
		testTarget = new Dominator();
		System.out.println("---- Dominator finished ----");
	}

	public void test(int[] A, int expectedResult) {
		System.out.println("A:            : " + Arrays.toString(A));

		int result = testTarget.solution(A);

		System.out.println("ExpectedResult: " + expectedResult);
		System.out.println("Result        : " + result);

		Assert.assertEquals(result, expectedResult);
	}
}
