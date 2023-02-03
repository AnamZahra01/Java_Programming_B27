package by_rreze.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayListToLinkedMap {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "PHP", "NodeJS"));
        System.out.println(list);

        Map<Integer,String> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++){

            map.put(i+1,list.get(i));

        }
        System.out.println(map);

    }
}
