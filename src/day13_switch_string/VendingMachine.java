package day13_switch_string;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        /*
        snacks 1,2,3 ->
        drinks 1,2,3 ->
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vending Machine. Select the manu you want to see: \nSnacks \nDrinks");
        String menu = input.next();

        switch (menu){
            case "Snacks":
                System.out.println("Pick the snack:\n 1)Chips 2)Cookies 3)Pretzels 4)Candy"); // make variable and call in both cases
                int snackOption = input.nextInt();

                if (snackOption == 1){      //multi branch
                    System.out.println("Chips are selected");
                } else if (snackOption == 2) {
                    System.out.println("Cookies are my favourite");
                } else if (snackOption == 3) {
                    System.out.println("Pretzels dispensing");
                } else if (snackOption == 4) {
                    System.out.println("Candy coming right up");
                } else {
                    System.out.println("Not a valid option");
                }
                break;

            case "Drinks":
                System.out.println("Pick the drink number:\n1)Juice 2)Soda");
                int drinkOption = input.nextInt();

                if (drinkOption == 1){
                    System.out.println("Giving Juice");
                } else if (drinkOption == 2) {
                    System.out.println("Giving Soda");
                }
                break;
        }

    }
}
