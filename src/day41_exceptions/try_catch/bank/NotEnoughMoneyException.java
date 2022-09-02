package day41_exceptions.try_catch.bank;

public class NotEnoughMoneyException extends RuntimeException{ // extending makes this class an unchecked exception

    public NotEnoughMoneyException(){
        super("Not enough money in account"); //allows to define message part of exception
    }

}
