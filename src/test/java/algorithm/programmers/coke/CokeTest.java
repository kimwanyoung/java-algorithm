package algorithm.programmers.coke;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CokeTest {
    Coke c = new Coke();
    @Test
    void solution() {
        //given
        int a = 2;
        int b = 1;
        int n = 20;
        int result = 19;

        //when
        int answer = c.solution(a, b, n);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }

    @Test
    void solution_2() {
        //given
        int a = 3;
        int b = 1;
        int n = 20;
        int result = 9;

        //when
        int answer = c.solution(a, b, n);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
