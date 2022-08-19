package day31_arraylist;

import java.util.ArrayList;

public class AddToArrayListPQ2 {
    /*
    Practice flow:
Create an ArrayList of Strings add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawk-eye
    remove Thor by index
    remove Iron Man by element
    remove the first index
Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Iron Man");
        list.add("Spider Man");
        list.add("Thor");
        list.add("Captain America");
        list.add("Hawk-eye");
        System.out.println(list);//[Iron Man, Spider Man, Thor, Captain America, Hawk-eye]

        list.remove(2);
        System.out.println(list); //[Iron Man, Spider Man, Captain America, Hawk-eye]

        System.out.println(list.remove("Iron Man")); //true
        System.out.println(list); //[Spider Man, Captain America, Hawk-eye]

        list.remove(0);
        System.out.println(list); //[ Captain America, Hawk-eye]

    }
}
