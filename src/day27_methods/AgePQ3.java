package day27_methods;

public class AgePQ3 {
    /*
    create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote
     */

    public static void eligibleToVote(int age){

        if(age >= 18){
            System.out.println("You are eligible to Vote");
        } else {
            System.out.println("You are not eligible to vote");
        }}

    public static void main(String[] args) {

        eligibleToVote(10);
        eligibleToVote(20);
        eligibleToVote(18);

    }}
