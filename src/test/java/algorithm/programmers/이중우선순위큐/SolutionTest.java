package algorithm.programmers.이중우선순위큐;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();
    @Test
    void solution() {
        //given
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        int[] answer = {0, 0};

        //when
        int[] result = s.solution(operations);

        //then
        Assertions.assertThat(result).isEqualTo(answer);

    }

    @Test
    void solution_1() {
        //given
        String[] operations = {"I -45", "I 653", "D 1", "D -1", "I 10"};
        int[] answer = {10, 10};

        //when
        int[] result = s.solution(operations);

        //then
        Assertions.assertThat(result).isEqualTo(answer);

    }

    @Test
    void solition_2() {
        //given
        String[] operations = {"I 6", "I 6", "I 4", "I 3", "D -1", "D -1"};
        int[] answer = {6, 6};

        //when
        int[] result = s.solution(operations);

        //then
        Assertions.assertThat(result).isEqualTo(answer);

    }
}
