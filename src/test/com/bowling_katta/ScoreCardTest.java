package com.bowling_katta;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ScoreCardTest {

    private ScoreCard scoreCard;

    @Test
    public void rollShouldUpdateFrameWhenPinsKnockedForAFrame()  {
        Frame frame = new Frame();
        frame.attemptWith(6);

        scoreCard = new ScoreCard(1);
        scoreCard.roll(6);

        assertThat(scoreCard.getFrames().get(0), is(frame));
        assertThat(scoreCard.getCurrentFrameCounter(), is(0));
    }

    @Test
    public void scoreBoardShouldUpdateFrameWhenPinsKnockedForAFrames() {
        Frame frameOne = new Frame();
        Frame frameTwo = new Frame();
        frameOne.attemptWith(6);
        frameOne.attemptWith(2);
        frameTwo.attemptWith(10);

        scoreCard = new ScoreCard(2);
        scoreCard.roll(6);
        scoreCard.roll(2);
        scoreCard.roll(10);

        assertThat(scoreCard.getFrames().get(0), is(frameOne));
        assertThat(scoreCard.getFrames().get(1), is(frameTwo));
        assertThat(scoreCard.getCurrentFrameCounter(), is(2));
    }


    @Test
    public void scoreShouldBeTotalNumberPinsKnockedWhenThereIsNoStrikeOrSpare() {
        scoreCard = new ScoreCard(2);
        scoreCard.roll(7);
        scoreCard.roll(2);
        scoreCard.roll(2);
        scoreCard.roll(6);

        assertThat(scoreCard.score(), is(17));
    }

    @Test
    public void scoreShouldIncludeBonusWhenItsSpare()  {
        scoreCard = new ScoreCard(2);
        scoreCard.roll(6);
        scoreCard.roll(4);
        scoreCard.roll(5);
        scoreCard.roll(4);

        assertThat(scoreCard.score(), is(24));
    }

    @Test
    public void scoreShouldIncludeBonusWhenItsStrike()  {
        scoreCard = new ScoreCard(2);
        scoreCard.roll(0);
        scoreCard.roll(10);
        scoreCard.roll(5);
        scoreCard.roll(4);

        assertThat(scoreCard.score(), is(28));
    }

    @Test
    public void scoreShouldIncludeBonusWhenItsStrikeAndSpareInAGame() {
        scoreCard = new ScoreCard(10);
        scoreCard.roll(1);
        scoreCard.roll(4);

        scoreCard.roll(4);
        scoreCard.roll(5);

        scoreCard.roll(6);
        scoreCard.roll(4);

        scoreCard.roll(5);
        scoreCard.roll(5);

        scoreCard.roll(0);
        scoreCard.roll(10);

        scoreCard.roll(0);
        scoreCard.roll(1);

        scoreCard.roll(7);
        scoreCard.roll(3);

        scoreCard.roll(6);
        scoreCard.roll(4);

        scoreCard.roll(0);
        scoreCard.roll(10);

        scoreCard.roll(2);
        scoreCard.roll(6);

        assertThat(scoreCard.score(), is(103));
    }

    @Test
    public void canRollShouldReturnFalseAfterAllFrame() {
        ScoreCard scoreCard = new ScoreCard(2);
        scoreCard.roll(1);
        scoreCard.roll(2);
        scoreCard.roll(2);
        scoreCard.roll(2);
        assertThat(scoreCard.canRoll(), is(false));
    }
}
