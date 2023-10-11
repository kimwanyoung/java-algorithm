package algorithm.programmers.전화번호목록;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        //given
        String[] phone_book = {"119", "97674223", "1195524421"};

        //when
        boolean result = s.solution(phone_book);

        //then
        Assertions.assertThat(result).isFalse();

    }

    @Test
    void solution_1() {
        //given
        String[] phone_book = {"123","456","456789"};

        //when
        boolean result = s.solution(phone_book);

        //then
        Assertions.assertThat(result).isFalse();

    }

    @Test
    void solution_2() {
        //given
        String[] phone_book = {"12","124","1235","567","88"};

        //when
        boolean result = s.solution(phone_book);

        //then
        Assertions.assertThat(result).isFalse();

    }
}
