Feature: To Verify the Add To Cart Functionality

  @Regression @PDP @Web @All @KER-1920 @ZYP-5269 @Rerun
  Scenario: Verify the Add To Cart functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    Then User closes the web application

  @Regression @Sanity @PDP @Web @All @KER-1920 @ZYP-5263 @Rerun
  Scenario: Verify the view cart functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    And user click on view cart button
    Then User closes the web application

  @Regression  @PDP @Web @All @KER-1920 @ZYP-5260 @Rerun
  Scenario: Verify the checkout functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    And user click on checkout button
    Then User closes the web application
