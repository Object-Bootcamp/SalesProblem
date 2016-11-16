package com.katta.bowling;

public class Game {
  private final RandomNumberGenerator randomNumberGenerator;

  public Game(RandomNumberGenerator randomNumberGenerator) {
    this.randomNumberGenerator = randomNumberGenerator;
  }

  public int knockPins() {
    return randomNumberGenerator.generate();
  }
}
