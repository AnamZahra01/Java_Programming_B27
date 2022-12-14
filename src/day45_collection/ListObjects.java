package day45_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {

        List<Character> list1 = new ArrayList<>();
         list1.add('a');
         list1.add('b');
         list1.add(null);
         list1.add('c');
         list1.add('c');
         list1.add('d');
         list1.add('e');
        System.out.println("list1 = " + list1); //list1 = [a, b, null, c, c, d, e]

        List<Character> list2 = new LinkedList<>();
        list2.add('a');
        list2.add('b');
        list2.add(null);
        list2.add('c');
        list2.add('c');
        list2.add('d');
        list2.add('e');
        System.out.println("list2 = " + list2); //list2 = [a, b, null, c, c, d, e]

        List<Character> list3= new Vector<>();
        list3.add('a');
        list3.add('b');
        list3.add(null);
        list3.add('c');
        list3.add('c');
        list3.add('d');
        list3.add('e');
        System.out.println("list3 = " + list3); //list3 = [a, b, null, c, c, d, e]

    }
}
