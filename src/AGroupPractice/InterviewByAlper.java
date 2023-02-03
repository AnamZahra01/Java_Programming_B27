package AGroupPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewByAlper {

    /*
    Given 2 lists -> merge to 1 list and sort them in ascending order
     */

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 8, 9));
//2,1,5,4
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        System.out.println("list1 = " + list1);

        Collections.sort(list1);


//        for (int i = 0; i < list1.size() - 1; i++) {
//
//            if (list1.get(i + 1) < list1.get(i)) { //2<1
//                int temp = list1.get(i);
//                list1.set(i, list1.get(i + 1));
//                list1.set(i + 1, temp);
//
//            }
//            i=i-1;
//        }
//

            System.out.println("list1 = " + list1);


            //select firstName, lastName, address, state from Person p join Address a
        //where p.person_id IN a.address_ID
    }
}
