package day40_inheritance.extra_practice;

public class Cylinder extends Shape{
    int height = 0;
    public Cylinder(int radius, int height){
        super(radius);
        this.height = height;
    }
    @Override
    public double area(){
        return Math.PI * radius * radius * this.height;
    }
    public String toString(){
        return super.toString() + "\nHeight: " + height;
    }
}
