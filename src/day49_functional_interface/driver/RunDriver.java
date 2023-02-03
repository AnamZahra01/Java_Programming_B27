package day49_functional_interface.driver;

public class RunDriver {
    public static void main(String[] args) {

        Driver.getDriver();
        Driver.getDriver().findElement();

   //     Driver driver = new Driver(); //unable to access getDriver method
  //      System.out.println(driver);

    }
}
