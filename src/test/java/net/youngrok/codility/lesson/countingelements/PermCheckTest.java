package net.youngrok.codility.lesson.countingelements;

import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermCheckTest {
	PermCheck testTarget;

	@Before
	public void before() {
		testTarget = new PermCheck();
		System.out.println("---- PermCheckTest started ----");
	}

	@Test
	public void valid() {
		int[] A = { 4, 1, 2, 3 };
		test(A, 1);
	}

	@Test
	public void hole() {
		int[] A = { 4, 2, 1 };
		test(A, 0);
	}

	@Test
	public void all1() {
		int[] A = { 1, 1, 1, 1 };
		test(A, 0);
	}

	@Test
	public void noValue() {
		int[] A = {};
		test(A, 0);
	}

	@Test
	public void twoValue() {
		int[] A = { 1, 2 };
		test(A, 1);
	}

	@Test
	public void max() {
		int[] A = { PermCheck.MAX_A };
		test(A, 0);
	}

	@Test
	public void min() {
		int[] A = { PermCheck.MIN_A };
		test(A, 1);
	}

	private void test(int[] A, int expectedResult) {
		System.out.println("A             : " + Arrays.toString(A));
		int result = testTarget.solution(A);

		System.out.println("ExpectedResult: " + expectedResult);
		System.out.println("Result        : " + result);

		Assert.assertEquals(result, expectedResult);
	}

	@After
	public void after() {
		System.out.println("---- PermCheckTest finished ----");
	}
}
