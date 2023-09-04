package algorithm.programmers.walkinthepark;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WalkInTheParkTest {

	WalkInThePark walkInThePark = new WalkInThePark();

	@Test
	void 공원산책_장애물X() {
		//given
		String[] park = {"SOO", "OOO", "OOO"};
		String[] routes = {"E 2", "S 2", "W 1"};
		int[] result = {2, 1};

		//when
		int[] answer = walkInThePark.solution(park, routes);

		//then
		assertThat(answer).isEqualTo(result);
	}

	@Test
	void 공원산책_장애물O() {
		//given
		String[] park = {"SOO", "OXX", "OOO"};
		String[] routes = {"E 2", "S 2", "W 1"};
		int[] result = {0, 1};

		//when
		int[] answer = walkInThePark.solution(park, routes);

		//then
		assertThat(answer).isEqualTo(result);

	}
}
