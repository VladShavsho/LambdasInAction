package app;

public class Calculator {

    public int res(int a, int b) {
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        return mathOperation.operation(a, b);
    }
}
