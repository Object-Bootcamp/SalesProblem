package com.katta.bowling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerTest {
  @Test
  public void play_game_returns_no_of_pins_knocked() {
    BowlingGame bowlingGame = mock(BowlingGame.class);
    when(bowlingGame.knockPins()).thenReturn(2);

    Player player = new Player(bowlingGame);

    int pinsKnocked = player.playGame();
    assertEquals(2, pinsKnocked);
  }
}
