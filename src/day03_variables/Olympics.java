package day03_variables;
/*
PQ 2_ Add a new class Olympics
    add main method
    declare and assign all these variables:
    years: starting at 2022
    use the following data to print this message for the coming years of the Olympics. Reassign the year variable each time
        years - location
        2022 - China
        2024 - France
        2026 - Italy
    message: The Olympics will be in these locations for the coming years: $years
 */
public class Olympics {
    public static void main(String[] args) {
        
        int years = 2022;
        System.out.println( years + " - China");
        //System.out.println("The Olympics will be in China for " + years );
        
        years = 2024;
        System.out.println( years + " - France");
        //System.out.println("The Olympics will be in France for " + years);
        
        years = 2026;
        System.out.println( years + " - Itlay");
        System.out.println("message: The Olympics will be in China for  2022" );

    }
}
