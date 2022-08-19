package day35_custom_classes.traffic_light;

public class TrafficLight {

    String color;

    //making constructor -> when we made it, default one is gone.
    public TrafficLight(String inputColor){
     //   color = inputColor;
        boolean isValid = inputColor.equalsIgnoreCase("red") || inputColor.equalsIgnoreCase("yellow") || inputColor.equalsIgnoreCase("green");

        if(isValid){
            color = inputColor;
        }
    }
}
