package net.youngrok.codility.lesson.stacksandqueues;

import java.util.Stack;

public class NestingStack {
    public int solutoion(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '(') {
                stack.add(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return 0;
                }
                stack.pop();
            }
        }

        return (stack.size() == 0) ? 1 : 0;
    }
}
