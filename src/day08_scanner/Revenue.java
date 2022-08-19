package day08_scanner;
//PQ-02:
import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price: ");
        double price = input.nextDouble();

        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.println("Revenue: $" + (price * quantity));

    }
}
