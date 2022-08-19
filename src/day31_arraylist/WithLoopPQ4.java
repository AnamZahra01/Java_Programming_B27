package day31_arraylist;

import java.util.ArrayList;

public class WithLoopPQ4 {
    /*
    Try to loop:
Create an ArrayList of Characters
Fill the ArrayList with letters from a-z
Print the ArrayList of all the characters

Manually remove each vowels and print the new ArrayList
     */
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>();
        for(Character i = 'a'; i <= 'z'; i++ ){
            letters.add(i);
        }
        System.out.println(letters);
        System.out.println();

        letters.remove((Character) 'a');
        letters.remove((Character) 'e');
        letters.remove((Character) 'i');
        letters.remove((Character) 'o');
        letters.remove((Character) 'u');
        System.out.println(letters);

    }
}
