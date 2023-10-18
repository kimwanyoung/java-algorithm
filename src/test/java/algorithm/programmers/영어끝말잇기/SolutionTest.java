package algorithm.programmers.영어끝말잇기;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        //given
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "land"};
        int[] result = new int[]{3, 3};

        //when
        int[] answer = s.solution(n, words);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
