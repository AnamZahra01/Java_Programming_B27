package day26_multi_array;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String[][] cydeo = {
                {"Alen","Tina","Alena","Nargiza"},
                {"Anam", "Baz", "Busra","Ostap"},
                {"Rabia", "Shahd"},
                {"Ketino", "Eylul", "Nadia"}
        };

        System.out.println(cydeo.length); // 4, how many 1D arrays we have

        System.out.println(cydeo[2].length); //2
        System.out.println(cydeo[0][3]); //Nargiza

        System.out.println(Arrays.toString(cydeo[1])); //Anam, Baz, Busra, Ostap
        System.out.println(Arrays.deepToString(cydeo)); //whole 2D

         //how to loop through each name in all groups
        for(String[] eachInner : cydeo ){
            System.out.println(Arrays.toString(eachInner)); //each group one at a time
        }

        System.out.println();
        //loop through each name

        for(String[] eachInner : cydeo ){
            for(String eachName : eachInner){
                System.out.println(eachName);
            }
        }

        //loop through each name and print first letter in uppercase
        for(String[] eachInner : cydeo ){
            for(String eachName : eachInner){
                System.out.println(eachName.substring(eachName.length() - 1).toUpperCase());
            }
        }

    }
}
