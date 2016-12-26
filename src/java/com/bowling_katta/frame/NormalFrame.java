package com.bowling_katta.frame;

import java.util.ArrayList;
import java.util.Arrays;

public class NormalFrame extends Frame {
    static int MAXIMUM_ATTEMPT_ALLOWED = 2;

    public NormalFrame() {
        this.attemptCount = 0;
        this.attempts = new ArrayList<>(Arrays.asList(0,0));
    }

    public boolean canPlayNext() {
        return (this.attemptCount < MAXIMUM_ATTEMPT_ALLOWED && getRemainingPins() != 0);
    }

    public boolean isSpare() {
        return (this.attemptCount == MAXIMUM_ATTEMPT_ALLOWED && getRemainingPins() == 0 && !isStrike());
    }

    public boolean isStrike() {
        return (this.attempts.get(0) == TOTAL_PINS );
    }

    public int score() {
        return attempts.stream().reduce(0, (val1, val2) -> val1 + val2);
    }

    private int getRemainingPins() {
        return TOTAL_PINS - attempts.stream().reduce(0, (val1, val2) -> val1 + val2);
    }


}
