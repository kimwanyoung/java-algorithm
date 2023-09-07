package algorithm.programmers.threeman;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ThreeManTest {
    ThreeMan t = new ThreeMan();
    @Test
    void solution() {
        //given
        int[] number = {-2, 3, 0, 2, -5};
        int result = 2;

        //when
        int answer = t.solution(number);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
