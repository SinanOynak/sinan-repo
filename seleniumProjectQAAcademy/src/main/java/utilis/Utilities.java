package utilis;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilis.driver.Driver;

import java.util.List;

public class Utilities extends Driver {

    public Utilities(){PageFactory.initElements(new WebDriverExtensionFieldDecorator(driver),this);}

    public void navigate(String url){driver.get(url);}

    public void waitFor(double seconds){
        try{Thread.sleep((long) (seconds*1000));}
        catch(InterruptedException ignored){}
    }

    public void scrollPageDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

}
