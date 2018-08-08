Feature: To Verify the Add To Cart Functionality

  @Regression @C-PDP @Web @All @KER-1920 @ZYP_K1920-5269 @Rerun 
  Scenario: Verify the Add To Cart functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    Then User closes the web application

  @Regression @Sanity @C-PDP @Web @All @KER-1920 @ZYP_K1920-5263 @Rerun @1HR
  Scenario: Verify the view cart functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    And user click on view cart button
    Then User closes the web application

  @Regression  @C-PDP @Web @All @KER-1920 @ZYP_K1920-5260 @Rerun
  Scenario: Verify the checkout functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    And user click on checkout button
    Then User closes the web application
