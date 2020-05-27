package com.service;

import com.model.*;

public class GameBoardServiceImpl implements GameBoardService {
    private SnakeAndLadderGame snakeAndLadderGame;

    public GameBoardServiceImpl(SnakeAndLadderGame snakeAndLadderGame) {
        this.snakeAndLadderGame = snakeAndLadderGame;
    }

    public GameStatus play(Player player) {
        snakeAndLadderGame.updateScore(player);
        return snakeAndLadderGame.getPlayer().getGameStatus();
    }
}
