package day36_custom_classes.food;

import java.util.Arrays;

public class FoodObject {
    public static void main(String[] args) {

        Food[] allFood = new Food[5];
        System.out.println(Arrays.toString(allFood));
        Food obj1 = new Food("apples");
        allFood[0] = obj1;

        allFood[1] = new Food("sushi", 10);
        allFood[2] = new Food("cajun pasta", 2,3.99);
        allFood[3] = new Food("kebab", 5,2.5);
        allFood[4] = new Food("ploy", 4, 2.99);
        System.out.println(Arrays.toString(allFood));

        //print each food in a separate line
        System.out.println();
        for(Food each : allFood){
            System.out.println(each);
        }

        //find food objects starting from a or c
        System.out.println();
        for(Food each : allFood){
            if(each.name.startsWith("a") || each.name.startsWith("c")) {
                System.out.println(each);
            }
        }

        //food over 20$
        System.out.println();
        for(Food each : allFood){
            if(each.totalPrice > 7.98) {
                System.out.println(each.name);
            }
        }

    }
}
