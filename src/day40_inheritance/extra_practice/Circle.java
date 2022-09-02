package day40_inheritance.extra_practice;

public class Circle extends Shape{

    public Circle(int radius){
        super(radius);
    }
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
