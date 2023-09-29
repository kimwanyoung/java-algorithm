package algorithm.programmers.개인정보수집유효기간;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();
    @Test
    void solution() {
        //given
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] result = {1, 3};

        //when
        int[] answer = s.solution(today, terms, privacies);

        //then
        Assertions.assertThat(answer).isEqualTo(result);


    }
}
