Feature: To Verify navigation of shopping cart link

  @Verify_Navigation_MyCart @Web @All @KER-726
  Scenario: As a User I should be able see to Navigate to My cart Page
    Given User launches the browser and navigates to Home page
    Then User should be able to click on MiniCart icon and navigate to My cart page and Validate Shopping Cart
    Then User closes the web application
