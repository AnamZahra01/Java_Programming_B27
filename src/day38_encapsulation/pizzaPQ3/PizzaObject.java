package day38_encapsulation.pizzaPQ3;

//  Create a separate class to create and test the Pizza objects
public class PizzaObject {
    public static void main(String[] args) {


        Pizza obj1 = new Pizza("small", 4);
        System.out.println(obj1);

        Pizza obj2 = new Pizza("meDium", -4);
        System.out.println(obj2);

        Pizza obj3 = new Pizza("extra", 4);
        System.out.println(obj3);


    }
}
