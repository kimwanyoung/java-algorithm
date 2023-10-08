package algorithm.programmers.다리를지나는트럭;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();
    @Test
    void solution() {
        //given
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        int result = 8;

        //when
        int answer = s.solution(bridge_length, weight, truck_weights);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }

    @Test
    void solution_1() {
        //given
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10};
        int result = 101;

        //when
        int answer = s.solution(bridge_length, weight, truck_weights);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }

    @Test
    void solution_2() {
        //given
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        int result = 110;

        //when
        int answer = s.solution(bridge_length, weight, truck_weights);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }
}
