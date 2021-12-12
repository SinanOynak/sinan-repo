package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.Utilities;

import java.util.List;

public class CheckoutPage extends Utilities {
    @FindBy(css="[id='billing_first_name']")
    public WebElement firstNameInput;

    @FindBy(css="[id='billing_last_name']")
    public WebElement lastNameInput;

    @FindBy(css="[id='billing_company']")
    public WebElement companyNameInput;

    @FindBy(css="[id='billing_address_1']")
    public WebElement address1Input;

    @FindBy(css="[id='billing_address_2']")
    public WebElement address2Input;

    @FindBy(css="[id='billing_postcode']")
    public WebElement postCodeInput;

    @FindBy(css="[id='billing_city']")
    public WebElement townInput;

    @FindBy(css="[id='billing_phone']")
    public WebElement phoneInput;

    @FindBy(css="[id='billing_email']")
    public WebElement userEmailInput;

    @FindBy(css="[id='order_comments']")
    public WebElement orderCommentInput;

    @FindBy(css="[id='mailpoet_woocommerce_checkout_optin']")
    public WebElement chckInfo;


    public void fillFirstName(){firstNameInput.sendKeys("Sinan");}
    public void fillLastName(){lastNameInput.sendKeys("Oynak");}
    public void fillCompanyName(){companyNameInput.sendKeys("Getir");}
    public void fillAddress1Name(){address1Input.sendKeys("Icerenkoy");}
    public void fillAddress2Name(){address2Input.sendKeys("Emek Apt");}
    public void fillPostCode(){postCodeInput.sendKeys("34752");}
    public void fillTownName(){townInput.sendKeys("Ataşehir");}
    public void fillPhoneNumber(){phoneInput.sendKeys("5555555555");}
    public void fillEmail(){userEmailInput.sendKeys("test@getir.com");}
    public void fillOrderComment(){orderCommentInput.sendKeys("Test");}
    public void clickCheckBoxInfo(){chckInfo.click();}

}
