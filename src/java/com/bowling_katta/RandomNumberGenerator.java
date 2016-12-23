package com.bowling_katta;

import java.util.Random;

public class RandomNumberGenerator {
    private Random random;

    public RandomNumberGenerator(Random random) {
        this.random = random;
    }

    public int generate() {
        int low = 0;
        int high = 10;
        return random.nextInt(high - low ) + low;
    }
}
