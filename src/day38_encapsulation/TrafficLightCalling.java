package day38_encapsulation;

public class TrafficLightCalling {
    public static void main(String[] args) {

        TrafficLight road1 = new TrafficLight("red");
        System.out.println(road1.getColor());

        road1.setColor("blue");
        System.out.println(road1.getColor());

        road1.setColor("green");
        System.out.println(road1.getColor());

        road1.setColor("orange");
        System.out.println(road1.getColor());
    }

}
