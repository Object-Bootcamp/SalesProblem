package com.bowling_katta;

import com.bowling_katta.player.DummyPlayer;
import com.bowling_katta.player.CustomPlayer;
import com.bowling_katta.util.RandomNumberGenerator;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//http://www.bowlinggenius.com/
public class GameTest {

    @Test
    public void shouldPlayWithRegisteredUser() {
        Integer rolls[] = new Integer[]{
                1, 4, 4, 5,
                6, 4, 5, 5,
                0, 10, 0, 1,
                7, 3, 6, 4,
                0, 10, 2, 6};
        CustomPlayer playerOne =  new CustomPlayer("Some Name", rolls);
        Game game = new Game();
        game.registerPlayer(playerOne);

        assertThat(game.playGame(), is(96));
    }

    @Test
    public void shouldPlayWithDummyPlayer() {
        Random random = mock(Random.class);
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(random);
        DummyPlayer dummyPlayer = new DummyPlayer(randomNumberGenerator);
        when(random.nextInt(anyInt())).thenReturn(1).thenReturn(4).thenReturn(4).thenReturn(5)
                                      .thenReturn(6).thenReturn(4).thenReturn(5).thenReturn(5)
                                      .thenReturn(0).thenReturn(10).thenReturn(0).thenReturn(1)
                                      .thenReturn(7).thenReturn(3).thenReturn(6).thenReturn(4)
                                      .thenReturn(0).thenReturn(10).thenReturn(2).thenReturn(6);

        Game game = new Game();
        game.registerPlayer(dummyPlayer);

        assertThat(game.playGame(), is(96));
    }


}
