package day25_arrays;

import java.util.Scanner;

public class AnagramDynamic {
    /*
   Given two Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word
Ex:
 listen
 silent
The letters of the two words are the same so they are anagram
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // System.out.print("Enter first word ");
        String word1 = "listen";//input.nextLine().toLowerCase();
        //System.out.print("Enter second word ");
        String word2 = "silent";//input.nextLine().toLowerCase();

        boolean isAnagram = true;

        if(word1.length() == word2.length()){
            for(int i = 0; i < word1.length(); i++){
                for(int j = 0; j < word2.length(); j++){
                    if ((word1.charAt(i) != word2.charAt(j)) && (j == word2.length()-1)) {
                       // System.out.println("Not-Anagram");
                        isAnagram = false;
                        break;
                    } else{
                            word2 = word2.replaceFirst(word2.substring(j, j + 1), "");
                            break;
                    }
                }
            }
          //  System.out.println("Anagram");
            System.out.println((isAnagram)? "Anagram": " Not Anagram" );
        } else {
           System.out.println("Not-Anagram");
        }

    }
}
