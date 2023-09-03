package algorithm.programmers.runningrace;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RunningRaceTest {

	@Test
	void 달리기_경주() {
		//given
		RunningRace race = new RunningRace();
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		String[] result = {"mumu", "kai", "mine", "soe", "poe"};

		//when
		String[] answer = race.solution(players, callings);

		//then
		assertThat(answer).isEqualTo(result);
	}
}
