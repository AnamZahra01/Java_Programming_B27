package office_hours_practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class EqualsOrLess4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "hi", "java", "python", "SDET"));

        String output = "";
        for(String each : list){
            if(each.length() <= 4){
                output += each + " ";
            }
        }

        System.out.println(output);
    }
}
