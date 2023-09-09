package algorithm.programmers.failurerate;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FailureRateTest {
    FailureRate f = new FailureRate();


    @Test
    void solution() {
        //given
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = {3,4,2,1,5};

        //when
        int[] answer = f.solution(N, stages);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }

    @Test
    void solution_2() {
        //given
        int N = 4;
        int[] stages = {4, 4, 4, 4, 4};
        int[] result = {4,1,2,3};

        //when
        int[] answer = f.solution(N, stages);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }


}
