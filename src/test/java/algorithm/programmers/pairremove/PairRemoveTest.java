package algorithm.programmers.pairremove;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PairRemoveTest {
    PairRemove p = new PairRemove();
    @Test
    void 결과_1() {
        //given
        String s = "baabaa";
        int result = 1;

        //when
        int answer = p.solution(s);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }

    @Test
    void 결과_0() {
        //given
        String s = "cdcd";
        int result = 0;

        //when
        int answer = p.solution(s);

        //then
        Assertions.assertThat(answer).isEqualTo(result);

    }
}
