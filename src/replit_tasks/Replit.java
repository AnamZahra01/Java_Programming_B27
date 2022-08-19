package replit_tasks;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();

    int count = 0;
    int count2 = 0;

        for (int i = 0; i < sentence.length() - 3; i++) {
        if (sentence.substring(i, i + 4).equals("java")) {
            count++;

        }
    }

        for (int j = 0; j < sentence.length() - 5; j++) {
        if (sentence.substring(j, j + 6).equals("phyton")) {
            count2++;
        }

    }
        System.out.println((count ==count2)?"True":"False");
}
}

