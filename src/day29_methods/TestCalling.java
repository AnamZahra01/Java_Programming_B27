package day29_methods;

import day28_methods.Numbers;

public class TestCalling {
    public static void main(String[] args) {

        int[] arr = {3,1,4,5};
       int sum = ExtraPractice.sumFromArray(arr);
        System.out.println(sum);

        //calling method anywhere using Class name
        //ClassName.method();

        double value = ExtraPractice.currencyConverter("won",130);
        System.out.println(value);

        //file from different package -> import it PackageNAme.ClassName, ClassName.Method()
        Numbers.checkNumber(9); //command to go reverse to method directly
    }
}

