package com.bowling_katta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Frame {

    private static final Integer TOTAL_PINS = 10;
    private static final int MAXIMUM_ATTEMPT_ALLOWED = 2;
    private final ArrayList<Integer> attempts;

    private int attemptCount;

    public Frame() {
        this.attemptCount = 0;
        this.attempts = new ArrayList<>(Arrays.asList(0,0));
    }

    public void attemptWith(int knockedPinsCount) {
        this.attempts.set(attemptCount, knockedPinsCount);
        this.attemptCount += 1;
    }

    private int getRemainingPins() {
        return TOTAL_PINS - attempts.stream().reduce(0, (val1, val2) -> val1 + val2);
    }

    public boolean isSpare() {
        return (this.attemptCount == MAXIMUM_ATTEMPT_ALLOWED && getRemainingPins() == 0 && !isStrike());
    }

    public boolean isStrike() {
        return (this.attempts.contains(10) && getRemainingPins() == 0);
    }

    public boolean canPlayNext() {
        return (this.attemptCount < MAXIMUM_ATTEMPT_ALLOWED && getRemainingPins() != 0);
    }

    public int score() {
        return attempts.stream().reduce(0, (val1, val2) -> val1 + val2);
    }

    @Override
    public String toString() {
        return "Frame{" +
                "attempts=" + attempts +
                ", attemptCount=" + attemptCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Frame frame = (Frame) o;

        return attemptCount == frame.attemptCount && (attempts != null ? attempts.equals(frame.attempts) : frame.attempts == null);
    }

    @Override
    public int hashCode() {
        int result = attempts != null ? attempts.hashCode() : 0;
        result = 31 * result + attemptCount;
        return result;
    }

    public int knockedPinFirstTry() {
        return this.attempts.get(0);
    }
}
