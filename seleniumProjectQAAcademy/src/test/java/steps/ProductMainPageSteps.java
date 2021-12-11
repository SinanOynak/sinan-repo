package steps;

import io.cucumber.java.en.Given;
import pages.ProductMainPage;

public class ProductMainPageSteps {
    ProductMainPage productMainPage = new ProductMainPage();

    @Given("It is checked to go to the Products page")
    public void checkProductMainPageTitle(){productMainPage.checkProductMainPage();}

    @Given("Click the {} button under the first product on the page that appears")
    public void clickFirstAddToCart(String firstAddCartButton){productMainPage.firstAddToCartButton(firstAddCartButton);}

    @Given("Click on the basket icon in the navigation bar")
    public void clickBasketIconButton(){productMainPage.clickBasketIcon();}

    @Given("It is checked whether the relevant product has been added to the cart or not")
    public void checkBasketQuantityControl(){productMainPage.checkBasketQuantity();}

    @Given("Products are sorted with the {} option")
    public void clickSortProduct(String sortName){productMainPage.clickSortOrderDragDrop(sortName);}


}
