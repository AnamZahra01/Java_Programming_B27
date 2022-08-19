package day32_arraylist;

import java.util.ArrayList;
//remove method needs casting
public class PQs {
     /*
    Practice flow:
Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
     */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Hat");
        System.out.println(words);
        words.add("Shoes");
        System.out.println(words);
        words.add(1, "Jacket"); // using overloaded version of add method
        System.out.println(words);
        words.add(0, "Towel");
        System.out.println(words);
        words.add(1, "Car");
        System.out.println(words);

        System.out.println("----------------------------------");

    /*
 Practice flow:
Create an ArrayList of Strings add these elements:
 Iron Man, Spider-Man, Thor, Captain America, Hawk-eye
 remove Thor by index
 remove Iron Man by element
 remove the first index
Print the ArrayList after each action to see how the change is made
  */

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawk-eye");

        System.out.println(avengers);
        int indexOfThor = avengers.indexOf("Thor");
        avengers.remove(indexOfThor); //removes 2
        System.out.println(avengers);

        avengers.remove("Iron Man");
        System.out.println(avengers);

        avengers.remove(0);
        System.out.println(avengers);
        System.out.println("-----------------------");
        //removing in integer ArrayList
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(800);
        nums.add(300);
        nums.add(400);
        nums.add(300);

        System.out.println(nums);
        //   nums.remove(300); //300 is element, compiler thinks its index, gives indexOutOfBoundsException

        nums.remove((Integer) 300); //300 is being cast to Integer, so it will remove element
        System.out.println(nums);
        System.out.println("-----------------------");


         /*
    Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element
     */

        ArrayList<Character> name = new ArrayList<>();
        name.add('A');
        name.add('n');
        name.add('a');
        name.add('m');
        System.out.println(name);

        for (Character each : name) { //System.out.println(name.get(0));

            System.out.println(each);
        }


    }
}
