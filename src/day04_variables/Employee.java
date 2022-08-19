package day04_variables;
/*
PQ-03. Create a class Employee
       create a main method
       declare and assign these variables with the most appropriate datatypes:
        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time

    declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - email (first name + employee id @ company name.com)
        - benefits (salary, number of PTO and add "work from home")

    create a summary of the information and print it. Be creative
        Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com. Current benefits include $1000000 salary a year, 20 PTO days and work from home.
 */
public class Employee { //class
    public static void main(String[] args) { //main method

        //declaring and assigning variables
        String firstName = "Syed", lastName = "Abbas" , companyName = "Shah_Industries" , jobTitle = "CEO" ;
        char suite = 'A' ;
        int employeeID = 1007 , salary = 100_000 , noOfPtoDays = 10;
        boolean isFullTime = true ;

        String info = "Employee name = " + firstName + " " + lastName + ". \n " + jobTitle + " of " +companyName+ " based in suite " +suite+ ". \n Mr. " +lastName + " is full time: " +isFullTime ;

        System.out.println( info);

        //declaring new variables
        String fullName = firstName + " " +lastName;                    //concatenation from previous variables
        String email = firstName+employeeID+"@"+companyName+".com";     //concatenation from previous variables
        int benefitSalary = salary+ 50_000;                             //concatenation from previous variables
        int benefitsPto = noOfPtoDays*2;                                //concatenation from previous variables
        boolean workFromHome = true;

        String moreInfo = "\nContact Mr. " + fullName + " at " +email+ ". \n Current benefits include " +benefitSalary + " salary a year, " +benefitsPto+ " PTO days. \n Work from home: " +workFromHome  ;

        System.out.println( moreInfo);
    }
}
