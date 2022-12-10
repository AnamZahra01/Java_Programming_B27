package by_rreze.week7;

import java.util.LinkedHashMap;
import java.util.Map;

/*
4. Map -- Min value
Write a method that can return the minimum value from ta map (DO NOT use sort method)
 */
public class MinimumValue {

    public static void main(String[] args) {

    Map<Integer,Integer> map = new LinkedHashMap<>();
    map.put(1,7);
    map.put(2,2);
    map.put(3,8);
    map.put(4,6);
    map.put(5,4);
        System.out.println("map = " + map);

        int minValue = Integer.MAX_VALUE;

        for(Integer eachValue : map.values()){
            if(eachValue < minValue){
                minValue = eachValue;
        }
    }
        System.out.println("minValue = " + minValue);

    }
}
