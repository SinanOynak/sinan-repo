package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilis.Utilities;

import java.sql.Driver;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CartPage extends Utilities {

    @FindBy(xpath = "//table[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/tbody/tr[1]//input[@inputmode = 'numeric']")
    public WebElement firstProductQuantity;

    @FindBy(xpath = "//table[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/tbody/tr[3]//input[@inputmode = 'numeric']")
    public WebElement thirdProductQuantity;

    @FindBy(xpath = "//a[text()='Yellow Stripe Coat']")
    public WebElement firstProductName;

    @FindBy(xpath = "//a[text()='Blue Lace Dress']")
    public WebElement secondProductName;

    @FindBy(xpath = "//a[text()='Yellow Cropped Jacket']")
    public WebElement thirdProductName;

    @FindBy(css = "[name ='update_cart']")
    public WebElement updateCartButton;

    @FindBy(xpath = "//div[@class='cart_totals']//td[@data-title='Total']//bdi")
    public WebElement totalPrice;

    @FindBy(xpath = "//div[@class='cart_totals']//td[@data-title='Subtotal']//bdi" )
    public WebElement subtotalPrice;

    @FindBy(xpath = "//a[text() = '×']")
    public WebElement deleteProduct;

    @FindBy(css = "[class='cart-empty woocommerce-info']")
    public WebElement cartEmptyInfo;

    @FindBy(css = "[class='woocommerce-message']")
    public WebElement cartUpdateInfo;

    @FindBy(css = "[class='checkout-button button alt wc-forward']")
    public WebElement btnProceedToCheckout;


    public void increaseQuantityProduct(String number) {
        firstProductQuantity.sendKeys(Keys.CONTROL + "a");
        firstProductQuantity.sendKeys(Keys.DELETE);
        firstProductQuantity.sendKeys(number);
    }

    public void increaseQuantityProduct(String number, String number2) {
        firstProductQuantity.sendKeys(Keys.CONTROL + "a");
        firstProductQuantity.sendKeys(Keys.DELETE);
        firstProductQuantity.sendKeys(number2);
        thirdProductQuantity.sendKeys(Keys.CONTROL + "a");
        thirdProductQuantity.sendKeys(Keys.DELETE);
        thirdProductQuantity.sendKeys(number);
    }

    public void clickUpdateCart(){
        updateCartButton.click();
    }

    public void clickProceedToCheckout(){btnProceedToCheckout.click();}

    public void checkTotalPrice(){
        String subtotal = subtotalPrice.getText();
        String totalPriceAmount = totalPrice.getText();
        Assert.assertEquals(subtotal,totalPriceAmount);
        System.out.println(subtotal);
        System.out.println(totalPriceAmount);
    }

    public void clickDeleteProduct(){deleteProduct.click();}

    public void checkDeleteProduct(String deleteControlText){
     String actualInfo = cartEmptyInfo.getText();
     String expectedInfo = deleteControlText;
     Assert.assertEquals(actualInfo,expectedInfo);
     System.out.println("Actual result: " + actualInfo);
     System.out.println("Expected Result: " + expectedInfo);
    }
    public void checkUpdateProduct(){
        String actualInfo = cartUpdateInfo.getText();
        String expectedInfo = "Cart updated.";
        Assert.assertEquals(actualInfo,expectedInfo);
        System.out.println("Actual result: " + actualInfo);
        System.out.println("Expected Result: " + expectedInfo);
    }

    public void checkCartPage(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Cart - Sample Shop";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public void verifyFirstProduct(){
        String actualTitle = firstProductName.getText();
        String expectedTitle = "Yellow Stripe Coat";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public void verifySecondProduct(){
        String actualTitle = secondProductName.getText();
        String expectedTitle = "Blue Lace Dress";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public void verifyThirdProduct(){
        String actualTitle = thirdProductName.getText();
        String expectedTitle = "Yellow Cropped Jacket";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    //String deleteItemName
    public void deleteProduct() {
        for(int i=0; i<3; i++){
            WebDriverWait wait = new WebDriverWait(driver,30000);
            wait.until(ExpectedConditions.elementToBeClickable(deleteProduct));
            deleteProduct.click();
            waitFor(5);
        }
    }


}
