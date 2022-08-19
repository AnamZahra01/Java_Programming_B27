package day35_custom_classes.traffic_light;

import day35_custom_classes.traffic_light.TrafficLight;

public class TrafficLightObject {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("green");
       // light.color = "red";
        System.out.println(light.color);

        TrafficLight light2 = new TrafficLight("blue");
      //  light2.color = "blue";
        System.out.println(light2.color);
    }
}
