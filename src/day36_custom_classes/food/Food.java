package day36_custom_classes.food;

public class Food {

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public boolean calculatePrice(){

        if(quantity <= 0 || unitPrice <= 0){
            return false;
        }
        totalPrice = unitPrice * quantity;
        return true;

    }

    public String toString(){
        String str = "Name: " +name;
        if(quantity != 0){
            str += ", quantity: " +quantity;
        }
        if(unitPrice != 0){
            str += ", unitPrice: " +unitPrice;
        }
        if(totalPrice != 0){
            str += ", total price: " +totalPrice;
        }
        return "<" + str +">";
    }

}
