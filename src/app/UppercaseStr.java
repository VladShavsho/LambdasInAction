package app;

public class UppercaseStr {
    public String resultStr(String a) {
        StringManipulator stringManipulator = new StringManipulator() {
            @Override
            public String str(String a) {
                return a.toUpperCase();
            }
        };
        return stringManipulator.str(a);
    }

}
