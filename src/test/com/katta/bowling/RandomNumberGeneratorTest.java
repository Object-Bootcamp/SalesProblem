package com.katta.bowling;

import org.junit.Test;

import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RandomNumberGeneratorTest {
  @Test
  public void generate_callsBuiltInRandomNumber(){
    Random random = mock(Random.class);
    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(random);
    randomNumberGenerator.generate();
    verify(random, times(1)).nextInt();
  }
}