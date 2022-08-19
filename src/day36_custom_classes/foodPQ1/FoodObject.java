package day36_custom_classes.foodPQ1;
//    Create a separate class to create and test the Food objects

import java.util.Arrays;

public class FoodObject {
    public static void main(String[] args) {

        //    	try making an array of Food objects

        Food[] foodArr = new Food[4];

        Food obj1 = new Food("Chocolates"); //creating obj
        foodArr[0] = obj1;

        foodArr[1] = new Food("Lays", 2);
        foodArr[2] = new Food("Apples", 10, 2);
        foodArr[3] = new Food("Apricot", 5, 1);
        System.out.println(Arrays.toString(foodArr));
//    	find all the Food objects that start with 'a' and print the whole information
        System.out.println();

        for (Food each :  foodArr){
            if(each.name.startsWith("A")){
                System.out.println(each);
            }
        }

//    	find all the Food objects that have a total price over 20 and print the name of the food
        System.out.println();

        for(Food each: foodArr){
            if(each.totalPrice >= 7 ){
                System.out.println(each);
            }
        }


    }
}
