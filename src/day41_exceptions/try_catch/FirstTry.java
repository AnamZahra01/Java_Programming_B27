package day41_exceptions.try_catch;

public class FirstTry {
    public static void main(String[] args) {
        try{

        String s = "hello world";
        System.out.println(s.charAt(1)); //will give run time exception
        System.out.println(s.charAt(11));

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("The string was too short. It went out of bounds");
        } //catch block only runs if exception happens

        System.out.println("hello");
        System.out.println();

        try{
            Thread.sleep(1000); //compileTime Exception
        }catch (InterruptedException e){
            System.out.println("Invalid time given"); //Todo: when will this block run?
        }
        System.out.println("World");
    }
}
