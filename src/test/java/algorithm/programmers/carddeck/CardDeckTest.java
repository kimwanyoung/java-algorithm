package algorithm.programmers.carddeck;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CardDeckTest {

	@Test
	void 카드뭉치_YES() {
		//given
		CardDeck deck = new CardDeck();
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};

		//when
		String result = deck.solution(cards1, cards2, goal);

		//then
		Assertions.assertThat(result).isEqualTo("Yes");
	}

	@Test
	void 카드뭉치_NO() {
		//given
		CardDeck deck = new CardDeck();
		String[] cards1 = {"i", "water", "drink"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};

		//when
		String result = deck.solution(cards1, cards2, goal);

		//then
		Assertions.assertThat(result).isEqualTo("No");
	}
}
