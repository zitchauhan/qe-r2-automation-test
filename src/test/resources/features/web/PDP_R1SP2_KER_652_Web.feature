Feature: [Desktop]  Ratings & Reviews - Product Detail Page

@Web @C-PDP @Regression @KER-652 @ZYP_PDP_K652-3448 @CR-RKA
 Scenario: To Verify Ratings and Review on PDP in desktop
  Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
   Then user clicks on the product card and navigates to PDP of the product
  Then user verify customer is able to view the average rating on top  
  Then user click on Review and Rating on top of the page
  Then User be able to write review
    When user navigates to PLP of any product
    Then User select the product with No reviews 
    When user clicks on Reviews tab
    Then User to verify Be the first to review this product       

  