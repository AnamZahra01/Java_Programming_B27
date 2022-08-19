package day34_custom_classes.PQ1;

public class RectangleObject {
    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle();
        obj1.base = 4;
        obj1.height = 2;
        obj1.calculatePerimeter();
        obj1.calculateArea();
        System.out.println(obj1);

        Rectangle obj2 = new Rectangle();
        obj2.base = 4.4;
        obj2.height = 2.2;
        obj2.calculatePerimeter();
        obj2.calculateArea();
        System.out.println(obj2);

    }
}
