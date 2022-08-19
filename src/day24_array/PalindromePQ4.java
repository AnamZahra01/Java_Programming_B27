package day24_array;

import day19_loops.Palindrome;

public class PalindromePQ4 {
    /*
     Longest Palindrome
	Given a String array. Find the longest Palindrome String in your array.
		Ex:
		Input: ["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		Output: racecar
		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome
     */
    public static void main(String[] args) {

        String[] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String palindromeWords = "";
        String largestPalindrome = "";
        for (String eachWord : arr) { //String java

            String reverseWord = "";
            for (int i = eachWord.length() -1; i >= 0; i--) {
                reverseWord += "" + eachWord.charAt(i);
            }
            if(reverseWord.equalsIgnoreCase(eachWord)) {
                palindromeWords += reverseWord + " ";

                if(eachWord.length() > largestPalindrome.length() ){
                    largestPalindrome = eachWord;
                }
            }
        }

        System.out.println("Palindrome words: " + palindromeWords);
        System.out.println("Largest Palindrome: " + largestPalindrome);
    }
}
