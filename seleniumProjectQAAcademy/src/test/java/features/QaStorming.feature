Feature: QA Shopping
  Background:
    * Navigate to https://training.qastorming.com/
    * It is checked whether you are on the homepage or not

  Scenario: Check Product - Delete Product
    * Click on the SHOP NOW button on the banner
    * It is checked to go to the Products page
    * Click the Add to Cart button under the first product on the page that appears
    * Wait for 2
    * Click on the basket icon in the navigation bar
    * It is checked whether the relevant product has been added to the cart or not
    * Quantity section is set to 3 and Update Cart button is clicked
    * Wait for 2
    * It is checked that the total price of the product has increased correctly
    * Wait for 2
    * The product in the cart is deleted and the existence of the Your cart is currently empty. warning is checked
    * Wait for 2

  Scenario: Check Top Menu on HomePage
    * Scrolls to the bottom of the page
    * The visibility of the Contact Info section at the bottom is checked
    * Wait for 2
    * Click the Go button to the top of the page that appears at the bottom right
    * Checked that the page has been scrolled to the top
    * Wait for 2

  Scenario: Sort Product
    * Click Shop button from the navigation bar
    * Wait for 2
    * It is checked to go to the Products page
    * Products are sorted with the Sort by latest option
    * Wait for 10