package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties properties;


    static {
        // create object of properties to call load method
        properties = new Properties();

        try {
            // create object of file called configuration properties
            FileInputStream file = new FileInputStream("src/test/resources/configuration.properties");
            properties.load(file);
            file.close();
        }catch (IOException e){
            System.out.println("Configuration file is not found");
        }

    }

    static {
        System.out.println(properties.getProperty("username"));

    }

    public static String getValue(String key){
        return properties.getProperty(key);
    }



}
