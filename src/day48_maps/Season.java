package day48_maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Season {
    public static void main(String[] args) {

        //avg temp each season
        Map<String, Double> temperature = new HashMap<>(); //Random, accepts null
        temperature.put("Summer" , 85.0);
        temperature.put("Fall" , 65.2);
        temperature.put("Winter" , 30.5);
        temperature.put("Spring" , 68.2);
        System.out.println("temperature = " + temperature); //temperature = {Winter=30.5, Summer=85.0, Fall=65.2, Spring=68.2}


        //Find the average temperature for all seasons

        System.out.println("Average for winter " + temperature.get("Winter")); //Average for winter 30.5
        System.out.println("Average for spring " + temperature.get("Spring")); //Average for spring 68.2

        System.out.println( temperature.containsKey("mid summer")); //false
        System.out.println( temperature.containsValue(100.0)); //false

        //are there any duplicate values?
        System.out.println(temperature.values()); //[30.5, 85.0, 65.2, 68.2]
        int before = temperature.values().size();
        int after = new HashSet<>(temperature.values()).size(); //hashSet has unique values

        System.out.println(before == after ? "No duplicates" : "Has duplicates"); //No duplicates

        //find average temperature for all seasons
        System.out.println(avgTemp(temperature)); //62.224999999999994

    }
    public static double avgTemp(Map<String , Double> map){

        double average = 0;

        for(double eachTemp : map.values()){
            average += eachTemp;
        }
        return average / map.size();
    }

}
/*
primitive type takes less memory as compared to object type
 */
