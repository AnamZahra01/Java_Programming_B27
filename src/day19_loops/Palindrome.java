package day19_loops;

public class Palindrome {
    public static void main(String[] args) {
        /*
        given a string, find if it is palindrome, reads same forward and backward
        i.e: anna
         */

        String word = "anna";
        String reverse = "";
        for( int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i) ;
        }
        if (word.equals(reverse)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

        }

    }

