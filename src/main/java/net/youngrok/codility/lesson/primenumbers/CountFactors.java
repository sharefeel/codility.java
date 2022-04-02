package net.youngrok.codility.lesson.primenumbers;

/**
 * scores 100%
 * https://app.codility.com/demo/results/trainingVHS5PE-7Y4/
 */
public class CountFactors {
    public int solution_bad(int N) {
        int count = 0;
        int sqrtn = (int) Math.sqrt(N);

        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == N) {
                count += 1;
                break;
            }
            if (N % i == 0) {
                count += 2;
            }
        }

        return count;
    }
}
