package steps;

import io.cucumber.java.en.Given;
import pages.CartPage;

public class CartPageSteps {
    CartPage cartPage = new CartPage();

    @Given("Quantity section is set to {}")
    public void checkQuantity(String number){
        cartPage.increaseQuantityProduct(number);
    }

    @Given("Click Update Cart button")
    public void clickUpdateCartButton(){
        cartPage.clickUpdateCart();
    }

    @Given("Click Proceed to checkout button")
    public void clickProceedToCheckoutButton(){
        cartPage.clickProceedToCheckout();
    }

    @Given("It is checked that the total price of the product has increased correctly")
    public void checkTotalPrice(){
        cartPage.checkTotalPrice();
    }

    @Given("The product in the cart is deleted and the existence of the {} warning is checked")
    public void checkDeleteProduct(String deleteControlText){
        cartPage.clickDeleteProduct();
        cartPage.checkDeleteProduct(deleteControlText);
    }

    @Given("Check that the cart is updated correctly")
    public void checkUpdateProduct(){
       cartPage.checkUpdateProduct();
    }

    @Given("It is checked that the cart page is opened and added correctly")
    public void checkProduct(){
      cartPage.checkCartPage();
      cartPage.verifyFirstProduct();
      cartPage.verifySecondProduct();
      cartPage.verifyThirdProduct();
    }

    @Given("Number of the most expensive product in the cart is set to {} and the number of the cheapest product is set to {}")
    public void increaseProductQuantity(String cheapProductAmount, String expensiveProductAmount){
        cartPage.increaseQuantityProduct(cheapProductAmount,expensiveProductAmount);
    }

    @Given("All items in the basket are deleted respectively ×")
    public void clickAllDeleteProduct(){
        cartPage.deleteProduct();
    }
}
