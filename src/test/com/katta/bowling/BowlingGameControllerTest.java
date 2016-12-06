package com.katta.bowling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BowlingGameControllerTest {
  @Test
  public void calculate_score_for_a_player() {
    Player player = mock(Player.class);
    when(player.playGame()).thenReturn(2);

    GameController gameController = new GameController(player);
    int score = gameController.start_game();
    assertEquals(20, score );
  }
}
