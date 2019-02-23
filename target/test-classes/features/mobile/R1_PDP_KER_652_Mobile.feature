Feature: [Mobile]  Ratings & Reviews - Product Detail Page




@Mobile @C-PDP @Regression @KER-652 @ZYP_PDP_K652-4542 @CR-RKA
Scenario: To Verify Ratings and Review on PDP in Mobile
 Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
   Then User to select the product where review is present  
    Then User to navigate to review
    Then User be able to write review     
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
  Then User to navigate to review  
    Then User to verify Be the first to review this product       
   