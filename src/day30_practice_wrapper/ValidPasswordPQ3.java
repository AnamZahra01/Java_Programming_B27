package day30_practice_wrapper;

public class ValidPasswordPQ3 {
    /*
    Valid Password
    Given a String password find out if it is a valid password
    Requirements:
        Must have at least 8 characters
        Must have at least 1 uppercase letter
        Must have at least 1 lowercase letter
        Must have at least 1 number
        Must have one of the follow special characters:
            ! @ # $ % ^ & *
     */
    public static void main(String[] args) {
        String str = "C1&2ABCD";
        int countUpper = 0, countLower = 0, countNumber = 0, countSpecial = 0;
        String output = "";
        if(str.length() >= 8) {

            for (int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                if (Character.isLowerCase(letter)) {
                    countLower++;
                } else if (Character.isUpperCase(letter)) {
                    countUpper++;
                } else if (Character.isDigit(letter)) {
                    countNumber++;
                } else { //isSpecial
                    countSpecial++;
                }
            }

            if(countNumber >= 1 && countLower >= 1 && countUpper >= 1 && countSpecial >= 1) {
                System.out.println("valid password");
            }
            if(!(countNumber >= 1)){
                System.out.println(str + " must have at least 1 number");
            }
            if(!(countLower >= 1)){
                System.out.println(str + " must have at least 1 lower case");
            }if(!(countUpper >= 1)){
                System.out.println(str + " must have at least 1 upper case");
            }if(!(countSpecial >= 1)){
                System.out.println(str + " must have at least 1 special character");
            }
        }else{
            output += "Password must have at least 8 characters";

        }

        System.out.println(output);
    }
}
