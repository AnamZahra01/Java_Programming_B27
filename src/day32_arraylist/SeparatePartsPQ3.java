package day32_arraylist;

import java.util.ArrayList;

public class SeparatePartsPQ3 {
   /* Separate Parts

    Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

    Ex:
    str = "ABCD123$%#@&456EFG!"
    list1: {$, %, #, @, &, !}
    list2: {A, B, C, D, E, F, G}
    list4: {1, 2, 3, 4, 5, 6}

    */
   public static void main(String[] args) {


    String str = "ABCD123$%#@&456EFG!";

    ArrayList<Character> charList = new ArrayList<>();
    for(int i = 0; i < str.length(); i++){
        charList.add(str.charAt(i));
    }
       System.out.println(charList);

       ArrayList<Character> list1 = new ArrayList<>();
       ArrayList<Character> list2 = new ArrayList<>();
       ArrayList<Character> list3 = new ArrayList<>();

       for(int i = 0; i < charList.size(); i++) {
           Character letter = charList.get(i);
           if (Character.isUpperCase(letter)) {
               list1.add(letter);
           } else if (Character.isDigit(letter)) {
               list2.add(letter);
           } else {
               list3.add(letter);
           }
       }
       System.out.println(list1);
       System.out.println(list2);
       System.out.println(list3);

    }
}
