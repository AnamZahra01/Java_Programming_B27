package day42_abstraction.libraryPQ1;

// Create a class FailToCheckOutException - make this a checked exception
public class FailToCheckOutException extends Exception{

//    create a constructor to accept the String argument and pass it to the super constructor

    public FailToCheckOutException() {
        super("Failed to check out");
    }
}
