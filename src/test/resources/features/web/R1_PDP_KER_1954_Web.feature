Feature:  [Web]Components: PDP - Ratings & Reviews


@Regression @Web @All @KER-1954 @C-PDP @ZYP_PDP_K1954-3991 @CR-RKA
  Scenario: To verify user is able to view Product details with Reviews
  Given user launches the browser and navigates to "ASO_HOME" page
   When user enters "ProductHavingRatings" in the searchbox
    And user should be able to see PDP mention in the current url
    When user clicks on Reviews tab
    Then user should be able to see the reviews heading and section
    Then User be able to write review   
 
   
   
   @Regression @Web @All @KER-1954 @C-PDP @ZYP_PDP_K1954-3999 @CR-RKA
   Scenario:  verify user is able to view Product details with No Reviews
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then User select the product with No reviews 
    When user clicks on Reviews tab
    Then User to verify Be the first to review this product       



