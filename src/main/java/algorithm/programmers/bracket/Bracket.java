package algorithm.programmers.bracket;

import java.util.Stack;

public class Bracket {

    boolean solution(String s) {
        char leftBracket = '(';
        char rightBracket = ')';
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == leftBracket) {
                stack.push(leftBracket);
            }

            if (s.charAt(i) == rightBracket) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
