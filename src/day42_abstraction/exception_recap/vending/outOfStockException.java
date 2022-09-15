package day42_abstraction.exception_recap.vending;

public class outOfStockException extends RuntimeException{ // being a child of RunTimException means we created an unchecked exception

    public outOfStockException() {
        super("Item is out of stock"); // this helps us define message of exception

    }
}
