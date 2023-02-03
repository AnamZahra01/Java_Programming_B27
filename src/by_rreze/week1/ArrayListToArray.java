package by_rreze.week1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anam","Reem","Henna","Busra"));
        System.out.println(names);

//        Object[] namesArr = names.toArray();
//        System.out.println(Arrays.toString(namesArr));

        String [] arr = new String[names.size()];
         arr = names.toArray(arr);
        System.out.println(Arrays.toString(arr));

        String name = names.get(1);
        System.out.println(name);

    }
}
