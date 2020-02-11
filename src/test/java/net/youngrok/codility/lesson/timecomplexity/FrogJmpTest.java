package net.youngrok.codility.lesson.timecomplexity;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrogJmpTest {
	private FrogJmp testTarget;

	@Before
	public void before() {
		testTarget = new FrogJmp();
		System.out.println("---- FrogJmpTest started ----");
	}

	@Test
	public void basic() {
		int X = 10;
		int Y = 85;
		int D = 30;
		test(X, Y, D, 3);
	}

	@After
	public void after() {
		System.out.println("---- FrogJmpTest finished ----");
	}

	public void test(int X, int Y, int D, int expectedResult) {
		System.out.println(String.format("X:%d, Y:%d, D:%d", X, Y, D));

		int result = testTarget.solution(X, Y, D);

		System.out.println("ExpectedResult: " + expectedResult);
		System.out.println("Result        : " + result);

		Assert.assertEquals(result, expectedResult);
	}
}
