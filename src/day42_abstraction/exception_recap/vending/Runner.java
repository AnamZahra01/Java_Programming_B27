package day42_abstraction.exception_recap.vending;

public class Runner {
    public static void main(String[] args) {
       // System.out.println(VendingMachine.select(1)); // method has unchecked exception

        //select(2) -> causes exception

        try{
            System.out.println(VendingMachine.selectValid(5));
        } catch (InvalidSelectionException e){
            System.out.println(e.getMessage());
        }

    }
}
