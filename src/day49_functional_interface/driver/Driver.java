package day49_functional_interface.driver;

import day49_functional_interface.ConfigReader;

public class Driver {

   private Driver(){ //making constructor private -> unable to make objects outside class

    }
    private static WebDriver driver ;

    public static WebDriver getDriver(){
        switch (ConfigReader.getProperty("browser")){
            case "chrome":
                driver = new ChromeDriver();
                driver.get();
          //      driver.findElement();
            //    WebDriver driver1;
                //     driver1 = ( (ChromeDriver)driver.maximize());

                break;
            case "firefox":
                driver = new FireFoxDriver();
                break;
        }
        return driver;
    }
}
//Driver.getDriver().get("google");