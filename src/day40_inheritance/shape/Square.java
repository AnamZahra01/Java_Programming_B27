package day40_inheritance.shape;

public class Square extends Shape{
    double side;
    public Square(double side){
        super("Square");
        this.side = side;
    }
    @Override
    public double area(){
        return side * side;
    }

    @Override
    public double perimeter(){
        return side * 4;
    }

    public String toString(){
        return super.toString() + "\nSide: " + side; // calling super class implementation and adding some part to it.
    }
}
