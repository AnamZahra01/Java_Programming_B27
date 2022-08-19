package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSumPQ5 {
    /*
    String Sum
Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:     Input:  “123”, “34”, “513”
        Output:  [ 6, 7, 9 ]
     */
    public static void main(String[] args) {
        ArrayList<String> num = new ArrayList<>(Arrays.asList("123","34","513"));
        ArrayList<Integer> output = new ArrayList<>();

        for(int i = 0; i < num.size(); i++){       //123
           String [] arr = num.get(i).split("");  //1 ,2 ,3
            int sum = 0;
            for(int j = 0; j < num.get(i).length(); j++){
                sum = sum + Integer.parseInt(arr[j]);
            }
            output.add(sum);
        }
        System.out.println(output);
    }
}
/*
TakeAway: convert String to Array -> use split 123 -> 1,2,3
    convert every letter to int -> parseInt

 */
