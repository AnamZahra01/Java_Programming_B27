package day43_abstraction.shape;

public class Circle extends Shape{
    public final double radius;
    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        String org = super.toString();
        return org.substring(0,org.indexOf("|")) + " | Radius: " + radius + org.substring(org.indexOf("|") -1);
    }
}
