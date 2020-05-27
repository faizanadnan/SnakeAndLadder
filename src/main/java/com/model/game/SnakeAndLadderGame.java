package com.model.game;

import com.model.Player;
import com.model.board.BasicBoard;

public abstract class SnakeAndLadderGame {
    private BasicBoard basicBoard;

    public SnakeAndLadderGame(BasicBoard basicBoard) {
        this.basicBoard = basicBoard;
    }

    public BasicBoard getBasicBoard() {
        return basicBoard;
    }
    abstract public Player getPlayer();
    abstract public void setPlayer(Player player);
    abstract public void updateScore(Player player);
}
