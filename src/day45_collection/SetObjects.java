package day45_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {

        //Sets have unique values
        Set<String> set1 = new HashSet<>(); //random order , unique
        set1.add(null);
        set1.add(null);
        set1.add("5.0");
        set1.add("Hello World");
        set1.add("java");
        set1.add("#zebra");
        set1.add("#zebra");
        System.out.println("set1 = " + set1); //set1 = [null, Hello World, java, #zebra, 5.0]


        Set<String> set2 = new LinkedHashSet<>(); //maintains insertion order, unique
        set2.add(null);
        set2.add(null);
        set2.add("5.0");
        set2.add("Hello World");
        set2.add("java");
        set2.add("#zebra");
        set2.add("#zebra");
        System.out.println("set2 = " + set2); //set2 = [null, 5.0, Hello World, java, #zebra]


        Set<String> set3 = new TreeSet<>(); // maintains natural order (sorted) , unique
      //  set3.add(null); //nulls not allowed
        set3.add("5.0");
        set3.add("Hello World");
        set3.add("java");
        set3.add("#zebra");
        set3.add("#zebra");
        System.out.println("set3 = " + set3); //set3 = [#zebra, 5.0, Hello World, java]


        // set3.get(0); no indexes in Set type so no get method
    }
}
