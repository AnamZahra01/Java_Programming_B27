package day42_abstraction.exception_recap.vending;

public class outOfStockException extends RuntimeException{ //created runtime exception

    public outOfStockException() {
        super("Item is out of stock"); // defines message of exception
    }
}
