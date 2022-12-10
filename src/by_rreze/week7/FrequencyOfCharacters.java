package by_rreze.week7;

import java.util.LinkedHashMap;
import java.util.Map;

/*

2.Map -- Frequency of Characters
Write a method that prints the frequency of each character from a String

 */
public class FrequencyOfCharacters {

    public static Map<Character,Integer> frequencyOfChar(String str){

        char [] arr = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i  < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        return map;
    }
    public static void main(String[] args) {

        String str = "hello world";
        System.out.println("frequencyOfChar= " + frequencyOfChar(str));

    }
}
