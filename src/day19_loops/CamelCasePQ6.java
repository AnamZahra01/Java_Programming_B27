package day19_loops;

import java.util.Scanner;

public class CamelCasePQ6 {
    /*
    Camel Case
Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
Ex:
	Today is SUNDAY
	Output:
	todayIsSunday
     */
    public static void main(String[] args) {

        String str = "Today is SUNDAY";
                    //01234567891011121314

        str = str.toLowerCase();

        String newStr = "";

        for (int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == ' '){

                newStr += str.substring(i+1,i+2).toUpperCase();
                i++;
            } else {
                newStr += str.charAt(i);
            }

        }

        System.out.println(newStr);

    }
}
