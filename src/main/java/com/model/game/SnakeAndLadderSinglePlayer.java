package com.model.game;

import com.model.GameStatus;
import com.model.Player;
import com.model.board.BasicBoard;

import java.util.Map;

public class SnakeAndLadderSinglePlayer extends SnakeAndLadderGame {
    private Player player;


    public SnakeAndLadderSinglePlayer(BasicBoard basicBoard, Player player) {
        super(basicBoard);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void updateScore(Player player) {
        int gameAction = player.getGameAction();
        BasicBoard basicBoard = getBasicBoard();
        GameStatus gameStatus = getGameStatus(player, gameAction, basicBoard);
        if (!gameStatus.getGameStatus().contentEquals("Move Not Possible")) {
            return;
        }
        player.setGameStatus(gameStatus);
        basicBoard.setPlayerPosition(basicBoard.getPlayerPosition() + gameAction);
    }

    private GameStatus getGameStatus(Player player, int gameAction, BasicBoard basicBoard) {
        GameStatus gameStatus = player.getGameStatus();
        int nextPosition = gameStatus.getCurrentStatus() + gameAction;
        nextPosition = getNextPosition(basicBoard, nextPosition);
        if (isOutOfBoard(basicBoard, gameStatus, nextPosition)) return gameStatus;
        reachedToDestination(basicBoard, gameStatus, nextPosition);
        gameStatus.setCurrentStatus(nextPosition);
        return gameStatus;
    }

    private void reachedToDestination(BasicBoard basicBoard, GameStatus gameStatus, int nextPosition) {
        if (nextPosition == basicBoard.getBoardSize()) {
            gameStatus.setGameStatus("Won");
        }
    }

    private boolean isOutOfBoard(BasicBoard basicBoard, GameStatus gameStatus, int nextPosition) {
        if (nextPosition > basicBoard.getBoardSize()) {
            gameStatus.setGameStatus("Move Not Possible"); // todo : make it enum
            return true;
        }
        return false;
    }

    private int getNextPosition(BasicBoard basicBoard, int nextPosition) {
        Map<Integer, Integer> specialMoves = basicBoard.getSpecialMoves();
        if (specialMoves.containsKey(nextPosition)) {
            Integer jumpToPosition = specialMoves.get(nextPosition);
            nextPosition = jumpToPosition;
        }
        return nextPosition;
    }
}
