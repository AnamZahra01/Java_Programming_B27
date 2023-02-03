package by_rreze.week7;
/*
1.Map -- Sort the map by values
Write a method that can sort the Map by values
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static List<Integer> sorted(Map<Integer,Integer> map){

        ArrayList<Integer> list = new ArrayList<>(map.values()); //storing mapValues into List
        for(int i = 0 ; i  < list.size();  i++) {

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        Map<Integer,Integer> map = new TreeMap<>();
        map.put(0,4);
        map.put(1,5);
        map.put(2,2);
        map.put(3,4);
        map.put(4,7);
        System.out.println("sorted(map) = " + sorted(map));


    }

}
