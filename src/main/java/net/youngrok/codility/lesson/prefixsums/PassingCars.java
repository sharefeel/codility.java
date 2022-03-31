package net.youngrok.codility.lesson.prefixsums;

/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
 */
public class PassingCars {
    // O(N**2) solution. scores 50 points.
    private static final int COUNT_MAX_MINUS_1 = 999999999;
    public int solution_50(int[] A) {
        int cnt = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == 1) {
                    if (cnt == COUNT_MAX_MINUS_1) {
                        return -1;
                    }
                    cnt++;
                }
            }
        }
        return cnt;
    }

    /**
     * O(N) solution. scores 100 points
     * https://app.codility.com/demo/results/trainingJAUH28-Z77/
     */
    private static final int COUNT_MAX = 1000000000;
    public int solution(int[] A) {
        int count = 0;
        int[] sum = new int[A.length];

        sum[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            sum[i] = sum[i + 1] + A[i];
        }

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == 0) {
                count = count + sum[i];
                if (count > COUNT_MAX) {
                    return -1;
                }
            }
        }

        return count;
    }
}
