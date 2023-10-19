package algorithm.programmers.멀리뛰기;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();
    @Test
    void solution() {
        //given
        int n = 4;
        long result = 5L;

        //when
        long answer = s.solution(n);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
