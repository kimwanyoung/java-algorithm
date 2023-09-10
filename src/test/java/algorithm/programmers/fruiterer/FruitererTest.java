package algorithm.programmers.fruiterer;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FruitererTest {
    Fruiterer f = new Fruiterer();
    @Test
    void solution() {
        //given
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        int result = 8;

        //when
        int answer = f.solution(k, m, score);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }
}
