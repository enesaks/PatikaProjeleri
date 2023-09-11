package Chracter;

import Chracter.Obstacle;

import java.util.Random;

public class Sneake extends Obstacle {



    public Sneake() {
        super(4, "Yılan", getRandomDamage(), 12, 0);
    }

    private static int getRandomDamage() {
        Random random = new Random();
        int min = 3;  // Minimum değer (dahil)
        int max = 6;  // Maximum değer (dahil)
        return random.nextInt(max - min + 1) + min;
    }

}
