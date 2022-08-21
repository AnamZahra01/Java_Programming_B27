package day38_encapsulation.squarePQ2;

// create a class called Square
public class Square {

//        - data: side
    private double side;
    double area;
    double perimeter;

//  - constructor - create a constructor that creates a Square object with the side, call setter here
    public Square(double side) {
        setSide(side);
        area = calculateArea(this.side);
        perimeter = calculatePerimeter(this.side);
    }
    //  - encapsulate the Square class
// 	- setter condition: side must be a positive number otherwise it will not be assigned to the instance variable
    public void setSide(double side) {
        if(side >= 0) {
            this.side = side;
        }
    }

//- other methods methods: calculateArea() - calculate and return the area of a Square
    public double calculateArea(double side){
        double area;
        area = side * side;
        return  area;
    }

// - calculatePerimeter() - calculate and return the perimeter of a Square
    public double calculatePerimeter(double side){
        double perimeter;
        perimeter = 4 * side;
        return perimeter;
    }
//  - toString() - print the side, area, and perimeter of the Square object
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
