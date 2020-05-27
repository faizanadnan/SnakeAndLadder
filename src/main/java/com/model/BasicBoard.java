package com.model;

public class BasicBoard {
    private static String boardName;
    private static int boardSize;
    private static int playerPosition = 0;

    private static BasicBoard basicBoard;

    private BasicBoard(String boardName, int boardSize) {
        this.boardName = boardName;
        this.boardSize = boardSize;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public static BasicBoard getBasicBoard() {
            if (basicBoard != null) {
                return basicBoard;
            }
            basicBoard = new BasicBoard("SnakeAndLadder", 100);
            return basicBoard;
    }
}
