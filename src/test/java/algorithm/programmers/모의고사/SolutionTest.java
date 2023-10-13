package algorithm.programmers.모의고사;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();
    @Test
    void solution() {
        //given
        int[] answers = {1,2,3,4,5};
        int[] result = {1};

        //when
        int[] answer = s.solution(answers);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }

    @Test
    void solution2() {
        //given
        int[] answers = {1,3,2,4,2};
        int[] result = {1,2,3};

        //when
        int[] answer = s.solution(answers);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
