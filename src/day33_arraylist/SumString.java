package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SumString {
/*
Ex:     Input:  “123”, “34”, “513”
        Output:  [ 6, 7, 9 ]
 */
    public static ArrayList<Integer> sumDigits(ArrayList<String> list) {
        ArrayList<Integer> output  = new ArrayList<>();
        for(String each : list){    //each is every whole number as String format -> 123

            int sum = 0; // container for every number
            for(String eachDigit : each.split("")){ // splits into separate element -> 1,2,3
               sum = sum + Integer.parseInt(eachDigit);
            }

            output.add(sum);
        }
        return output;
    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34","513"));
        System.out.println(list);
        System.out.println(sumDigits(list));
    }
}
