package day47_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String , Double> store = new HashMap<>(
        Map.of("Water", 2.99, "Bread", 4.55, "Milk", 2.89, "Fruits", 3.81)
        );
        System.out.println(store);


        System.out.println("What item are you looking for?");
        String item = input.next();
        if(store.containsKey(item)){
            System.out.println(item + " is in Stock");
            System.out.println("Price is $"  +store.get(item)); //get value based on key
        } else {
            System.out.println(item + " is not in stck");
        }

    }
}
