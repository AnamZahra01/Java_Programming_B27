package day27_methods;

public class FirstMethod {

    public static void helloWorld() { //my method
        System.out.print("Hello World!   ");
    }

    public static void helloWorld5Times(){
        for(int i = 0; i < 5; i++){
            System.out.print("Hello World!   ");
        }
    }

//unable to run -> need to make main method
    //declaring method -> creating method
// methods inside class
    //methods should not be inside methods
    //main method to run the code, inside main we call the methods

    public static void main(String[] args) { //main method

        helloWorld(); //calling method
        helloWorld();
        helloWorld();
        System.out.println();

        helloWorld5Times();
        System.out.println();
        helloWorld5Times();

    }
}