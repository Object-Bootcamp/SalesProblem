package com.katta.bowling;

public class Player {

  private BowlingGame bowlingGame;

  public Player() {
  }

  public int playGame() {
    return bowlingGame.knockPins();
  }

  public void register_game(BowlingGame bowlingGame) {
    this.bowlingGame = bowlingGame;
  }
}
