package com.bowling_katta;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

public class ScoreBoardTest {

    private ScoreBoard scoreBoard;

    @Test
    public void rollShouldUpdateFrameWhenPinsKnockedForAFrame()  {
        Frame frame = new Frame();
        frame.attemptWith(6);

        scoreBoard = new ScoreBoard(1);
        scoreBoard.roll(6);

        assertThat(scoreBoard.getFrames().get(0), is(frame));
        assertThat(scoreBoard.getCurrentFrameCounter(), is(0));
    }

    @Test
    public void scoreBoardShouldUpdateFrameWhenPinsKnockedForAFrames() {
        Frame frameOne = new Frame();
        Frame frameTwo = new Frame();
        frameOne.attemptWith(6);
        frameOne.attemptWith(2);
        frameTwo.attemptWith(10);

        scoreBoard = new ScoreBoard(2);
        scoreBoard.roll(6);
        scoreBoard.roll(2);
        scoreBoard.roll(10);

        assertThat(scoreBoard.getFrames().get(0), is(frameOne));
        assertThat(scoreBoard.getFrames().get(1), is(frameTwo));
        assertThat(scoreBoard.getCurrentFrameCounter(), is(2));
    }


    @Test
    public void scoreShouldBeTotalNumberPinsKnockedWhenThereIsNoStrikeOrSpare() {
        scoreBoard = new ScoreBoard(2);
        scoreBoard.roll(7);
        scoreBoard.roll(2);
        scoreBoard.roll(2);
        scoreBoard.roll(6);

        assertThat(scoreBoard.score(), is(17));
    }

    @Test
    public void scoreShouldIncludeBonusWhenItsSpare()  {
        scoreBoard = new ScoreBoard(2);
        scoreBoard.roll(6);
        scoreBoard.roll(4);
        scoreBoard.roll(5);
        scoreBoard.roll(4);

        assertThat(scoreBoard.score(), is(14));
    }
}