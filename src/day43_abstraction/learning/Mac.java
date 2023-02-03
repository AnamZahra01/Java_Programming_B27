package day43_abstraction.learning;

public interface Mac {
    public static final String brand = "Apple"; //constant
    String os = "IOS"; //brand and os variables are same
    //instance variables(non-static) not allowed in interface
    //variables can never be abstract

    //methods: in interface you can define abstract (by default), static, default

    void turnOn(); //public abstract void turnOn();
    //void turnOff();

    //to have methods with body/implementation -> method should be static
    public static void getBrand(){
        System.out.println("The brand is Apple");
    }

    public default void typing(){ //default keyword allows to create method with implementation in interface. It is not default access modifier. It is instance method for class that implements
        System.out.println("Typing on Apple keyboard");

    }


}
