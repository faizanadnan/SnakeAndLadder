package com.service;

import com.model.GameStatus;
import com.model.Player;

public interface GameBoardService {
    GameStatus play(Player player);
}
