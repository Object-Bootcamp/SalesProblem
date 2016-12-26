package com.bowling_katta.frame;

import java.util.ArrayList;
import java.util.Arrays;

public class LastFrame extends Frame {

    static int MAXIMUM_ATTEMPT_ALLOWED = 3;

    public LastFrame() {
        this.attemptCount = 0;
        this.attempts = new ArrayList<>(Arrays.asList(0,0,0));
    }

    @Override
    public boolean isSpare() {
        return (attemptCount == 2 && getRemainingPins() == 0);
    }

    @Override
    public boolean isStrike() {
        return (attempts.get(0) == TOTAL_PINS);
    }

    @Override
    public boolean canPlayNext() {
        return (this.isSpare() || this.isStrike() || (getRemainingPins() !=0 && attemptCount == 1));
    }

    @Override
    public int score() {
        return attempts.stream().reduce(0, (val1, val2) -> val1 + val2);
    }

    private int getRemainingPins() {
        return TOTAL_PINS - attempts.stream().reduce(0, (val1, val2) -> val1 + val2);
    }
}
