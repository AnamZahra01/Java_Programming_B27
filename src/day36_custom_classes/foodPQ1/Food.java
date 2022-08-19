package day36_custom_classes.foodPQ1;

//create a class called Food
public class Food {
    //-data/instance variables: name, quantity, unit price, total price
    String name;
    int quantity;
    double unitPrice , totalPrice;

//  - constructor
//   - create a constructor that creates a Food object with the name

    public Food (String name){
        this.name = name;
    }

//    - create a constructor that creates a Food object with the name and quantity

    public Food (String name, int quantity){
        this(name);
        this.quantity = quantity;
}
//            - create a constructor that creates a Food object with the name, quantity, and unit price -> call calculatePrice() method here

    public Food(String name, int quantity, double unitPrice){
        this(name, quantity);
        this.unitPrice = unitPrice;
        this.totalPrice = calculatePrice();
    }

//   - method: calculatePrice(): multiple the quantity by unit price and assign the value to the total price

    public double calculatePrice(){
        totalPrice = unitPrice * quantity;
        return totalPrice;
    }

//            - toString() print all the Food information

    public String toString(){
        String output = "Name: " + name ;

        if(quantity != 0){
            output += ", quantity: " + quantity;
        }
        if(unitPrice != 0){
            output += ", unit price: " + unitPrice;
        }
        if (totalPrice != 0) {
            output += ", total price: $" + totalPrice;
        }

        return output;
    }
}