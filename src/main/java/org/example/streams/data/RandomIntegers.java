package org.example.streams.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomIntegers {

    public static List<Integer> getRandomIntegers() {

        Random random = new Random();
        List<Integer> randomInts = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            //Generate a random number between 1 and 1000 - Both inclusive
            int num = 1 + random.nextInt(1000);

            randomInts.add(num);

        }
        return randomInts;
    }

}
