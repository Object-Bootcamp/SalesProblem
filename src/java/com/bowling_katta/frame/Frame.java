package com.bowling_katta.frame;

import java.util.ArrayList;

public abstract class Frame {

    static final Integer TOTAL_PINS = 10;
    ArrayList<Integer> attempts;
    int attemptCount;

    public void attemptWith(int knockedPinsCount) {
        this.attempts.set(attemptCount, knockedPinsCount);
        this.attemptCount += 1;
    }

    public int knockedPinFirstTry() {
        return this.attempts.get(0);
    }

    public abstract boolean isSpare();

    public abstract boolean isStrike();

    public abstract boolean canPlayNext();

    public abstract int score();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Frame frame = (Frame) o;

        if (attemptCount != frame.attemptCount) return false;
        return attempts != null ? attempts.equals(frame.attempts) : frame.attempts == null;
    }

    @Override
    public int hashCode() {
        int result = attempts != null ? attempts.hashCode() : 0;
        result = 31 * result + attemptCount;
        return result;
    }
}
