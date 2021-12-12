package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.Utilities;

import java.sql.SQLOutput;
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

    @FindBy(xpath = "//td[@class = 'product-remove']")
    public List<WebElement> listDeleteProduct;

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

    /*public void deleteProduct(String deleteItemName){
        for(WebElement dltProduct: listDeleteProduct){
            if (dltProduct.getText().equalsIgnoreCase(deleteItemName)){
                dltProduct.click();
                return;
            }
        }
        Assert.fail("No menu named "+listDeleteProduct+" could be located on the home page");
    }*/

}
