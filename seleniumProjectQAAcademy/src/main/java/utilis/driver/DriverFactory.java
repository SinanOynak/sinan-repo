package utilis.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    //driverımızın tek seferde tek instance olacağı için static tutuyoruz
    public static WebDriver getDriver(String driverName, WebDriver driver){
        Properties properties = new Properties();

        try {
            properties.load(new FileReader("src/main/resources/test.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(driverName == null){
            driverName = properties.getProperty("browser");
        }

        switch (driverName.toLowerCase()){
            case "safari":
                SafariOptions safariOptions = new SafariOptions();
                //safariOptions.set(x,y,z);
                System.setProperty("webdriver.chrome.driver","usr/bin/safaridriver");
                driver = new SafariDriver(safariOptions);
                break;

            default:
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("disable-notifications");
                System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
                //Tarayıcnın başladığı step
                driver = new ChromeDriver(chromeOptions);
                break;
        }
        //sayfada elementi ararken yarım saniye aralarla 10 sn boyunca elementi aramaya yarar
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
