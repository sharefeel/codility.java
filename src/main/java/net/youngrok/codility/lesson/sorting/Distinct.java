package net.youngrok.codility.lesson.sorting;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codility.com/demo/results/training9B6KKK-3JD/
 */

public class Distinct {
    public int solution(int[] A) {
        Set<Integer> intSet = new HashSet<Integer>();
        for (int a : A) {
            intSet.add(a);
        }
        return intSet.size();
    }
}
