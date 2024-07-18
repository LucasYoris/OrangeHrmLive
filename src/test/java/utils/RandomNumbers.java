package utils;

import java.util.Random;

public class RandomNumbers {
    private static Random random = new Random();

    // Método estático que devuelve un número aleatorio
    public static int getRandomNumber(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}
