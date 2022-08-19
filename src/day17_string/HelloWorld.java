package day17_string;

public class HelloWorld {
    public static void main(String[] args) {

        //infinite loop, does not stop.
//        while (true){
//            System.out.println("Hello World");
//        }

        //print 50 times
        int counter = 0; // 1 loop counter <= 50

        while (counter < 50){
            System.out.println("Hello World " + counter);
            counter++; // goes up by 1
        }


    }
}
