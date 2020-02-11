package net.youngrok.codility.lesson.prefixsums;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountDivTest {
	private CountDiv testTarget;

	@Before
	public void before() {
		testTarget = new CountDiv();
		System.out.println("---- CountDivTest started ----");
	}

	@Test
	public void basic() {
		int A = 6;
		int B = 11;
		int K = 2;
		test(A, B, K, 3);
	}

	@After
	public void after() {
		System.out.println("---- CountDivTest finished ----");
	}

	public void test(int A, int B, int K, int expectedResult) {
		System.out.println(String.format("A:%d, B:%d, K:%d", A, B, K));

		int result = testTarget.solution(A, B, K);

		System.out.println("ExpectedResult: " + expectedResult);
		System.out.println("Result        : " + result);

		Assert.assertEquals(result, expectedResult);
	}
}
