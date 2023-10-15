package algorithm.programmers.큰수만들기;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void solution() {
        //given
        String number = "1924";
        String result = "94";
        int k = 2;

        //when
        String answer = s.solution(number, k);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }

    @Test
    void solution_1() {
        //given
        String number = "1231234";
        String result = "3234";
        int k = 3;

        //when
        String answer = s.solution(number, k);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }
}
