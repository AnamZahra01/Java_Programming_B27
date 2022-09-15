package day43_abstraction.learning;

public class AppleStore {
    public static void main(String[] args) {
        //direct access without any class, directly from interface - as they are Static
        System.out.println(Mac.brand);
        System.out.println(Mac.os);
        Mac.getBrand();

        //use class that implements interface
        Desktop obj = new Desktop();
        obj.turnOn();
        obj.typing();
        //obj.getBrand(); -> can not access static members from classes that implement interface

        //only access static members of interface by the interface

    }
}
