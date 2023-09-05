package algorithm.programmers.mostclosechar;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MostCloseCharTest {

    MostCloseChar m = new MostCloseChar();
    @Test
    void 가장_가까운_글자_바나나() {
        //given
        String s = "banana";
        int[] result = {-1, -1, -1, 2, 2, 2};

        //when
        int[] answer = m.solution(s);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
