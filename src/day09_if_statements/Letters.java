package day09_if_statements;

public class Letters {
    public static void main(String[] args) {

        char letter = 'a';

        if (letter >= 'A' && letter <= 'Z'){ // (letter >= 65 && letter <= 90)
            System.out.println(letter+ " is upper case letter");
        }
        if (letter >= 'a' && letter <= 'z') // (letter >= 97 && letter <= 122)
            System.out.println(letter+ " is a lower case letter");

    }
}
