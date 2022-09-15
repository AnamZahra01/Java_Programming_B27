package day42_abstraction.libraryPQ1;
//Create a class to run the code by calling the methods and seeing the result with different inputs to see how the exceptions were related to the execution
public class Runner {
    public static void main(String[] args) {

        Library.getLibraryCard("Mclean");

        try{
            Library.borrow(false);
        }catch(FailToCheckOutException e){
            System.out.println(e.getMessage());
        }


    }
}
