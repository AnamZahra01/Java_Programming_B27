package day24_array;

public class ReverseWord {
    public static void main(String[] args) {

        String str = "Today is Friday. Have a good weekend!";

        //reverse: weekend! good a Have Fridaay. is Today
        String [] words = str.split(" ");
        String reverse = "";

        for(String each : words) { // goes through one element at a time -> String to Array
            System.out.println(each);

            String eachReverse = "";
            for (int i = each.length() - 1; i >= 0; i--) { // reversing String from last index to 0
                eachReverse += "" + each.charAt(i);
            }

            System.out.println(eachReverse);
            reverse += eachReverse + " ";

        }
        System.out.println(reverse);
    }
}
/*
ALGO:

 */