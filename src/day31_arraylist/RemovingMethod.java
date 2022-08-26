package day31_arraylist;

import java.util.ArrayList;

public class RemovingMethod {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);//[today, raining, java, flying]


        words.remove(2);
        System.out.println(words); //[today, raining, flying]
        System.out.println(words.remove(0)); //returns the word we are removing -> today
        System.out.println(words);//[raining, flying]


        words.clear(); //deletes all elements
        System.out.println(words); //[]


        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);//[jumping, barn, chicken, cow]

        words.remove("barn");
        System.out.println(words);//[jumping, chicken, cow]


        System.out.println(words.remove("cow")); //true
        System.out.println(words); //[jumping, chicken]
        System.out.println("-------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);

        nums.remove(0); // 0 is int so it removes by index
        System.out.println(nums);//[5, 0, 2, 4]

        Integer a = 0;
        nums.remove(a); // a is Integer, so it removed by element, the element it removes 0
        System.out.println(nums);//[5, 2, 4]

        nums.remove((Integer) 2); // casting the 2 to a Integer type, so I can remove the element 2, not the index 2
        System.out.println(nums);//[5, 4]

        nums.add(0, 4);
        System.out.println(nums);//[4, 5, 4]
        nums.remove((Integer) 4);
        System.out.println(nums);//[5, 4]
    }
}