package day37_static.student;

import java.util.Arrays;

public class CydeoStudent {
   // instance variables
    String name;
    String city;
    int group;
    Coffee myCoffee;

    //static variables
    static int batchNumber;
    static String schoolName;
    static String [] instructors;

    //static block
    static {
        batchNumber = 27;
        schoolName = "Cydeo";
        instructors = new String[]{"Adam", "Asia", "Saim"};

    }

    public static void schoolInfo(){
        System.out.println(schoolName +  " Batch " + batchNumber);
        System.out.println("Instructors " + Arrays.toString(instructors));
    }

    public  void drink(){
        myCoffee.amountLeft -= 2;
    }

    public CydeoStudent(String name, String city, int group) {
        this.name = name;
        this.city = city;
        this.group = group;
        myCoffee = new Coffee(16);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
