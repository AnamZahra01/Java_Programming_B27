package office_hours_practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWords {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java","css", "html", "css", "java","css", "javascript", "selenium","target", "java"));

        int value = findTargetWords(list, "java");
        System.out.println(value);

    }
    public static int findTargetWords(ArrayList<String> list, String target){

        int count = 0;
        for(String each : list) {
            if (each.equals(target)) {
                count++;
            }
        }
        return count;
    }
}
