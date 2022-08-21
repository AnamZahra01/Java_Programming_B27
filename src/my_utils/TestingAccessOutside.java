package my_utils;

import day38_encapsulation.AccessModifiers;

public class TestingAccessOutside {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        // System.out.println(obj.b); //default is for within the package
       // System.out.println(obj.c); // private is for within the Class
    }

}
