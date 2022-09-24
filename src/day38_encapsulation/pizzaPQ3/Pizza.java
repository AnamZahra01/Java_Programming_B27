package day38_encapsulation.pizzaPQ3;

//create a class called Pizza  -  encapsulate the Pizza class
public class  Pizza {

// - data: size (String), number of toppings
    private String size;
    private int numberOfToppings;
    double price;

// - constructor - create a constructor that creates a Pizza object with the size and number of toppings - call setters here
    public Pizza (String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

// 	- setter condition:  size: -> small, medium, or large
    public void setSize(String size) {
        if(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size;
        } else {
            System.out.println("We serve Small, Medium and Large only");
            System.exit(0);
        }
    }
//  - number of toppings: -> positive number
    public void setNumberOfToppings(int numberOfToppings) {

        if(numberOfToppings >= 0) {
            this.numberOfToppings = numberOfToppings;

            price = calculatePrice(this.size, this.numberOfToppings);
        } else {
            System.out.println("Number Of Toppings can be positive only");
            System.exit(0);
        }
    }

//   - other methods methods: - calculatePrice() -   calculate the price of the pizza based on:
//  small base: $4 -   medium base: $6 - large base: $8 + each topping adds $0.75 to the price
// calculate the total price and return the cost

    public double calculatePrice(String size, int numberOfToppings){

        double price = 0.0;
        if(size.equalsIgnoreCase("small")){
            price += 4;
        } else if(size.equalsIgnoreCase("medium")){
            price += 6;
        } else if(size.equalsIgnoreCase("large")){
            price += 8;
        }

        price += numberOfToppings * 0.75;
        return price;
    }
// - toString() -  print the size, number of toppings, and cost of the pizza

    public String toString() {

        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings +
                ", calculatePrice=" + price +
                '}';
    }
}
