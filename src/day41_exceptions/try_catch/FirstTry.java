package day41_exceptions.try_catch;

public class FirstTry {
    public static void main(String[] args) {
        try{

        String s = "hello world";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(100));

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("The string was too short. It went out of bounds");
        } //catch block only runs if exception happens

        System.out.println("hello");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Invalid time given");
        }
        System.out.println("World");
    }
}
