package algorithm.programmers.pairremove;

import java.util.Stack;

public class PairRemove {
    public int solution(String s) {
        char[] charArr = s.toCharArray();
        Stack<Character> charStack = new Stack<>();

        for (int i = 0 ; i< charArr.length; i++) {
            char c = charArr[i];

            if(charStack.isEmpty()) {
                charStack.push(c);
            } else {
                if(charStack.peek() == c) {
                    charStack.pop();
                } else {
                    charStack.push(c);
                }
            }
        }


        return charStack.isEmpty() ? 1 : 0;
    }
}
