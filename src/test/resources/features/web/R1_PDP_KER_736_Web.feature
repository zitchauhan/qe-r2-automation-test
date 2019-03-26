Feature: To Validate Quick Look / View and user is able to add the product to cart from quick view

  @C-PDP @Web @Regression @KER-736 @ZYP_PDP_K736-1441 @C-HP @CR-RKA
  Scenario: Verify that user has the capability to quick look or view
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    Then User click on Quick view button

  @C-PDP @Web @Regression @KER-736 @ZYP_PDP_K736-3503 @CR-RKA @1HR
  Scenario: To verify user is able to add the product to cart from quick view
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    Then User click on Quick view button
    #Then verify addcart button is displayed
  	Then verify ship it button is displayed
    
   