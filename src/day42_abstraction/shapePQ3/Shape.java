package day42_abstraction.shapePQ3;

// abstract class Shape
public abstract class Shape {

    // final variable name
    public final String name;

    // constructor to initialize name
    public Shape(String name) {
        this.name = name;
    }

    // two abstract methods:-  area() & perimeter()
    public abstract double area();
    public abstract double perimeter();

    // override toString to return the name, area and perimeter

    @Override
    public String toString() {
        return "Shape{" +
                "name=" + name + ", area:" + area() + ", perimeter:" + perimeter();
    }
}
