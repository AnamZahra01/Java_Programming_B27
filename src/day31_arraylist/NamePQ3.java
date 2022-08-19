package day31_arraylist;

import java.util.ArrayList;

public class NamePQ3 {
    /*
    Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element
     */
    public static void main(String[] args) {

        ArrayList<Character> name = new ArrayList<>();
        name.add('A');
        name.add('n');
        name.add('a');
        name.add('m');
        System.out.println(name); //[A,n,a,m]

        for(Character each : name){
            System.out.println(each);
        }

    }}
