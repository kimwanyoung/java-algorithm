package algorithm.programmers.같은숫자는싫어;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        //given
        int[] arr = {1,1,3,3,0,1,1};

        //when
        int[] result = s.solution(arr);

        //then
        Assertions.assertThat(result).isEqualTo(new int[]{1, 3, 0, 1});
    }
}
