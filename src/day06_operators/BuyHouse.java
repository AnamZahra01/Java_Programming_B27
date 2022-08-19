package day06_operators;
/*
PQ-05:  Create a class BuyHouse
               declare and assign a credit score variable
               declare and assign a salary
        determine if you can get a loan to buy a house
        there is two ways to get a loan:
                credit score of 720 or above and salary of 100,000 or above
                credit score of 740 or above and salary of 80,000 or above
 */
public class BuyHouse {
    public static void main(String[] args) {
        int creditScore = 750 ;
        double salary = 110_000.00;
        boolean loanApproved = (creditScore >= 720 && salary >= 100_000) || (creditScore >= 740 && salary >= 80_000);

        System.out.println("loanApproved: " + loanApproved);


    }
}
