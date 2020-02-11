package net.youngrok.codility.lesson.iteration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {
	private BinaryGap testTarget;

	@Before
	public void before() {
		testTarget = new BinaryGap();
		System.out.println("---- BinaryGapTest started ----");
	}

	@Test
	public void basic() {
		test(529, 4);
	}

	@Test
	public void only0() {
		test(0, 0);
	}

	@Test
	public void only1() {
		test(16777215, 0);
	}

	@Test
	public void intMax() {
		test(Integer.MAX_VALUE, 0);
	}

	@Test
	public void negative() {
		test(-1, 0);
	}

	@Test
	public void endWith0() {
		test(34, 3);
	}

	@After
	public void after() {
		System.out.println("---- BinaryGapTest finished ----");
	}

	private void test(int N, int expectedResult) {
		System.out.println("N             : " + N + " (" + Integer.toBinaryString(N) + ")");

		int result = testTarget.solution(N);

		System.out.println("ExpectedResult: " + result);
		System.out.println("Result        : " + result);

		Assert.assertEquals(result, expectedResult);
	}
}