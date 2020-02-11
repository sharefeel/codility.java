package net.youngrok.codility.lesson.sorting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DistinctTest {
    private Distinct testTarget;
    @Before
    public void before(){
        testTarget = new Distinct();
    }

    @Test
    public void basic() {
        int[] array = {1,2,3,4,1,2,3,4};
        int expectedResult = 4;
        test (array, expectedResult);
    }

    private void test(int[] N, int expectedValue) {
        int value = testTarget.solution(N);
        Assert.assertEquals(value, expectedValue);
    }

    @After
    public void after() {
    }
}
