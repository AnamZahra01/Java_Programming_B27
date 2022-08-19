package day20_loops;

public class CountWordsPQ1 {
    /*
    Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words //length
            Output:
                4
     */

    public static void main(String[] args) {

        String str = "java is fun";     //number of spaces are helping us to count the words
                    //012345678910 -> index values
       int noOfWords = 1;
        for(int i = 0; i < str.length() ; i++){       // i=0,1,2,3..... length of str (sentence)
            if (str.charAt(i) == ' ' )  {             // T == " " (false)
                noOfWords++;
            }
        }

        System.out.println("Total words: " + noOfWords);

    }
}
/*
ALGO:
1. str: This has multiple words
2. for loop -> str
 */