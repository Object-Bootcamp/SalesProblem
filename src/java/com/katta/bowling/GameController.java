package com.katta.bowling;


public class GameController {
    public static final int FRAME_COUNT = 10;
    public static final int NO_OF_TRIES = 2;
    private final Player player;
    private int score;

    public GameController(Player player) {
        this.player = player;
        this.score = 0;
    }

    public int start_game() {
        for(int i = 0; i< FRAME_COUNT ; i++){
            int pins_knocked = player.playGame();
            this.score += pins_knocked ;
        }
        return this.score;
    }
}
