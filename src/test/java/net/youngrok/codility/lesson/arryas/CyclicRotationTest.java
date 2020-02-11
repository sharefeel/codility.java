package net.youngrok.codility.lesson.arryas;

import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.youngrok.codility.lesson.arrays.CyclicRotation;

public class CyclicRotationTest {
	private CyclicRotation testTarget;

	@Before
	public void before() {
		testTarget = new CyclicRotation();
		System.out.println("---- CyclicRotationTest started ----");
	}

	@Test
	public void basic() {
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		int[] expectedResult = {9, 7, 6, 3, 8};
		test(A, K, expectedResult);
	}

	@After
	public void after() {
		System.out.println("---- CyclicRotationTest finished ----\n");
	}

	private void test(int[] A, int K, int[] expectedResult) {
		System.out.println("A             : " + Arrays.toString(A));
		System.out.println("K             : " + K);

		int [] result = testTarget.solution(A, K);

		System.out.println("ExpectedResult: " + Arrays.toString(expectedResult));
		System.out.println("Result        : " + Arrays.toString(result));
		
		Assert.assertTrue(Arrays.equals(result, expectedResult));
	}
}
