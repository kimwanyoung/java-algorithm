package algorithm.programmers.영어끝말잇기;


import java.util.Stack;

public class Solution {
    static Stack<String> wordStack = new Stack<>();

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        for (String word : words) {
            if (isDuplicateWord(word) || isOneLetter(word) || !isMatchingWords(word)) {
                wordStack.push(word);
                break;
            }
            wordStack.push(word);
        }

        answer[0] = calculateCurrentPlayer(n);
        answer[1] = calculatePlayerIndex(n);
        return answer;
    }

    private boolean isDuplicateWord(String word) {
        if (wordStack.isEmpty()) {
            return false;
        }

        return wordStack.contains(word);
    }

    private boolean isOneLetter(String word) {
        return word.length() == 1;
    }

    private boolean isMatchingWords(String word) {
        if (wordStack.isEmpty()) {
            return true;
        }

        String prevWord = wordStack.peek();
        char prevWordLastLetter = prevWord.charAt(prevWord.length() - 1);
        char currentWordFirstLetter = word.charAt(0);

        return prevWordLastLetter == currentWordFirstLetter;
    }

    private int calculatePlayerIndex(int playerTotalCount) {
        int wordsSize = wordStack.size();
        while (wordsSize % playerTotalCount != 0) {
            wordsSize++;
        }
        return wordsSize / playerTotalCount;
    }

    private int calculateCurrentPlayer(int playerTotalCount) {
        if (wordStack.size() % playerTotalCount == 0) {
            return playerTotalCount;
        }

        return wordStack.size() % playerTotalCount;
    }
}
