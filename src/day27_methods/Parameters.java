package day27_methods;

public class Parameters {

    public static void greeting(String name){    //parameter: variable used in method
        System.out.println("Hello " + name);
        System.out.println("Nice to meet you " + name);
    }
    public static void age(int birthYear){
        System.out.println( "You are " + (2022 - birthYear) + " years old");
    }

    public static void main(String[] args) {

        greeting("Anam"); //pass argument: value of the parameter
        age(2000);
        System.out.println();
        greeting("James Bond");
        age(1995);
    }
}
