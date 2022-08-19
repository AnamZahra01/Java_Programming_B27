package day37_static;

//import static java.lang.Math.*;

import java.util.Arrays;

import static java.lang.Math.*;
import static java.lang.Integer.*;
import static java.util.Arrays.*;

public class ImportExample {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(PI);
  //      System.out.println(max(4,1)); //need to define the class, method: Math.max();
        System.out.println(abs(-6));

        System.out.println(MAX_VALUE);
        System.out.println(MIN_VALUE);
        parseInt("4"); //Integer.parseInt();

        int[] a = {43, 4, 2};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));


    }
}
