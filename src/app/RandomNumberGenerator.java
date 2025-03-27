package app;

import java.util.function.Supplier;

public class RandomNumberGenerator {

    public static int generateRandomNumber(int min, int max){

        Supplier<Integer> integerNum = () -> min + (int) ((max - min + 1) * Math.random());
        return integerNum.get();
    }
}
