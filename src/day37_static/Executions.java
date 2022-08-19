package day37_static;

public class Executions {
    public static void main(String[] args) {

        new Executions(); //creating object without reference
        System.out.println(1);
        new Executions();
    }

    public Executions(){
        System.out.println(2);
    }

    static { // static runs first, whenever the Class is loaded or used.
        System.out.println(3);
    }
}
//First static, then main.