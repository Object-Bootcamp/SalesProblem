package com.bowling_katta;

import com.bowling_katta.player.Player;

public class PlayerScoreBoard {
    private final Player player;
    private final ScoreCard scoreboard;

    public PlayerScoreBoard(Player player, int frameCount) {
        this.player = player;
        this.scoreboard = new ScoreCard(frameCount);
    }

    public int playGame() {
        while(scoreboard.canRoll()) {
            scoreboard.roll(player.throwBall());
        }
        return scoreboard.score();
    }
}
