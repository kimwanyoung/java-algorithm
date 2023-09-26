package algorithm.programmers.크레인인형뽑기;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 크레인인형뽑기Test {
    Solution s = new Solution();
    @Test
    void solution() {
        //given
        int[][] board = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int result = 0;

        //when
        int answer = s.solution(board, moves);

        //then
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
