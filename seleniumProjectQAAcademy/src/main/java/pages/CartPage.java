package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.Utilities;

import java.sql.SQLOutput;

public class CartPage extends Utilities {

    @FindBy(css = "[inputmode = 'numeric']")
    public WebElement productQuantity;

    @FindBy(css = "[name ='update_cart']")
    public WebElement updateCartButton;

    @FindBy(css = "[data-title ='Price'] bdi")
    public WebElement price;

    @FindBy(css = "[data-title ='Subtotal'] bdi")
    public WebElement subtotalPrice;

    @FindBy(xpath = "//a[text() = '×']")
    public WebElement deleteProduct;

    @FindBy(css = "[class='cart-empty woocommerce-info']")
    public WebElement cartEmptyInfo;


    public void increaseQuantityProduct(String number) {
        productQuantity.sendKeys(Keys.CONTROL + "a");
        productQuantity.sendKeys(Keys.DELETE);
        productQuantity.sendKeys("3");
    }

    public void clickUpdateCart(String updateCart){
        updateCartButton.click();
    }

    public void checkTotalPrice(){
        String subtotal = subtotalPrice.getText();
        String totalPrice = price.getText();
        Assert.assertEquals(subtotal,totalPrice);
        System.out.println(subtotal);
        System.out.println(totalPrice);
    }

    public void clickDeleteProduct(){
     deleteProduct.click();
    }

    public void checkDeleteProduct(String deleteControlText){
     String actualInfo = cartEmptyInfo.getText();
     String expectedInfo = deleteControlText;
     Assert.assertEquals(actualInfo,expectedInfo);
     System.out.println("Actual result: " + actualInfo);
     System.out.println("Expected Result: " + expectedInfo);
    }
}
