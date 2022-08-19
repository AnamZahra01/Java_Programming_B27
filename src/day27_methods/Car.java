package day27_methods;

public class Car {

    /*
    unlock car
    open
    sit down and start
    check mirrors
    seatbelt
    put to drive & go
     */

    // 6 methods and 1 main method

    public static void unlock(){ //Method1: unlock
        System.out.println("Unlocking car");
    }

    public static void openDoor(){
        System.out.println("Opening the door");
    }

    public static void sitAndStart(){
        System.out.println("Sitting down in seat");
        System.out.println("Adjust seat");
        System.out.println("Then insert the key");
        System.out.println("Start the car");
    }

    public static void checkMirrors(){
        System.out.println("Checking left mirror");
        System.out.println("Checking rear view mirror");
        System.out.println("Checking right mirror");
    }

    public static void seatBelt(){
        System.out.println("Putting on seatbelt");
    }

    public static void drive(){
        System.out.println("Putting into drive");
        System.out.println("Pressing on the accelerator");
    }

    public static void late(){
        unlock();
        openDoor();
        sitAndStart();
        drive();
    }

    public static void main(String[] args) {
        unlock();
        openDoor();
        sitAndStart();
        checkMirrors();
        seatBelt();
        drive();
        System.out.println();

        late();
    }

}
