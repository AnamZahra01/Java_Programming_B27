package day42_abstraction.shapePQ3;

//concrete class Circle -  subclass of Shape
public class Circle extends Shape{

    // instance variable radius
    double radius;

    //    call parent constructor to set the name "Circle" & initialize radius
    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }

    // two abstract methods -  area() & perimeter()
    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    // override the toString to return radius
    @Override
    public String toString() {
        return super.toString() +
                ", radius=" + radius +
                "}";
    }
}
