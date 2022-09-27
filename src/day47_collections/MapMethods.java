package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        //Map<key , value> -> keys should be unique
        Map<Character ,Integer> gradeScale = new HashMap<>();

        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);
        gradeScale.put('Z', 1000);
        gradeScale.put('Z', 500);

        System.out.println(gradeScale);

        System.out.println(gradeScale.get('B'));

        System.out.println(gradeScale.remove('B'));
        System.out.println(gradeScale);

        System.out.println(gradeScale.containsValue(500));
        System.out.println(gradeScale.containsKey('D'));


    }
}
