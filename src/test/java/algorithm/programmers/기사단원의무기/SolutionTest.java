package algorithm.programmers.기사단원의무기;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        //given
        int number = 5;
        int limit = 3;
        int power = 2;

        //when
        int result = s.solution(number, limit, power);

        //then
        Assertions.assertThat(result).isEqualTo(10);

    }

    @Test
    void 약수_개수_구하기() {
        //given
        int number = 15;

        //then
        int measureCount = s.getDivisorCount(number);

        //when
        Assertions.assertThat(measureCount).isEqualTo(4);
    }
}
