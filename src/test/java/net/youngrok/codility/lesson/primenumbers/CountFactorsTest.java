package net.youngrok.codility.lesson.primenumbers;

import org.junit.Assert;
import org.junit.Test;

public class CountFactorsTest {

    @Test
    public void basic() {
        int A = 4;
        test(A, 3);
    }

    public void test(int A, int expectedResult) {
        System.out.println("A: " + A);

        int result = new CountFactors().solution_bad(A);

        System.out.println("ExpectedResult: " + expectedResult);
        System.out.println("Result        : " + result);

        Assert.assertEquals(expectedResult, result);
    }
}
