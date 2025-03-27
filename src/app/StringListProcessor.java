package app;

public class StringListProcessor {

    public static Integer countUppercase(String s){
        return (int) s.chars().filter(Character::isUpperCase).count();
    }


}
