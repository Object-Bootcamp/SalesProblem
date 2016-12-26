package com.bowling_katta.player;

import com.bowling_katta.util.RandomNumberGenerator;

public class DummyPlayer implements Player {

    private RandomNumberGenerator randomNumberGenerator;

    public DummyPlayer(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    @Override
    public int throwBall() {
        return randomNumberGenerator.generate();
    }
}
