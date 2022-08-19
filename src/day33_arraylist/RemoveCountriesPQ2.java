package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountriesPQ2 {
    /*
    Remove Countries
Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7
@param nums - The given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
Output: "Japan", "Korea", "Turkey", "Canada"
     */

    public static ArrayList<String> isLengthSeven(ArrayList<String> list) {
        ArrayList<String> output = new ArrayList<>();

        for (String each : list) {
            if (each.length() < 7) {
                output.add(each);
            }
        }
        return output;
    }

        //calling method removeIf();
        public static ArrayList<String> isLengthSeven2(ArrayList<String> list){
        list.removeIf(p -> p.length()>7);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
            System.out.println(countries);
            System.out.println(isLengthSeven(countries));
            System.out.println(isLengthSeven2(countries));
    }
}
