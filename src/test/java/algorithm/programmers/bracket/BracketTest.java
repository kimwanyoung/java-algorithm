package algorithm.programmers.bracket;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BracketTest {
    Bracket b = new Bracket();

    @Test
    void 올바른_괄호() {
        //given
        String bracket = "()()";

        //when
        boolean answer = b.solution(bracket);

        //then
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void 올바르지않은_괄호() {
        //given
        String bracket = ")()(";

        //when
        boolean answer = b.solution(bracket);

        //then
        Assertions.assertThat(answer).isFalse();

    }
}
