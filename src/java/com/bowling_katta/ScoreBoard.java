package com.bowling_katta;

import java.util.ArrayList;

public class ScoreBoard {
    public int FRAME_COUNT;
    private ArrayList<Frame> frames;
    private int currentFrameCounter = 0;

    public ScoreBoard(int frameCount) {
        this.FRAME_COUNT = frameCount;
        this.frames = new ArrayList<>();
        for (int i = 0; i < FRAME_COUNT; i++) {
            frames.add(i, new Frame());
        }
    }

    public void roll(int knockedPins) {
        Frame currentFrame = getCurrentFrame();
        currentFrame.attemptWith(knockedPins);
        if(!currentFrame.canPlayNext()) {
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

        for(int i =0; i< frames.size(); i++) {
            Frame frame = frames.get(i);
            score += frame.score();
        }
        return score;
    }
}