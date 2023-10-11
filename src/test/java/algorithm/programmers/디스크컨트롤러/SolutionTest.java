package algorithm.programmers.디스크컨트롤러;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        //given
        int[][] jobs = {{0, 3},{1, 9},{2, 6}};
        int result = 9;

        //when
        int answer = s.solution(jobs);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }
}
