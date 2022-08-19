package day33_arraylist;

import my_utils.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromePQ1 {
    /*
    All Palindrome: Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings. (Ignore case sensitivity)
    Ex: Input:  "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
    Output:      Anna, Racecar, Level, Eye
     */

    public static ArrayList<String> isPalindrome(ArrayList<String> list){

        System.out.println(list);
        ArrayList<String> output = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
        String temp = "";
            for (int j = list.get(i).length() -1; j >= 0; j--){
                temp += ""+list.get(i).charAt(j);
            }
            if(temp.equalsIgnoreCase(list.get(i))) {
                output.add(list.get(i));
            }}
        return output;
    }

    public static ArrayList<String> isPalindrome2(ArrayList<String> list) {

        list.removeIf(p -> !p.equalsIgnoreCase(StringUtil.reverse(p)));
        return list;

    }
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(isPalindrome(input));
        System.out.println(isPalindrome2(input));

        }
}
