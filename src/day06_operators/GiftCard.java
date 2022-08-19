package day06_operators;
/*
PQ-02: Create a class GiftCard
            declare and assign a gift card variable at 500
            declare and assign times used at 3
            print using giftcard and subtract 150 from the amount
            reduce the times used by one
            print using giftcard and subtract 99 from the amount
            reduce the time used by one
            print information at the end
 */
public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 500.00;               //  declaring & assigning variables
        int timesUsed = 3;
        System.out.println("GiftCard Total amount: $" +giftCard+ "\t\t\t\t\t|\tMaximum Transactions: "+timesUsed );

        giftCard -= 150;
        System.out.println("After first purchase remaining amount $" + giftCard+ "\t|\tRemaining transactions: " + --timesUsed);

        giftCard -= 99;
        System.out.println("After second purchase remaining amount $" + giftCard + "\t|\tRemaining transactions: " + --timesUsed);

        String information = "\nGIFT CARD SUMMARY:\nGift card with a credit of $500 can make maximum 3 transactions. You have "+timesUsed+" chance left to use remaining $" +giftCard+"\nEnjoy Your Shopping.\nThankyou";
        System.out.println(information);

    }
}
