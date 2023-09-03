package algorithm.programmers.memoryscore;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithm.programmers.memoryscore.MemoryScore;

class SolutionTest {

	@Test
	public void 추억_점수() {
		//given
		MemoryScore memoryScore = new MemoryScore();

		String[] names = {"may", "kein", "kain", "radi"};
		int[] scores = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"},
			{"kon", "kain", "may", "coni"}};

		//when
		int[] answer = memoryScore.solution(names, scores, photo);

		//then
		assertThat(answer).isEqualTo(new int[] {19, 15, 6});
	}

}
