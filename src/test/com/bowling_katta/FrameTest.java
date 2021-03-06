package com.bowling_katta;

import com.bowling_katta.frame.Frame;
import com.bowling_katta.frame.NormalFrame;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FrameTest {

    @Test
    public void shouldReturnSpareAsTrueWhenAllPinksKnockedDownInTwoTries() {
        Frame frame = new NormalFrame();
        frame.attemptWith(8);
        frame.attemptWith(2);
        assertThat(frame.isSpare(), is(true));
    }

    @Test
    public void shouldReturnSpareAsFalseWhenAllPinksKnockedDownInOneTry() {
        Frame frame = new NormalFrame();
        frame.attemptWith(10);
        assertThat(frame.isSpare(), is(false));
    }

    @Test
    public void shouldReturnSpareASFalseWhenAllPinsNotKnockedInTwoTries() {
        Frame frame = new NormalFrame();
        frame.attemptWith(5);
        frame.attemptWith(4);
        assertThat(frame.isSpare(), is(false));
    }

    @Test
    public void shouldReturnStrikeAsTrueWhenAllPinksKnockedDownInOneOfTheAttempt() {
        Frame frame = new NormalFrame();
        frame.attemptWith(10);
        assertThat(frame.isStrike(), is(true));
    }

    @Test
    public void shouldReturnStrikeAsFalseWhenAllPinsAreNotKnockedInOneOfTheAttempt() {
        Frame frame = new NormalFrame();
        frame.attemptWith(9);
        assertThat(frame.isStrike(), is(false));
    }

    @Test
    public void shouldReturnStrikeAsFalseWhenAllPinksKnockedDownInTwoTry() {
        Frame frame = new NormalFrame();
        frame.attemptWith(9);
        frame.attemptWith(1);
        assertThat(frame.isStrike(), is(false));
    }

    @Test
    public void shouldReturnSpareAsTrueWhenAllPinksKnockedOneOfTheAttempt() {
        Frame frame = new NormalFrame();
        frame.attemptWith(0);
        frame.attemptWith(10);
        assertThat(frame.isSpare(), is(true));
        assertThat(frame.isStrike(), is(false));
    }

    @Test
    public void shouldReturnCanPlayNextAsFalseIfAlreadyAttemptedTwoTry() {
        Frame frame = new NormalFrame();
        frame.attemptWith(7);
        frame.attemptWith(1);

        assertThat(frame.canPlayNext(), is(false));
    }

    @Test
    public void shouldReturnCanPlayNextAsTrueIfAttemptArePending() {
        Frame frame = new NormalFrame();
        frame.attemptWith(9);

        assertThat(frame.canPlayNext(), is(true));
    }

    @Test
    public void shouldReturnCanPlayNextAsFalseIfItsAStrike() {
        Frame frame = new NormalFrame();
        frame.attemptWith(10);

        assertThat(frame.canPlayNext(), is(false));
    }

    @Test
    public void shouldReturnCanPlayNextAsTrue() {
        Frame frame = new NormalFrame();
        frame.attemptWith(9);

        assertThat(frame.canPlayNext(), is(true));
    }

}
