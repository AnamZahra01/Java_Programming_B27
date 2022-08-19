package day37_static.pq1;

//        make objects of the class in a main method and access both instance and static members from proper references
public class ComputerObject {
    public static void main(String[] args) {

        Computer obj1 = new Computer(500, "Apple", "Black", true);
        System.out.println(obj1);
       // System.out.println(obj1.hasScreen); // not recommended
        System.out.println();

        Computer obj2 = new Computer(400, "Apple", "Black", false);
        System.out.println(obj2);
        System.out.println();

        //access static members -> Class name directly

        System.out.println(Computer.hasScreen);
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);
        System.out.println();

    }
}
