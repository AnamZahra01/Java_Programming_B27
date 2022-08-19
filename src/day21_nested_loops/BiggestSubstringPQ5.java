package day21_nested_loops;

public class BiggestSubstringPQ5 {
    /*
    By saim:
    Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:  aaabbbcccccddddee
        Output:  ccccc
     */
    public static void main(String[] args) {

        String str = "aaabbbcccccddddeeeeee";
        String longest = "";
        String each = "";

        for (int i = 0; i < str.length()-1 ; i++) {

            each += str.charAt(i); // adds the characters at the String i to the String each

            if (str.charAt(i) != str.charAt(i + 1) ) {

                if (each.length() > longest.length()) {
                    longest = each;
                }

                each = ""; //resetting for the next part
            }

            if(i == str.length() -2 && str.charAt(i) == str.charAt(i + 1)){
                each += str.charAt(i + 1);
                if(each.length() > longest.length()){
                    longest = each;
                }
            }

        }
            System.out.println(longest);
    }
}
