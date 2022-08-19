package day24_array;

import java.util.Arrays;

public class TestPQ {
    public static void main(String[] args) {

        String str = "Today i friday. Have a good weekend!";
        String[] words = str.split(" ");
        String[] revers1 = new String[words.length];
        String revers = "";
        int j = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            revers += words[i] + " ";
            revers1[j++] = words[i];
        }
        System.out.println(revers.trim());
        System.out.println(Arrays.toString(revers1));
    }
}
