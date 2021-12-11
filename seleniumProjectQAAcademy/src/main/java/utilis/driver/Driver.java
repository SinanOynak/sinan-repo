package utilis.driver;

import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.WebDriver;

public class Driver extends WebComponent {
    public static WebDriver driver;

    public void initialize(){driver = DriverFactory.getDriver("chrome",driver);}

    public void termianate(){driver.quit();}

}
