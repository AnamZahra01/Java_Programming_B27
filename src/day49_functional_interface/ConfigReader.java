package day49_functional_interface;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
   private: accessible within same class only
   static: access by class name, no need to create object
   Properties: we are creating object of this class to connect to properties (test.properties) to java object.
   static block: to run first, to make sure everything is set up
   FileInputStream: connect to a file -> allows access to the information in some way.

utility class -> has reusable methods
    */
public class ConfigReader {

    private static Properties properties = new Properties();

    static {

        try {
            //create file obj, allows us to connect to a file
            FileInputStream file = new FileInputStream("test.properties"); //ref = obj or constructor

            //loads the files into properties object
            properties.load(file);


        } catch (IOException e) { //IOException is parent of FileNotFoundException
            System.out.println("File not found");
            e.printStackTrace(); //to print message of exception
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}

/*
    Summary:
       1- first create properties file which has some information-> test.properties
       2- Create class -> ConfigReader
       3- in ConfigReader class we created properties object
       4- in static block -> we connected to file, using FileInputStream
       5- used load method from properties object  to load information from file to object

 */



