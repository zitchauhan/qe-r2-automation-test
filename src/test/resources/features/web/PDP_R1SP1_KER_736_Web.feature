Feature: To Validate Quick Look / View and user is able to add the product to cart from quick view
 
 @C-PDP @Web @Regression @KER-736 @ZYP_PDP_K736-1441 @C-HP @CR-AKK 
   Scenario: Verify that user has the capability to quick look or view
   Given user launches the browser and navigates to "ASO_HOME" page
   Then User navigates to L3 from home page
     Then User click on Quick view button
   
   
  @C-PDP @Web @Regression @KER-736 @ZYP_PDP_K736-3503 @CR-AKK @1HR
  Scenario: Verify presence of search box with search icon on Home page.
    Given user launches the browser and navigates to "ASO_HOME" page
     Then User navigates to L3 from home page
     Then User click on Quick view button
     And user should be able to see Add to cart button and quantity section
     Then verify addcart or see details button is displayed. 