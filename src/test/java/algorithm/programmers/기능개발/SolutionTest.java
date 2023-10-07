package algorithm.programmers.기능개발;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        //given
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] result = {2, 1};

        //when
        int[] answer = s.solution(progresses, speeds);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }
}
