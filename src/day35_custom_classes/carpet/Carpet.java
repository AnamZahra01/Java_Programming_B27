package day35_custom_classes.carpet;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public Carpet(double widthIn, double lengthIn, double unitPriceIn, boolean isPersianIn ){
        width = widthIn;
        length = lengthIn;
        unitPrice = unitPriceIn;
        isPersian = isPersianIn;
        calculatePrice();
    }
    public void calculatePrice(){
        totalPrice = width * length * unitPrice;

        if(isPersian){
            totalPrice += 200;
        }
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                "," +(isPersian? "Persian" : "Regular") + " carpet"+
                ", totalPrice=$" + totalPrice +
                '}';
    }
}
