package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLettersPQ6 {
    /*
    Count Letters
Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
Ex:     Input:      ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
        letter: ‘a’
        Output: 6
     */
    public static int countLetters(ArrayList<String> list, char letter){

        int count = 0;
        for(int i = 0 ; i < list.size(); i++){
            for(int j = 0; j < list.get(i).length(); j++){
                if(letter == list.get(i).charAt(j)){
                    count++;
                }}}
        return count;
    }

    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(countLetters(input, 'a'));
        System.out.println(countLetters(input, 's'));
    }
}
