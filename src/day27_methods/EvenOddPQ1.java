package day27_methods;

public class EvenOddPQ1 {
    /*
     create a method that can print odd numbers between 1-100 in the
same line saperated by space
create a method that can print even numbers between 1-100 in the
same line saperated by space
     */

    public static void even(){

        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }}
        System.out.println();
    }

    public static void odd(){
        for(int i = 0; i < 100; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }}
        System.out.println();
    }

    public static void main(String[] args) {

        odd();
        even();
    }}
