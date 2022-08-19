package day24_array;

import java.util.Scanner;

public class ShortestWords {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        //Scanner scan = new Scanner(System.in);
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray"; //scan.nextLine();

        //WRITE YOUR CODE BELOW
        String[] arr = str.split(", ");

        String shortest = arr[0];
        for(String eachWord : arr){
            if(eachWord.length() < shortest.length()){
                shortest = eachWord;
            }
        }
        String shortWords = "";
        for(String eachWord: arr) {
            if(shortest.length() == eachWord.length()) {
                shortWords += eachWord + " ";
            }
        }

        System.out.println(shortWords.trim());

    }
}
