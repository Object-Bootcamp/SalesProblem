package com.katta.bowling;

public class Player {

  private BowlingGame bowlingGame;

  public Player(BowlingGame bowlingGame) {
    this.bowlingGame = bowlingGame;
  }

  public int playGame() {
    return bowlingGame.knockPins();
  }

}
