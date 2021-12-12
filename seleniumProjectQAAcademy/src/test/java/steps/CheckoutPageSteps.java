package steps;

import io.cucumber.java.en.Given;
import pages.CheckoutPage;

public class CheckoutPageSteps {
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("Fill Billing Details Form")
    public void fillBillingForm(){
        checkoutPage.fillFirstName();
        checkoutPage.fillLastName();
        checkoutPage.fillCompanyName();
        checkoutPage.fillAddress1Name();
        checkoutPage.fillAddress2Name();
        checkoutPage.fillPostCode();
        checkoutPage.fillTownName();
        checkoutPage.fillPhoneNumber();
        checkoutPage.fillEmail();
    }

    @Given("Fill Order notes")
    public void fillOrderNotes(){checkoutPage.fillOrderComment();}

    @Given("Click checkbox for I would like to receive exclusive emails with discounts and product information")
    public void clickInfoMessage(){checkoutPage.clickCheckBoxInfo();}
}
