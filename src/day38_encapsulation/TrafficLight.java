package day38_encapsulation;
//something missing

public class TrafficLight {

    private String color;

    public TrafficLight(String color) { //constructor
        setColor(color);//method call
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equals("green") || color.equals("red") || color.equals("yellow")) {
            this.color = color;
        }
    }
}
