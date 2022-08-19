package hacker_rank_tasks;

import java.util.Scanner;

public class FormatInput {
    public static void main(String[] args) {


        System.out.println("================================");
        Scanner input = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            String word = input.nextLine();

            String str1 = word.substring(0, word.indexOf(" "));
            String num = word.substring(word.indexOf(" ")).trim();
            for (int i = str1.length(); i <= 15  ; i++) {
                str1 += " ";
            }

            if (num.length() == 1) {
                str1 += "00" + num;
            } else if (num.length() == 2) {
                str1 += "0" + num;
            } else {
                str1 += num;
            }
            System.out.println(str1);

        }

        System.out.println("================================");

    }
}

