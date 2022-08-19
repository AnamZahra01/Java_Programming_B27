
    /*
    PQ-01:  Create a class ChooseLanguage ask the user to enter a number based on the language they wanted to use.
	1 - English
	2 - Spanish
	3 - Turkish
	4 - Russian
	5 - French
based on the number they picked print a message:
	1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"

   Extra: add your own options
     */
    package day10_if_statements.practice_questions;
    import java.util.Scanner;

    public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                     // object of Scanner class

        System.out.println("Enter a number based on the language you want to use. \n1 - English \n2 - Spanish\n3 - Turkish\n4 - Russian \n5 - French");
        int number = input.nextInt();                                // User input
        String output = " ";

        // Multibranch if statements
        if (number == 1){
            output = "hello, thank for your call";
        } else if (number == 2){
            output = "hola, gracias para llamar";
        } else if (number == 3){
            output = "merhaba, aradiginiz icin tesekkurler";
        } else if (number == 4) {
            output = "privet, spasibo za vash zvonok";
        } else if (number == 5){
            output = "Merci ,pour votre appel";
        }

        // printing statement: control with if else
        if (number > 0 && number <= 5) {
            System.out.println(output);
        } else{
            System.out.println("Please enter a number from 1 to 5");
        }

    }
}
