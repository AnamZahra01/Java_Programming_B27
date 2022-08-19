package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {

        String s = "ABCD123$%#@&456EFG!";
        ArrayList<String> letters = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(letters);
        letters.removeIf( p -> !Character.isLetter(p.charAt(0)));
        System.out.println(letters);

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList(s.split("")));
        numbers.removeIf( str -> !Character.isDigit(str.charAt(0))); // to convert String to char we used charAt(0) to read the only element there
        System.out.println(numbers);

        ArrayList<String> special = new ArrayList<>(Arrays.asList(s.split("")));
        special.removeAll(letters);
        special.removeAll(numbers);
        System.out.println(special);

//       ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello", "World", "Friday"));
//       words.forEach(e -> System.out.println(e.charAt(0)));


    }
}
