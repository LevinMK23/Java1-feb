package lesson3;

import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = 100 + (int)(Math.random() * 100); // (0, 1)
    }
}
