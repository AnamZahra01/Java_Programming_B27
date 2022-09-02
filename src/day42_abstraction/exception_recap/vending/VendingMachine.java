package day42_abstraction.exception_recap.vending;

public class VendingMachine {

    //select -> unchecked exception
    //chips Gum Candy

    public static String selectValid(int selection) throws InvalidSelectionException { //checked exception

        String item = "";

        if (selection == 1) {
            item = "Chips";

        } else if (selection == 2) {
            //Gum out of stock

            //if (item == 0) { //gum finished

            //}else {
            item = "Gum";
        } else if (selection == 3) {
            item = "Candy";
        } else {
            throw new outOfStockException();//keyword that causes exception to happen , outOfStockException is a class ,we are making a new object of it
        }
        return item;
    }
}
