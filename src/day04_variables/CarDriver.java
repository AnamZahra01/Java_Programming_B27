package day04_variables;

/*
PQ-01. Create a class CarDriver
       create a main method
       declare and assign these variables with the most appropriate datatypes:
       driver name, car model, license number, license class, speed, is automatic

    create a summary of the information and print it. Be creative

 */

public class CarDriver {
    public static void main(String[] args) {
        String driver_name = "John";
        String car_model = "BMW";
        int license_number = 99_999_999;
        char license_class = 'A';
        int carSpeed = 120;
        boolean isAutomatic = true;

        //Summary:
        String summary = "Driver's Log: \n " + driver_name + " is over-speeding having car model " + car_model + " with license number " + license_number + " and class " + license_class + " at a speed of " + carSpeed + " . \n The car is automatic : " + isAutomatic ;

        System.out.println("summary = " + summary);

//        System.out.println("Driver's Log: \n " + driver_name + " is over-speeding having car model " + car_model + " with license number " + license_number + " and class " + license_class + " at a speed of " + carSpeed + " . \n The car is automatic : " + isAutomatic  );

    }
}
