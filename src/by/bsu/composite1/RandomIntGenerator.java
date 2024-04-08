package by.bsu.composite1;

import java.util.Random;

public class RandomIntGenerator {
    private static Random random = new Random();
    public static int generate(int min, int max) {
        return random.nextInt(min, max + 1);
    }
}

