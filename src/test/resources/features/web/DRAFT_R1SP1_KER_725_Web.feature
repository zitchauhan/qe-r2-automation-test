Feature: To Verify the functionality of "Mini Cart" in the Global Header

   @Web @KER-725
  Scenario: As a User I should be able see to Navigate to My cart Page as a Guest User
     Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to click on MiniCart icon and navigate to My cart page and Validate Shopping Cart
    Then User should be dispalyed with message Your Shopping Cart is Empty
    Then User closes the web application

      @Web  @KER-725
  Scenario: As a User I should be able see to Navigate to My cart Page as a Registered User
     Given user launches the browser and navigates to "ASO_HOME" page
     # Sign IN
    Then User should be able to click on MiniCart icon and navigate to My cart page and Validate Shopping Cart
    Then User should be dispalyed with message Your Shopping Cart is Empty
    Then User closes the web application
    
    
     @Web @KER-725
  Scenario: [UI]-Desktop-Guest user ,Ability for system to navigate to shopping cart when Registered customer clicks on a minicart with items 
     Given user launches the browser and navigates to "ASO_HOME" page
     # Sign IN
    Then User should be able to see number of products added in the minicart
    And User clicks on the minicart icon and navigated to minicart
    Then User should able to see the section where all the product are displayed
    Then User closes the web application
    
    
       @Web @KER-725 @KER-6418
  Scenario: UI]-Desktop-Sign In user ,Ability for system to navigate to shopping cart when guest customer clicks on a minicart with items 
     Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see number of products added in the minicart
    And User clicks on the minicart icon and navigated to minicart
    Then User should able to see the section where all the product are displayed
    Then User closes the web application
    