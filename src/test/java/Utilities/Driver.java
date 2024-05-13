package Utilities;

import Utilities.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    private static String browser = Config.getValue("browser");
    public static WebDriver getDriver(){
        if (driver == null){

            if (browser.equalsIgnoreCase("chrome")){
                driver =new ChromeDriver();
            }
            else {
                driver = new SafariDriver();
            }


            int pageLoadTimeOut = Integer.parseInt(Config.getValue("pageLoadTimeOut"));
            int implicitWait = Integer.parseInt(Config.getValue("implicitWait"));

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            return driver;
        }
        return driver;
    }

    public static void quitBrouser(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
