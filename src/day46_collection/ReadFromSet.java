package day46_collection;

import java.util.*;

public class ReadFromSet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);
        System.out.println(set); //[-1, 34, 4, 5, 9, 12]

        //set.get(); there is no get method, how do you access the elements?

        for(int each : set){
            if(each > 10){
                System.out.println(each); //34 , 12
            }
        }

        Set<String> handles = new HashSet<>();
        handles.add("daad2141124");
        handles.add("dsauehui223");

        for(String each : handles){
            if(!each.equalsIgnoreCase("daad2141124")){
                // switch to the other handle
            }
        }

        Set<String> set3 = new HashSet<>();
        set3.add("hello");
        set3.add("bye");
        set3.add("java");
        set3.add("world");
        System.out.println(set3); //[java, world, hello, bye]

        List<String> list = new ArrayList<>(set3);
        System.out.println(list); //[java, world, hello, bye]
        System.out.println(list.get(0)); //java

        // Remove duplicate occurrences of each character
        String s = "AAAABBBBCCCCDDDD";
        System.out.println(new LinkedHashSet<>( Arrays.asList(s.split("")))
                .toString().replace(", ", "").replace("[", "").replace("]", "") //ABCD
        );


    }

}
