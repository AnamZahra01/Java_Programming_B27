package day40_inheritance.device_PQ1;
//Create a class UseDevice
public class UseDevice {

    public static void main(String[] args) {

        //	create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

        TV obj1 = new TV("Samsung", 2020, 850, true);
        System.out.println(obj1);
        System.out.println(obj1.useDevice());
        System.out.println();

        Phone obj2 = new Phone("Apple 11 pro max", 2020, 1100, true);
        System.out.println(obj2);
        System.out.println(obj2.useDevice());
    }
}
//	List what is the relations of all the classes
/*
Device -> super class
    TV , Phone -> sub classes
 */
