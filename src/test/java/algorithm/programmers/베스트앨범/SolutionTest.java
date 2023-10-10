package algorithm.programmers.베스트앨범;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();
    @Test
    void solution() {
        //given
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] result = {4, 1, 3, 0};

        //when
        int[] answer = s.solution(genres, plays);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
