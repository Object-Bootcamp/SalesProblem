package com.bowling_katta;

import java.util.ArrayList;

class ScoreCard {
    private int FRAME_COUNT;
    private ArrayList<Frame> frames;
    private int currentFrameCounter = 0;

    public ScoreCard(int frameCount) {
        this.FRAME_COUNT = frameCount;
        this.frames = new ArrayList<>(FRAME_COUNT);
        frames.add(currentFrameCounter, new Frame());
    }

    public void roll(int knockedPins) {
        Frame currentFrame = getCurrentFrame();
        currentFrame.attemptWith(knockedPins);
        if (!currentFrame.canPlayNext()) {
            updateFrame();
        }
    }

    private void updateFrame() {
        currentFrameCounter++;
        if (canRoll())
            frames.add(currentFrameCounter, new Frame());
    }

    private Frame getCurrentFrame() {
        return frames.get(currentFrameCounter);
    }

    public int getCurrentFrameCounter() {
        return currentFrameCounter;
    }

    public ArrayList<Frame> getFrames() {
        return frames;
    }

    public int score() {
        int score = 0;
        boolean isSpare = false, isStrike = false;

        for (Frame frame : frames) {
            score += frame.score();
            if (isSpare) score += frame.knockedPinFirstTry();
            if (isStrike) score += frame.score();

            isSpare = frame.isSpare();
            isStrike = frame.isStrike();
        }

        return score;
    }

    public boolean canRoll() {
        return currentFrameCounter < FRAME_COUNT;
    }

}