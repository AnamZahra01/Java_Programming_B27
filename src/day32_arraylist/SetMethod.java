package day32_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(0);
        list.add(12);
        System.out.println(list); //[4, 9, 0, 12]

        list.set(2, 10);
        System.out.println(list); //[4, 9, 10, 12]

        list.set(0, 2);
        System.out.println(list); //[2, 9, 10, 12]
        System.out.println("------------------");

        //Dynamic
        ArrayList<String> strs = new ArrayList<>();
        strs.add("friday");
        strs.add("off");
        strs.add("study");
        strs.add("relax");
        System.out.println(strs);

        int indexOfRelax = strs.indexOf("relax");
        strs.set(indexOfRelax, "coding");
        System.out.println(strs);




    }
}
