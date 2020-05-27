package com.model;

public class Player {
    private String name;
    private int gameAction;
    private GameStatus gameStatus;

    public Player(String name, int gameAction, GameStatus gameStatus) {
        this.name = name;
        this.gameAction = gameAction;
        this.gameStatus = gameStatus;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGameAction() {
        return gameAction;
    }

    public void setGameAction(int gameAction) {
        this.gameAction = gameAction;
    }
}
