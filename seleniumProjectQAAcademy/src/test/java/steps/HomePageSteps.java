package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("It is checked whether you are on the homepage or not")
    public void checkHomePageTitle(){homePage.checkHomepage();}

    @Given("Click on the {} button on the banner")
    public void clickShopNowButton(String buttonName){homePage.clickShopNowButton(buttonName);}

    @Given("Scrolls to the bottom of the page")
    public void checkScrollPageDown(){homePage.scrollPageDown();}

    @Given("The visibility of the Contact Info section at the bottom is checked")
    public void checkVisibleContactInfo(){homePage.checkVisibleContactInfo();}

    @Given("Click the Go button to the top of the page that appears at the bottom right")
    public void clickTopOnPage(){homePage.clickScrollToTop();}

    @Given("Checked that the page has been scrolled to the top")
    public void checkOnTabHomePage(){homePage.checkVisibleTopPage();}

    @Given("Click {} button from the navigation bar")
    public void clickHomePageMenuNamed(String menuName){homePage.clickTopMenu(menuName);}

}
