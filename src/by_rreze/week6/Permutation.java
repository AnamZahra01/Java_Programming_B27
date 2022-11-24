package by_rreze.week6;

public class Permutation {
    //1.Array -- permutation combinations
    //Given an array of 3 characters print all permutation combinations from the given characters

    static void printPermutn(String str, String ans) {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }
        public static void main (String[]args)
        {
            String s = "abc";
            printPermutn(s, "");
        }


}
