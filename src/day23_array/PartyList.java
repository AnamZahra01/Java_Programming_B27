package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
        //gathering name of people coming on the party

        Scanner input = new Scanner(System.in);
        System.out.print("How many people are coming to the party? ");
        int size = input.nextInt();

        String[] names = new String[size]; //new String[input.nextInt()]; then don't do line 11
        System.out.println(Arrays.toString(names));

        for(int i = 0; i < names.length; i++ ){ //traditional for loop -> for writing
            System.out.println("Enter the name of person " + (i + 1));
            String guest = input.next();
            names[i] = guest; //or names[i] = input.next();
        }
        System.out.println("Final list coming to the party");
        System.out.println(Arrays.toString(names));

    }
}
