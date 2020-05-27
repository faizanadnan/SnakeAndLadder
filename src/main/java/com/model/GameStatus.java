package com.model;

public class GameStatus {

    private int currentStatus = 0;
    private String gameStatus = "Not Started";

    public GameStatus(int currentStatus, String gameStatus) {
        this.currentStatus = currentStatus;
        this.gameStatus = gameStatus;
    }

    public int getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(int currentStatus) {
        this.currentStatus = currentStatus;
    }

    public  String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }


}
