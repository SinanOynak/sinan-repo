package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.Utilities;

import java.util.List;

public class HomePage extends Utilities {

    @FindBy(xpath = "//span[text() = 'SHOP NOW']")
    public WebElement shopNowButton;

    @FindBy(xpath = "//h2[text()='CONTACT INFO']")
    public WebElement txtContactInfo;

    @FindBy(css = "[class = 'tg-icon tg-icon-arrow-up']")
    public WebElement btnScrollToTop;

    @FindBy(css = "[class = 'custom-logo-link']")
    public WebElement imgTopPage;

    @FindBy(css = "[id = 'site-navigation']")
    public WebElement topNavBar;

    @FindBy(css = "[id = 'site-navigation'] li")
    public List<WebElement> topMenu;

    //[class="menu-primary nav-menu"] [class*="menu-item menu-item-type-post_type"]

    public void checkHomepage(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Home - Sample Shop";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public void clickShopNowButton(String buttonName){
        shopNowButton.click();
    }

    public void checkVisibleContactInfo(){
        if( txtContactInfo.isDisplayed()){
            System.out.println("Element is Visible for Contact Info");
        }
        else{
            Assert.fail("Element is InVisible for Contact Info");}
    }

    public void clickScrollToTop(){
        btnScrollToTop.click();
    }

    public void checkVisibleTopPage(){
        if( imgTopPage.isDisplayed() && topNavBar.isDisplayed()){
            System.out.println("Element is Visible for Image on Header Menu");
        }
        else{Assert.fail("Element is InVisible for Image on Header Menu");}
    }

    public void clickTopMenu(String menuName){
        for(WebElement menu: topMenu){
            if (menu.getText().equalsIgnoreCase(menuName)){
                menu.click();
                return;
            }
        }
        Assert.fail("No menu named "+topMenu+" could be located on the home page");
    }


}
