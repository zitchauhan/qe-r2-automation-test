Feature: To Verify the functionality of "Mini Cart" in the Global Header


  @Mobile  @KER-725   @ZYP_HP_K725-2810 @Regression  @C-HP @1HR
   Scenario:  Sign in Guest User, Ability for customer to see number of items in minicart
     Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    And User clicks on the minicart icon and navigated to minicart 
    Then User should be dispalyed with message Your Shopping Cart is Empty
    
    @Mobile  @KER-725   @ZYP_HP_K725-6417  @Regression  @C-HP @1HR
     Scenario: Guest user ,Ability for system to navigate to shopping cart when customer clicks on a minicart with items
  
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu    
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    #Then user click on Add to cart button
    And user click on ship it button
    And user click on view cart     
    And User clicks on the minicart icon and navigated to minicart
    Then User check for the view cart title