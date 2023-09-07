package algorithm.programmers.knumber;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class KnumberTest {
    Knumber k = new Knumber();
    @Test
    void solution() {
        //given
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = {5, 6, 3};

        //when
        int[] answer = k.solution(arr, commands);

        //then
        assertThat(answer).isEqualTo(result);

    }
}
