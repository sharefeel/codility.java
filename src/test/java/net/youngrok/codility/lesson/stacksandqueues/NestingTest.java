package net.youngrok.codility.lesson.stacksandqueues;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NestingTest {
	private Nesting testTarget;
	private NestingRecursion testTargetRecursion;
	private NestingStack testTargetStack;

	@Before
	public void before() {
		testTarget = new Nesting();
		System.out.println("---- NestingTest started ----");
	}

	@Test
	public void basic() {
		String S = "(()(())())";
		test(S, 1);
	}

	@After
	public void after() {
		System.out.println("---- NestingTest finished ----");
	}

	public void test(String S, int expectedResult) {
		System.out.println("S             : " + S);

		int result = testTarget.solution(S);

		System.out.println("ExpectedResult: " + expectedResult);
		System.out.println("Result        : " + result);

		Assert.assertEquals(result, expectedResult);
	}
}
