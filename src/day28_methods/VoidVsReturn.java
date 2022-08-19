package day28_methods;

public class VoidVsReturn {
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        sayHello();
        //sayBye(); //return value is not used
        System.out.println(sayBye());

        String str = sayBye(); // to use it later in our code

    }

    public static String sayBye(){
        return "Bye";
    }


}
