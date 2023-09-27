package algorithm.programmers.숫자짝꿍;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        //given
        String X = "12321";
        String Y = "42531";
        String result = "321";

        //when
        String answer = s.solution(X, Y);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
