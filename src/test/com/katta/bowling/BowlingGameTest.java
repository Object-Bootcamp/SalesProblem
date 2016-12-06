package com.katta.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BowlingGameTest {

  private RandomNumberGenerator randomNumberGenerator;
  private BowlingGame bowlingGame;

  @Before
  public void setUp() throws Exception {
    randomNumberGenerator = mock(RandomNumberGenerator.class);
    bowlingGame = new BowlingGame(randomNumberGenerator);
  }

  @Test
  public void knock_returns0_whenHit() {
    when(randomNumberGenerator.generate()).thenReturn(0);
    int knockedPinsCount = bowlingGame.knockPins();
    assertEquals(0, knockedPinsCount);
  }

  @Test
  public void knock_returns2_whenHit() {
    when(randomNumberGenerator.generate()).thenReturn(2);
    int knockedPinsCount = bowlingGame.knockPins();
    assertEquals(2, knockedPinsCount);
  }
}
