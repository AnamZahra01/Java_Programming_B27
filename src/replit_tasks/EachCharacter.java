package replit_tasks;

import java.util.Scanner;

public class EachCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println(countLetters(in.next())); //aaabbcccc
        System.out.println(countLetters("aaabbcccc"));
    }

    public static String countLetters(String str){

        String output = "";

        for(int i = 0;  i < str.length(); i++){
            if(!output.contains(""+str.charAt(i))){
                int count = 0;

                for(int j = 0;  j < str.length(); j++){

                    if(str.charAt(i)==str.charAt(j)){
                        count++;
                    }
                }

                output +=count;
                output += str.charAt(i);
            }
        }

        return output;
    }
}
/*
NOTES:
for each iteration of outer loop, inner loop goes from beginning to end


 */