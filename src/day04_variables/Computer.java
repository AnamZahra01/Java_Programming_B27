package day04_variables;
/*
PQ-02. Create a class Computer
       create a main method
       declare and assign these variables with the most appropriate datatypes:
       brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth.
        create a summary of the information and print it. Be creative
 */

public class Computer {
    public static void main(String[] args) {
        String brand = "Apple";
        String processor = "M1 max";
        int ram = 8 ;
        int storage = 255;
        int price = 1200;
        int usbSlots = 2;
        boolean hasMonitor = true ;
        boolean hasWifiCard = false;
        boolean hasBluetooth = true;

        //Summary:
        String computerData = "About this MAC \n " + brand + " designed " + processor + " with machine learning performance. \n " +ram+ " GB of unified memory and " + storage + " GB of Flash storage so everything you do is fast and fluid. \n " + usbSlots + " USB slots to fly through workflows quicker than ever. \n Price $ " + price + ". \n " + processor + " has monitor: " + hasMonitor + ". \n " +processor + " has Wifi Card: " + hasWifiCard + ". \n " +processor+ " has Bluetooth: " + hasBluetooth + "." ;

        System.out.println( computerData);

    }
}
