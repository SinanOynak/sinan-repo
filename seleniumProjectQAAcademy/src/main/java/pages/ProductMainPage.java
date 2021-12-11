package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.Utilities;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ProductMainPage extends Utilities {

    ////ul[@class='products columns-3']/li[1]
    @FindBy(css = "[data-product_id ='205']")
    public WebElement firstAddToCart;

    @FindBy(css = "li [title = 'View your shopping cart']")
    public WebElement basketIcon;

    @FindBy(css = "[name ='orderby'] option")
    public List<WebElement> chkProductSort;


    public void checkProductMainPage(){
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Shop - Sample Shop";
        Assert.assertEquals(ActualTitle,ExpectedTitle);
    }

    public void firstAddToCartButton(String firstAddCart){firstAddToCart.click();}

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
