package algorithm.programmers.carddeck;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CardDeck {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		Queue<String> firstCardDeck = new LinkedList<>(List.of(cards1));
		Queue<String> secondCardDeck = new LinkedList<>(List.of(cards2));
		String answer = "Yes";

		for(String word : goal) {
			String firstCardWord = firstCardDeck.peek();
			String secondCardWord = secondCardDeck.peek();

			if(word.equals(firstCardWord)) {
				firstCardDeck.poll();
			} else if(word.equals(secondCardWord)) {
				secondCardDeck.poll();
			} else {
				answer = "No";
				break;
			}
		}

		return answer;
	}
}
