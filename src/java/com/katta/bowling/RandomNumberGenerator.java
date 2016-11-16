package com.katta.bowling;

import java.util.Random;

public class RandomNumberGenerator {

  private Random random;

  public RandomNumberGenerator(Random random) {
    this.random = random;
  }

  public int generate() {
    return random.nextInt();
  }
}
