 /*
3.Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
    package by_rreze;
    public class Finra {
    public static void finra(){
        for(int num = 1; num <= 30; num++){
            if(num % 3 == 0 && num % 5 == 0){
                System.out.print("FINRA, ");
            }else if(num % 5 == 0){
                System.out.print("RA, ");
            }else if(num % 3 == 0) {
                System.out.print("FIN, ");
            } else {
                System.out.print(num + " ,");
            }
        }
    }

    public static void main(String[] args) {
        finra();
    }
}
