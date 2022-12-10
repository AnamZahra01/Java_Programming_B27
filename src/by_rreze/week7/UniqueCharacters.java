package by_rreze.week7;

import java.util.LinkedHashMap;
import java.util.Map;

/*
3. Map -- Unique character from String
Write a method that will return the unique characters from a string
 */
public class UniqueCharacters {
    public static Map<Character,Integer> uniqueChar(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] arr = str.toCharArray();

        for (char outerEach : arr) {
            int count = 0;
            for (char innerEach : arr) {

                if (outerEach == innerEach) {
                    count++;
                }
            }
            if (count == 1) {
                map.put(outerEach, count);
            }
        }
      return map;
    }
    public static void main(String[] args) {

        String str = "hello world";
        System.out.println("uniqueChar= " + uniqueChar(str));

    }
}
