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

                break;
            case "firefox":
                driver = new FireFoxDriver();
                break;
        }
        return driver;
    }
}
//Driver.getDriver().get("google");