package algorithm.programmers.foodfight;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FoodFightTest {

    FoodFight f = new FoodFight();
    @Test
    void solution() {
        //given
        int[] food = {1, 3, 4, 6};
        String result = "1223330333221";

        //when
        String answer = f.solution(food);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
