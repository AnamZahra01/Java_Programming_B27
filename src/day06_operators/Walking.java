package day06_operators;
/*
PQ-06:  Create a class Walking
            declare and assign a boolean variable is raining
            declare and assign a temperature variable
            check if you should go for a walk. You should go for a walk if it is not raining and the temperature is more than 68
 */
public class Walking {
    public static void main(String[] args) {
        boolean isRaining = false;
        int temperature = 70;

        boolean shouldGoForWalk = !isRaining && (temperature > 68) ;
        System.out.println("\n\nIt's raining outside: " +isRaining+ "\t\t|\tTemperature: "+temperature+ "\t\t-->\t\t ShouldIGoForWalk? :" + shouldGoForWalk+"\n");

    }
}
