package day09_if_statements;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Can you please tell me your good name?");
        String name = input.nextLine();

        System.out.println("Are you a student? T/F");
        boolean isStudent = input.nextBoolean();
        String report = ""; //empty space, String type

        if(isStudent){
            System.out.println("What are you studying? ");
            String subject = input.next();
            //System.out.println(subject);
            report += "So "+name+ "! you study: " +subject+ " that is cool!!"; //values in different if blocks, grouped together to make report

        }
        System.out.println("Do you live in a city? T/F");
        //boolean inCity = input.nextBoolean();
        //if(inCity){

        if(input.nextBoolean()){  //using boolean from scanner, instead of storing into a boolean variable
            System.out.println("Cool,I love cities too. Cities are loud and fun");
        } else {
            System.out.println("How many years have you lived in suburb?");
            int years = input.nextInt();
            //System.out.println(years);
            report += "\nWell! Living in suburb for " +years+ "years";

        }
        System.out.println(report);
        input.close();
    }
}
