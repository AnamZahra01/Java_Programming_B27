package day47_collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String > map1 = new HashMap<>();

        //keys are integer
        //values are String

        //map1.add(); -> no add method

        map1.put(4, "four");
        map1.put(1, "one");
        map1.put(10, "ten");
        map1.put(5, "five");
        map1.put(-5, "negative five");
        map1.put(-5, "negative five");
        map1.put(null,"empty");

        System.out.println(map1); //{null=empty, 1=one, 4=four, -5=negative five, 5=five, 10=ten}
        //==================================

        Map<Integer, String > map2 = new LinkedHashMap<>();


        map2.put(4, "four");
        map2.put(1, "one");
        map2.put(10, "ten");
        map2.put(5, "five");
        map2.put(-5, "negative five");
        map2.put(-5, "negative five");
        map2.put(null,"empty");

        System.out.println(map2);//{4=four, 1=one, 10=ten, 5=five, -5=negative five, null=empty}

        //==================================

        Map<Integer, String > map3 = new TreeMap<>();


        map3.put(4, "four");
        map3.put(1, "one");
        map3.put(10, "ten");
        map3.put(5, "five");
        map3.put(-5, "negative five");
        map3.put(-5, "negative five");
       // map3.put(null,"empty");

        System.out.println(map3); //{-5=negative five, 1=one, 4=four, 5=five, 10=ten}
        //===========================

        Map<Integer, String > map4 = new Hashtable<>();


        map4.put(4, "four");
        map4.put(1, "one");
        map4.put(10, "ten");
        map4.put(5, "five");
        map4.put(-5, "negative five");
        map4.put(-5, "negative five");
       // map4.put(null,"empty");

        System.out.println(map4); //{10=ten, -5=negative five, 5=five, 4=four, 1=one}

    }

}
