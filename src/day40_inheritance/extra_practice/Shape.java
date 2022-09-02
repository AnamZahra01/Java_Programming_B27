package day40_inheritance.extra_practice;

public class Shape {

    int radius = 0; //ins-var

    public Shape(int radius){
        this.radius = radius;
    }
    public double area() { //ins-meth
        return 0.0;
    }

    @Override
    public String toString() {
        return "Radius=" + radius + "\nArea: " +area() ;
    }
}
