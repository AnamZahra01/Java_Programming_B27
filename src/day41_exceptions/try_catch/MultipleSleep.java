package day41_exceptions.try_catch;

public class MultipleSleep {
    public static void main(String[] args) throws InterruptedException{ //accepting exceptions to stop my program

        System.out.println("Hello");

        Thread.sleep(1000);
        System.out.println("Second Line");

        Thread.sleep(1000);
        System.out.println("Middle Line");

        Thread.sleep(1000);
        System.out.println("Bye");

    }

//    public static void main(String[] args) throws StringIndexOutOfBoundsException{
//
//        String s = "hello world";
//        System.out.println(s.charAt(11)); // ToDo: Can "throws" keyword handle run time exception? "NO"
//        System.out.println("Done");
//
//    }
}
