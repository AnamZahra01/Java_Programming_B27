package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    /*
    Ex:
Input:  {"one", "hi", "hold}
Output: [ ***, **, **** ]
     */
    public static ArrayList<String > hidePassword(ArrayList<String> list) {
      ArrayList<String> hidden = new ArrayList<>();
        for(String each : list){

           hidden.add(numOfStars(each.length()));
        }
        return hidden;
    }
    /*
    helper method:
     */

    public static String numOfStars(int length){
        String stars = "";
        for(int i = 0; i < length; i++){
            stars += "*";
        }
        return stars;
    }

    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>(Arrays.asList("one", "two", "three", "monday"));
        System.out.println(hidePassword(list));
    }
}
