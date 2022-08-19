package day24_array;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //String type into Array type
        String s = "hello world";



        char[] letters = s.toCharArray();
        System.out.println(letters);
        System.out.println(Arrays.toString(letters));

        for(char eachLetter : s.toCharArray()){ //letters
            System.out.println(eachLetter);
        }
        System.out.println("-----------------------");

        String str = "monday, tuesday, wednesday, thursday ,friday,saturday,sunday";
        System.out.println(Arrays.toString(str.split(",")));
        for(String eachDay : str.split(",")){
            System.out.println(eachDay);
        }

        String str4 = "mississippi";
        System.out.println(Arrays.toString(str4.split("si")));


System.out.println(str.split("0"));
    }
}
