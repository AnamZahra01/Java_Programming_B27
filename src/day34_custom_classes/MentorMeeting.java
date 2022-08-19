package day34_custom_classes;

public class MentorMeeting {
    public static void main(String[] args) {
        sum(0,0);
        sum(-1,-1);

        //String input = null;
        //System.out.println("-"+input);
    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static class Rectangle {
      //instance variables
        double base;
        double height;
        double perimeter;
        double area;

        public void calculatePerimeter(){
            perimeter = 2*base + 2*height;
        }

        public void calculateArea(){
            area = base * height;
        }

        //unique method to define how we want to print our objects in a specific way.
      public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
      }

    }

    public static class RectangleObject {
        public static void main(String[] args) {

            Rectangle rectangle1 = new Rectangle();
            rectangle1.base = 4.5;
            rectangle1.height = 8.2;
            rectangle1.calculateArea();
            rectangle1.calculatePerimeter();

            System.out.println(rectangle1);

        }
    }
}
