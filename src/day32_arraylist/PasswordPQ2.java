package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class PasswordPQ2 {
    /*
    Hide passwords
Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}
Output:
[ ***, **, **** ]
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "hi", "hold","java","CYDEO","ANAM"));
        System.out.println(list);

        ArrayList<String> password = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String stars = "";
            for (int j =0; j < list.get(i).length(); j++){
                stars += "*" + "";
           }
            password.add(stars);
        }
        System.out.println(password);
    }
}
