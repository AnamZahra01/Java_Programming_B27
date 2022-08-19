package day05_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {
        String type = "Cheese";
        int pizzaSlices = 10;
        int people = 3;
        int slicesPerPerson = pizzaSlices / people ;
        System.out.println("Every person will get " + slicesPerPerson + " slices.");

        int leftOverSlices = pizzaSlices % people ;
        System.out.println("There will be " + leftOverSlices + " left over.");
    }
}
