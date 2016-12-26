package com.bowling_katta.frame;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LastFrameTest {

    @Test
    public void shouldReturnSpareAsTrueIfAllPinsThrownInFirstTwoAttempts()  {
        LastFrame lastFrame = new LastFrame();
        lastFrame.attemptWith(6);
        lastFrame.attemptWith(4);

        assertThat(lastFrame.isSpare(), is(true));
    }
    @Test
    public void shouldReturnSpareAsFalseIfAllPinsAreNotThrownInFirstTwoAttempts()  {
        LastFrame lastFrame = new LastFrame();
        lastFrame.attemptWith(6);
        lastFrame.attemptWith(3);

        assertThat(lastFrame.isSpare(), is(false));
    }

    @Test
    public void shouldReturnStrikeAsTrueIfAllPinsThrownInFirstAttempt()  {
        LastFrame lastFrame = new LastFrame();
        lastFrame.attemptWith(10);

        assertThat(lastFrame.isStrike(), is(true));
    }
    @Test
    public void shouldReturnStrikeAsFalseIfAllPinsNotThrownInFirstAttempt()  {
        LastFrame lastFrame = new LastFrame();
        lastFrame.attemptWith(0);
        lastFrame.attemptWith(10);

        assertThat(lastFrame.isStrike(), is(false));
        assertThat(lastFrame.isSpare(), is(true));
    }

    @Test
    public void canPlayNextReturnTrueIfItsSpare()  {
        LastFrame lastFrame = new LastFrame();
        lastFrame.attemptWith(0);
        lastFrame.attemptWith(10);

        assertThat(lastFrame.canPlayNext(), is(true));
    }

    @Test
    public void canPlayNextReturnTrueIfItsStrike()  {
        LastFrame lastFrame = new LastFrame();
        lastFrame.attemptWith(10);

        assertThat(lastFrame.canPlayNext(), is(true));
    }

    @Test
    public void canPlayNextReturnFalseIfItsNeitherStrikeOrNeitherSpareForLastAttempt()  {
        LastFrame lastFrame = new LastFrame();
        lastFrame.attemptWith(3);
        lastFrame.attemptWith(3);

        assertThat(lastFrame.canPlayNext(), is(false));
    }

    @Test
    public void canPlayNextShouldReturnTrueForSecondAttemptIfAllPinsAreNotThrown()  {
        LastFrame lastFrame = new LastFrame();
        lastFrame.attemptWith(3);

        assertThat(lastFrame.canPlayNext(), is(true));
    }
    @Test
    public void canPlayNextShouldReturnFalseForLastAttemptEvenIfNotAllPinsAreThrown()  {
        LastFrame lastFrame = new LastFrame();
        lastFrame.attemptWith(3);
        lastFrame.attemptWith(6);

        assertThat(lastFrame.canPlayNext(), is(false));
    }
}