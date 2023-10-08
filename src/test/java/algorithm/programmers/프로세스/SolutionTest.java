package algorithm.programmers.프로세스;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        //given
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int result = 1;

        //when
        int answer = s.solution(priorities, location);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }

    @Test
    void solution_2() {
        //given
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int result = 5;

        //when
        int answer = s.solution(priorities, location);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
