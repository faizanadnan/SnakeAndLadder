package com.service;

import java.util.Random;

public class DiceServiceImpl implements DiceService {
    @Override
    public int getValueFromCrookedDice() {
        Random random = new Random();
        int number = random.nextInt();
        int diceNumber = number%6;
        if (diceNumber % 2 !=0) {
            return diceNumber+1;
        } else {
            return diceNumber;
        }
    }
}
