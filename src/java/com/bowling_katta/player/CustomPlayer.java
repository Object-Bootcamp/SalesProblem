package com.bowling_katta.player;

public class CustomPlayer extends Player {
    private final String name;
    private final Integer[] rolls;
    private int rollCounter;

    public CustomPlayer(String name, Integer[] rolls) {
        this.name = name;
        this.rollCounter = 0;
        this.rolls = rolls;
    }

    @Override
    public int throwBall() {
        return rolls[rollCounter++];
    }
}
