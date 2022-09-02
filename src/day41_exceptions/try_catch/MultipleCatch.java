package day41_exceptions.try_catch;

public class MultipleCatch {
    public static void main(String[] args) {

        try {
            System.out.println(1/0); //if 1/5 -> does not give error -> program will not complete because of line 8,9
            String s = null;
            s.trim();
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e){

            System.out.println("second catch block");
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
/*
Exception is an unwanted or unexpected event, which occurs during the execution of a program
Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory
Error: An Error indicates a serious problem that a reasonable application should not try to catch.
Exception: Exception indicates conditions that a reasonable application might try to catch.
Checked Exceptions: Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.
Unchecked Exceptions: The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these exceptions at compile time. In simple words, if a program throws an unchecked exception, and even if we did not handle or declare it, the program would not give a compilation error.
 */
