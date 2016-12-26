package com.bowling_katta;

import com.bowling_katta.player.Player;

public class Game {


    public static final int FRAME_COUNT = 10;
    private PlayerScoreBoard playerScoreBoard;

    public void registerPlayer(Player player) {
        this.playerScoreBoard = new PlayerScoreBoard(player, FRAME_COUNT);
    }

    public int playGame() {
        int score = playerScoreBoard.playGame();
        return score;
    }
}
