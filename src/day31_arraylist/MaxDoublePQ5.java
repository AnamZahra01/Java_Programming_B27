package day31_arraylist;

import java.util.ArrayList;

public class MaxDoublePQ5 {
    /*
    Try to loop:
Create an ArrayList of Double elements
Fill the ArrayList with some values
Find the max element from the ArrayList
     */
    public static void main(String[] args) {

        ArrayList<Double> elements = new ArrayList<>();
        elements.add(1.1);
        elements.add(2.2);
        elements.add(3.3);
        elements.add(7.7);
        elements.add(4.4);
        elements.add(5.5);
        System.out.println(elements);

        Double max = elements.get(0);
        for(Double each : elements){
            if(each > max){
                max = each;
            }
        }

        System.out.println(max);

    }
}
