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
    * Quantity section is set to 3
    * Click Update Cart button
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
    * Click on the Add to Cart buttons in the first 3 rows
    * Wait for 4
    * Click View Cart button
    * It is checked that the cart page is opened and added correctly
    * Number of the most expensive product in the cart is set to 2 and the number of the cheapest product is set to 4
    * Click Update Cart button
    * Check that the cart is updated correctly
    * Click Proceed to checkout button
    * Fill Billing Details Form
    * Fill Order notes
    * Wait for 2
    * Click checkbox for I would like to receive exclusive emails with discounts and product information
    * Wait for 2
    * Click on the basket icon in the navigation bar
    * Wait for 2
    #* All items in the basket are deleted respectively ×
    * Wait for 10