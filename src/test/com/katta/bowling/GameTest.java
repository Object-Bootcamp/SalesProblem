package com.katta.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {

  private RandomNumberGenerator randomNumberGenerator;
  private Game game;

  @Before
  public void setUp() throws Exception {
    randomNumberGenerator = mock(RandomNumberGenerator.class);
    game = new Game(randomNumberGenerator);
  }

  @Test
  public void knock_returns0_whenHit() {
    when(randomNumberGenerator.generate()).thenReturn(0);
    int knockedPinsCount = game.knockPins();
    assertEquals(0, knockedPinsCount);
  }

  @Test
  public void knock_returns2_whenHit() {
    when(randomNumberGenerator.generate()).thenReturn(2);
    int knockedPinsCount = game.knockPins();
    assertEquals(2, knockedPinsCount);
  }
}
