package com.model.board;

import java.util.Map;

public class BoardWithSnake extends BasicBoard {
    private static BoardWithSnake basicBoard;
    private Map<Integer, Integer> specialMoves;

    public BoardWithSnake(String boardName, int boardSize) {
        super(boardName, boardSize);
    }

    public static BasicBoard getBasic() {
        if (basicBoard != null) {
            return basicBoard;
        }
        basicBoard = new BoardWithSnake("SnakeAndLadder", 100);
        return basicBoard;
    }

    @Override
    public Map<Integer, Integer> getSpecialMoves() {
        return specialMoves;
    }

    @Override
    public void setSpecialMoves(Map<Integer, Integer> specialMoves) {
        this.specialMoves = specialMoves;
    }
}
