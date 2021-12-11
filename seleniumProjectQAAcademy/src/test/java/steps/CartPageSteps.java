package steps;

import io.cucumber.java.en.Given;
import pages.CartPage;

public class CartPageSteps {
    CartPage cartPage = new CartPage();

    @Given("Quantity section is set to {} and Update Cart button is clicked")
    public void checkQuantity(String number){
        cartPage.increaseQuantityProduct(number);
        cartPage.clickUpdateCart();
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
}
