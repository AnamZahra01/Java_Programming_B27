package day05_arithmetic_operators;
/*
PQ-04:  Create a class SalaryCalculator, add a main method, declare and assign these variables:
        salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
        Sample data:       100000 (salary)
                           0.08 (state tax rate)
                           0.21 (federal tax rate)
        Hint: use tax rates of 0.08 and 0.21 for 8% and 21%
        Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
 */
public class SalaryCalculator {
    public static void main(String[] args) {

        //declaring & assigning variables
        double salary = 100_000, stateTaxRate = 0.08, fedralTaxRate = 0.21;
        double stateTax, federalTax, totalTax, salaryAfterTax;       //Money should always be in double

        stateTax = salary * stateTaxRate;
        federalTax = salary * fedralTaxRate;

        totalTax = stateTax + federalTax ;       // Adding all taxes: 0.08 + 0.21 = 0.29 (in percentage)
        salaryAfterTax = salary - totalTax ;     // Tax deduction from salary: 100,000 - 28,999.99 = $71,000.0
        String taxReport = "Total salary before deduction = $ " + salary + ".\nState tax: $" +stateTax+ "\nFedral tax =  $" +federalTax+ "\nTotal yearly tax = $ " + totalTax + "\nSalary you received = $ " +salaryAfterTax;
        System.out.println(taxReport);
    }
}
