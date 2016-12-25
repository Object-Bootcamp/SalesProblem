package com.bowling_katta;

import java.util.ArrayList;

class ScoreBoard {
    private int FRAME_COUNT = 10;
    private ArrayList<Frame> frames;
    private int currentFrameCounter = 0;

    public ScoreBoard() {
        this.frames = new ArrayList<>();
        for (int i = 0; i < FRAME_COUNT; i++) {
            frames.add(i, new Frame());
        }
    }

    public void roll(int knockedPins) {
        Frame currentFrame = getCurrentFrame();
        currentFrame.attemptWith(knockedPins);
        if (!currentFrame.canPlayNext()) {
            currentFrameCounter++;
        }
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
}