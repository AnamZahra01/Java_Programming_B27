package day14_string;

import java.util.Locale;

public class StringMethod1 {
    public static void main(String[] args) {

        String item = "pen"; // in string pool
        String item2 = new String ("pen"); //directly in heap
        System.out.println(item == item2); // checks if they are same objects, compares the address

        String item3 = new String("pen");
        System.out.println(item2 == item3); // compare 2 objects, both in heap, but they are 2 different objects

        //.equals(): compare the value of the String, if the characters are same.
        System.out.println(item.equals(item2));
        System.out.println(item2.equals(item3)); //compares the value i.e. in password we check value
        System.out.println(item3.equals("pen"));
        System.out.println(item3.equals("Pen"));

        System.out.println(item.equalsIgnoreCase("Pen")); // matches characters, ignoring all cases. (upper/ lower)
        System.out.println("--------------------------------------");

        String userName = "James";
        String password = "Bond007";
        System.out.println(userName.equals("James"));   //true
        System.out.println(userName.equalsIgnoreCase("jamEs")); //true, ignores cases
        System.out.println(password.equals("bond007")); //false ; compares characters word by word

        // Methods also return something. Here true/false.
        System.out.println("--------------------------------------");

        String day = "Tuesday";
        System.out.println(day.length()); // counts characters, gives back int
        String day2 = "Friday";
        System.out.println(day2.length());
        String day3 = " hello ";          //space counts as a character.
        System.out.println(day3.length());
        System.out.println(day3);

        System.out.println("--------------------------------------");
        String word = "Summer";
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        word.toLowerCase(); // will not do anything, cz String is immutable.
        System.out.println(word);

        word = word.toUpperCase(); //to make line 46,47 work ,assign variable
        System.out.println(word);
        System.out.println("--------------------------------------");

        System.out.println(word.toLowerCase());
        String sentence = "hello! My NAme is Anam";
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence);  // prints original String, cz String is immutable.
       String newSentence = sentence.toUpperCase(); //new variable to store new upperCase String.
        System.out.println(newSentence);
        System.out.println(sentence);
        System.out.println("--------------------------------------");

        //trim(); removes all the extra spaces from String

        String s = " Java IS Fun ";
        System.out.println(s.length());
        s = s.trim(); // will remove spaces from beginning and end, middle spaces will not be touched.
        System.out.println(s);
        System.out.println(s.length());
        System.out.println("--------------------------------------");



    }
}
