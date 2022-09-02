package day42_abstraction.exception_recap.vending;

public class InvalidSelectionException extends Exception {

    public InvalidSelectionException(){
        super("Selction can only be 1,2 or 3");
    }

}
