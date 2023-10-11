package algorithm.programmers.더맵게;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();
    @Test
    void solution() {
        //given
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int result = 2;

        //when
        int answer = s.solution(scoville, K);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }
}
