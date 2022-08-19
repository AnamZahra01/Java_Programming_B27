package day24_array;

import java.util.Arrays;

public class ReversewTheSentence {
    public static void main(String[] args) {

        String str = "Today is Friday. Have a good weekend!";

        System.out.println(str);

        //reverse: weekend! good a Have Fridaay. is Today
        String [] words = str.split(" ");
        String reverse = "";

        for(int i = words.length -1; i >= 0; i--){

            reverse += words[i] + " ";
        }
        System.out.println(reverse.trim());

    }
}
