package net.youngrok.codility.lesson.stacksandqueues;

/*
 * https://app.codility.com/demo/results/trainingEK4X2N-PGP/
 */
public class NestingRecursion {
    public int solution(String S) {
        int count = isNested(S, 0, 0);
        return (count == 0) ? 1 : 0;
    }

    public int isNested(String s, int position, int count) {
        if (position == s.length() || count < 0) {
            return count;
        }

        char c = s.charAt(position);
        if (c == '(') {
            return isNested(s, position + 1, count + 1);
        } else {
            return isNested(s, position + 1, count - 1);
        }
    }
}
