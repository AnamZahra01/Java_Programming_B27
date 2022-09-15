package day42_abstraction.shapePQ3;

//concrete class Rectangle - subclass of Shape
public class Rectangle extends Shape{

    // instance variables length & width
    double length;
    double width;

    //    call parent constructor to set name "Rectangle" & initialize length and width
    public Rectangle( double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // implement two abstract methods -  area() & perimeter()
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    //    override the toString to return length & width
    @Override
    public String toString() {
        return super.toString() + ", length:" + length + ", width:" + width + "}";
    }
}
