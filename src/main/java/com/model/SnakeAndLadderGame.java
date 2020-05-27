package com.model;

public abstract class SnakeAndLadderGame {
    private static BasicBoard basicBoard = BasicBoard.getBasicBoard();

    public SnakeAndLadderGame() {
    }

    public BasicBoard getBasicBoard() {
        return basicBoard;
    }
    abstract public Player getPlayer();
    abstract public void setPlayer(Player player);
    abstract public void updateScore(Player player);
}
