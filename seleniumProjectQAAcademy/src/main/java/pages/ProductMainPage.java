package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import utilis.Utilities;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ProductMainPage extends Utilities {

    @FindBy(xpath = "//ul[@class='products columns-3']/li[1]/a[2]")
    public WebElement firstAddToCart;

    @FindBy(xpath = "//ul[@class='products columns-3']/li[1]/a[3]")
    public WebElement firstViewCart;

    @FindBy(xpath = "//ul[@class='products columns-3']/li[2]/a[2]")
    public WebElement secondAddToCart;

    @FindBy(xpath = "//ul[@class='products columns-3']/li[3]/a[2]")
    public WebElement thirdAddToCart;

    @FindBy(css = "li [title = 'View your shopping cart']")
    public WebElement basketIcon;

    @FindBy(css = "[name ='orderby'] option")
    public List<WebElement> chkProductSort;


    public void checkProductMainPage(){
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Shop - Sample Shop";
        Assert.assertEquals(ActualTitle,ExpectedTitle);
    }

    public void firstAddToCartButton(){firstAddToCart.click();}

    public void addToCartButtonForSort(){
        firstAddToCart.click();
        secondAddToCart.click();
        thirdAddToCart.click();
    }

    public void clickViewButton(){
       firstViewCart.click();
    }

    public void clickBasketIcon(){basketIcon.click();}

    public void checkBasketQuantity(){
        Boolean verifyBasket = basketIcon.getText().equalsIgnoreCase("1");
        assertTrue(verifyBasket);
        System.out.println("Basket quantity: " + basketIcon.getText());
    }

    public void clickSortOrderDragDrop(String sortName){
        for(WebElement sort: chkProductSort){
            if (sort.getText().equalsIgnoreCase(sortName)){
                sort.click();
                return;
            }
        }
        Assert.fail("No "+ chkProductSort +" could be located");
    }

}
