package day32_arraylist;

import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {

    public static int searchInList(ArrayList<String> list, String target) {
        int count = 0;
        for(String each : list){
            if(each.equalsIgnoreCase(target)){
                count++;
            }
        }

     return count;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("friday", "java", "summer", "reading", "coding","java","coding","java","summer"));

        System.out.println(searchInList(list,"java"));
        System.out.println(searchInList(list,"coding"));
        System.out.println(searchInList(list,"summer"));
        System.out.println(searchInList(list,"friday"));

        //testing EasyData

        ArrayList<String> days = EasyData.getDaysOfWeek(); //method in my_utils.EasyData
        System.out.println(days);

    }
}
//use for each to read only