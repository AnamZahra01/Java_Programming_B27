package day24_array;

import java.util.Arrays;

public class PQ3 {
    /*
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam","Albania", "Portugal", "Philippines", "Armenia",  "Colombia","Honduras", "Indonesia", "United States"};
Find and print all the first and last characters
Find and print all the middle character
Print each country as a char array
     */
    public static void main(String[] args) {
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam","Albania", "Portugal", "Philippines", "Armenia",  "Colombia","Honduras", "Indonesia", "United States"};

        for(String eachCountry : countries){
            System.out.println("first and last char: \t" + eachCountry.charAt(0) + "" + eachCountry.charAt(eachCountry.length()-1));

            if(eachCountry.length() % 2 != 0){
                System.out.println("Middle characters: \t\t" + eachCountry.charAt(eachCountry.length()/2));
            } else {
                System.out.println("Middle characters: \t\t" + eachCountry.charAt(eachCountry.length()/2 -1) + "" +
                        eachCountry.charAt(eachCountry.length()/2));
            }

            char[] arr = eachCountry.toCharArray();
            System.out.println("Character array: \t\t" + Arrays.toString(arr));
            System.out.println();
        }

    }
}
