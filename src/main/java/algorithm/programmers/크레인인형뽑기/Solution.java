package algorithm.programmers.크레인인형뽑기;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

interface Board {
    Integer remove(int n);
}

interface Crane {
    void pick(int line, Board board, Basket basket);
}

interface Basket {
    void stack(int piece);
}

class GameBoard implements Board {
    private List<List<Integer>> gameBoard;

    public GameBoard(List<List<Integer>> gameBoard) {
        this.gameBoard = gameBoard;
    }

    @Override
    public Integer remove(int n) {
        int size = gameBoard.size() - 1;

        while (gameBoard.get(size).get(n - 1) == 0 && size > 0) {
            size--;
        }

        int piece = gameBoard.get(size).get(n - 1);
        List<Integer> changedGameBoard = gameBoard.get(size);

        changedGameBoard.set(n - 1, 0);
        gameBoard.set(size, changedGameBoard);

        return piece;
    }
}

class GameCrane implements Crane {

    @Override
    public void pick(int line, Board board, Basket basket) {
        int removedPiece = board.remove(line);
        basket.stack(removedPiece);
    }
}


class GameBasket implements Basket {
    private Stack<Integer> pieceStack = new Stack<>();
    private Integer removedPiece = 0;

    @Override
    public void stack(int piece) {
        if (!pieceStack.isEmpty() && pieceStack.lastElement() == piece && piece != 0) {
            pieceStack.pop();
            removedPiece += 2;
        } else {
            pieceStack.push(piece);
        }
    }

    public Integer getRemovedPiece() {
        return removedPiece;
    }
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        List<List<Integer>> boardToList = new ArrayList<>(
                Arrays.stream(board).map(row -> Arrays.stream(row).boxed().collect(toList())).collect(toList()));
        Collections.reverse(boardToList);

        GameCrane crane = new GameCrane();
        GameBasket basket = new GameBasket();
        GameBoard gameBoard = new GameBoard(boardToList);

        for (int move : moves) {
            crane.pick(move, gameBoard, basket);
        }

        return basket.getRemovedPiece();
    }
}
