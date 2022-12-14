package day42_abstraction.exception_recap.vending;

public class VendingMachine {

    //select -> unchecked exception
     /*
        Chips   Gum   Candy
         1        2      3
     */
    public static String select(int selection){

        String item = "";

        if(selection == 1){
            item = "Chips";
        } else if(selection == 2){
//            item = "Gum"; --> out of stock
            throw new outOfStockException(); // causes the exception to happen
        } else if(selection == 3){
            item = "Candy";
        }
        return item;
    }

    public static String selectValid(int selection) throws InvalidSelectionException{

        String item = "";

        if(selection == 1){
            item = "Chips";
        } else if(selection == 2){
            item = "Gum";
        } else if(selection == 3){
            item = "Candy";
        } else {
            throw new InvalidSelectionException(); // checked exception - must be handled - but also I created this, so I don't want to handle myself
        }
        return item;
    }
}
