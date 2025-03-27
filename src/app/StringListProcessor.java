package app;

public class StringListProcessor {

    public static Integer countUppercase(String s){

        int cout = (int) s.chars().filter(Character::isUpperCase).count();
        return cout;
    }


}
