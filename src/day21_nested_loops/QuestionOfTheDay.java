package day21_nested_loops;

import java.util.Locale;

public class QuestionOfTheDay {
    public static void main(String[] args) {

        String name = "chuck norris";

        System.out.println(name);
        String initials = name.charAt(0) + "." +name.charAt(name.indexOf(" ")+1);
        System.out.println(initials.toUpperCase());

    }
}
