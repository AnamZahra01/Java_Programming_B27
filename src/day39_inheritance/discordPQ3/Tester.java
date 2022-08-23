package day39_inheritance.discordPQ3;

public class Tester {
    public static void main(String[] args) {
        Admin obj1 = new Admin("Adam", 1123);
        System.out.println(obj1);
        obj1.createChannel();
        System.out.println();

        Admin obj2 = new Admin("Rreze", 1553);
        System.out.println(obj2);
        obj2.createChannel();
        System.out.println();

        Student obj3 = new Student("Anam", 1007);
        System.out.println(obj3);
        obj3.sendMessage();
    }
}
