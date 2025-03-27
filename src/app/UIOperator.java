package app;

import java.util.function.Function;

public class UIOperator {

    public String result() {
        Calculator calculator = new Calculator();
        Function<String, Integer> func = StringListProcessor::countUppercase;
        UppercaseStr uppercaseStr = new UppercaseStr();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        int result1 = calculator.res(5, 6);
        String result2 = uppercaseStr.resultStr("hello world");
        int result3 = randomNumberGenerator.generateRandomNumber(1, 100);

        String testStr = "Hello WorLd";
        String resultStr = String.valueOf(func.apply(testStr));

        return "\n Result is: " + result1 +
                "\n Uppercase string is: " + result2 +
                "\n Number of capital letters: " + resultStr +
                "\n Random numbers from 1 to 100: " + result3;
    }

    @Override
    public String toString() {
        return result();
    }
}
