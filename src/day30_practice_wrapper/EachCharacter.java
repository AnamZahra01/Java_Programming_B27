package day30_practice_wrapper;

public class EachCharacter {
    public static void main(String[] args) {
        /*
        task: given a String, separate each type of character into a different array
         */

        String s = "49jaVA$33*&EOWe82";
        String upper = "", lower = "", number = "", special = "";

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);

            if(Character.isUpperCase(letter)){
                upper += letter;
            } else if (Character.isLowerCase(letter)){
                lower += letter;
            } else if (Character.isDigit(letter)) {
                number += letter;
            } else {
                special += letter;
            }
        }

        System.out.println("uppercase: " +upper + "\nlowercase: "  + lower +"\nnumber: "+ number + "\nspecial characters: " + special);
    }
}
