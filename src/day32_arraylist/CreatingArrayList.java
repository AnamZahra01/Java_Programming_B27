package day32_arraylist;

import java.util.ArrayList;

public class CreatingArrayList {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("friday");
        list1.add("java");
        list1.add("movies");
        list1.add("sports");
        System.out.println(list1);//[friday, java, movies, sports]

        ArrayList<String> list2 = list1;
        list2.add("soft skills");
        System.out.println(list1);//[friday, java, movies, sports, soft skills]
        System.out.println(list2);//[friday, java, movies, sports, soft skills]

        ArrayList<String> list3 = new ArrayList<>(list1); // creating new ArrayList object
        list3.remove(0);

        System.out.println("list 1: " + list1);//[friday, java, movies, sports, soft skills]
        System.out.println("list 3 : " + list3);//[java, movies, sports, soft skills]

    }
}
