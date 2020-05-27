package com.model;

public class SnakeAndLadderSinglePlayer extends SnakeAndLadderGame {
    private Player player;
    private static SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderSinglePlayer();

    public SnakeAndLadderSinglePlayer() {
        super();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public SnakeAndLadderGame getGame() {
        return snakeAndLadderGame;
    }

    public void updateScore(Player player) {
        int gameAction = player.getGameAction();
        BasicBoard basicBoard = snakeAndLadderGame.getBasicBoard();
        GameStatus gameStatus = getGameStatus(player, gameAction);
        if (!gameStatus.getGameStatus().contentEquals("Move Not Possible")) {
            return;
        }
        player.setGameStatus(gameStatus);
        basicBoard.setPlayerPosition(basicBoard.getPlayerPosition() + gameAction);
    }

    private GameStatus getGameStatus(Player player, int gameAction) {
        GameStatus gameStatus = player.getGameStatus();
            int nextPosition = gameStatus.getCurrentStatus() + gameAction;
            if (nextPosition > 100) {
                gameStatus.setGameStatus("Move Not Possible"); // todo : make it enum
                return gameStatus;
            }
            if (nextPosition == 100) { // todo : use board object
                gameStatus.setGameStatus("Won");
            }
            gameStatus.setCurrentStatus(nextPosition);

        return gameStatus;
    }
}
