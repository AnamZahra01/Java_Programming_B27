package day31_arraylist;

import java.util.ArrayList;

public class AddMethods {
//Dynamic arrays with internal capacity of 10
    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('z');
        System.out.println(letters);
        System.out.println(letters.size()); //number of elements -> 4

        System.out.println(letters.get(0)); //j
        System.out.println(letters.get(1));//a
        System.out.println(letters.get(2));//v
        System.out.println(letters.get(3));//z


        letters.add(0,'$');
        System.out.println(letters);

        letters.add(3,'8');
        System.out.println(letters);

    }


}
