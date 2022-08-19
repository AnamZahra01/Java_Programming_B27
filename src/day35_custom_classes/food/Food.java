package day35_custom_classes.food;

public class Food {
    String name;
    int quantity;
    double unitPrice, totalPrice;
    public Food(String name, int quantity, double unitPrice){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice =  calculatePrice();
    }
    public double calculatePrice(){
      return  quantity * unitPrice;
    }

    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
