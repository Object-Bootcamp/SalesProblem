package com.katta.bowling;

public class BowlingGame {
  private final RandomNumberGenerator randomNumberGenerator;

  public BowlingGame(RandomNumberGenerator randomNumberGenerator) {
    this.randomNumberGenerator = randomNumberGenerator;
  }

  public int knockPins() {
    return randomNumberGenerator.generate();
  }
}
