package algorithm.programmers.크레인인형뽑기;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GameBoardTest {
    @Test
    void remove() {
        //given
        int[][] board = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        List<List<Integer>> boardToList = new ArrayList<>(
                Arrays.stream(board).map(row -> Arrays.stream(row).boxed().collect(toList())).toList());
        Collections.reverse(boardToList);
        GameBoard gameBoard = new GameBoard(boardToList);

        //when
        Integer remove = gameBoard.remove(1);

        //then
        Assertions.assertThat(remove).isEqualTo(4);
    }
}
