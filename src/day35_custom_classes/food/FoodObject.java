package day35_custom_classes.food;
/*
 create a class called Food
        - data:  name, quantity, unit price, total price
        - constructor    - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here
        - method:     - calculatePrice(): multiple the quantity by unit price and assign the value to the total price
            - toString()
                print all the Food information
    Create a separate class to create and test the Food objects

 */
public class FoodObject {
    public static void main(String[] args) {
        Food food1 = new Food("pizza", 4, 10);
        System.out.println(food1);
        System.out.println();

        Food food2 = new Food("rice", 2, 12);
        System.out.println(food2);
    }
}
