package day37_static.pq2;

//Debit card - custom classes + static

public class DebitCard {

//    Create a class for Debit Card that has the following instance variables:
//        card number (long), holder name (String), card type (String), pin (int), and balance (double)

    long cardNumber; //1234567891011234
    String holderName; //declare
    String  cardType;
    int pin ;
    double balance;

// The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”

    public DebitCard(long cardNumber, String holderName, double balance) {

        // valueOf used: long(primitive) -> String
     if(String.valueOf(cardNumber).length() == 16) {
          this.cardNumber = cardNumber;
      } else {
         System.out.println("InValid Card Number");
      }

        this.holderName = holderName;
        this.balance = balance;
    }

    //constructor:
    //        Overload the constructor to take all of the instance variables.
    //        The card type must be either MasterCard or Visa to be valid card type.
    //        If it is not one of those two then do not store the type and print “invalid card type”.
    //        Also the pin must be only 4 characters long.
    //        If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber, holderName, balance) ;

      if(cardType.equalsIgnoreCase("Master") || cardType.equalsIgnoreCase("Visa")) {
          this.cardType = cardType;
      } else {
          System.out.println("Invalid Card Type");
      }

      if(String.valueOf(pin).length() == 4) {
          this.pin = pin;
      } else {
          System.out.println("Invalid Pin Length");
      }

        this.balance = balance;

    }


    //static variables: account type (debit)
//        -> Use static block to initialize account type

   static String accountType; //mention static

    static {
        accountType = "debit";
    }

//        Add the toString method that will print all of the cards information (Except the pin).
//        If the card type does not have a value do not print that line.

    public String toString() {
        String output = "Name: " +holderName + ", balance: " + balance;
        if(cardNumber != 0){
            output += " card Number: " + cardNumber;
        }
        if(cardType != (null)){
            output += ", card Type: " + cardType;
        }
        if(pin != 0){
            output += ", pin: ****";
        }
        return output;
    }

}

/*
Q: What is the difference between instance and static members

static: has fixed value for all obj
instance: varies with each obj
---------------
call static -> by ClassName.varName (Valid)
               by obj.VarName (Not Preferred)
call instance -> by obj.varName
----------------
Q: How does the static block work

Static block runs first and once
static block -> initializes static variables
static block is accessible through other packages
-----------------
Q: How does the constructor work
constructor is special method to initialize/assign all instance variable at once.
constructor is automatically called when object is created.
constructors -> overloaded
--------------------
Q: What are the possible static members
variables, method, block, class,
 */