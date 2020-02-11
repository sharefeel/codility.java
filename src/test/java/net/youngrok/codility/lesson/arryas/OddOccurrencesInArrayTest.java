package net.youngrok.codility.lesson.arryas;

import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.youngrok.codility.lesson.arrays.OddOccurrencesInArray;

public class OddOccurrencesInArrayTest {
	private OddOccurrencesInArray testTarget;

	@Before
	public void before() {
		testTarget = new OddOccurrencesInArray();
		System.out.println("---- OddOccurrencesInArrayTest started ----");
	}
	
	@Test
	public void basic() {
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		testTarget.solution(A);
	}
	
	@After
	public void after() {
		System.out.println("---- OddOccurrencesInArrayTest finished ----\n");
	}
	
	public void test(int[] A, int expectedResult) {
		System.out.println("A             : " + Arrays.toString(A));

		int result = testTarget.solution(A);

		System.out.println("ExpectedResult: " + Integer.toString(expectedResult));
		System.out.println("Result        : " + Integer.toString(result));

		Assert.assertEquals(result, expectedResult);
	}

}
