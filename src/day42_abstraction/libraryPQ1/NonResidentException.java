package day42_abstraction.libraryPQ1;

//Create a class NonResidentException - make this an unchecked exception
public class NonResidentException extends RuntimeException{

//    create a constructor to accept the String argument and pass it to the super constructor

    public NonResidentException() {
        super("Sorry! Library card can be created for Fairfax and McLean Residents");
    }
}
