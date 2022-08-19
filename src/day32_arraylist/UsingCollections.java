package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollections {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(126, 578, 270, 323, 23, 809, 817, 610, 435, 398));

        list.addAll(Arrays.asList(2,3,4));

        System.out.println(Collections.max(list)); //817
        System.out.println(Collections.min(list)); //23

        System.out.println("Before: " + list);
        Collections.sort(list); // in ascending order
        System.out.println("After: " + list);

        System.out.println("2nd min: " + list.get(1)); // 126
        System.out.println("2nd max: " + list.get(list.size() - 2)); //809


        // alternative: list.remove(Collection.max(list))
        // then use Collections.max(list) -> 2 find 2nd max

        Collections.shuffle(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

    }
}
