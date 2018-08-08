Feature: To Verify the Add To Cart Functionality

  @Regression @C-PDP  @Mobile @All @KER-1920  @ZYP_K1920-5268
  Scenario: Verify the Add To Cart functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    Then User closes the web application

  @Regression @C-PDP @1HR @Mobile @All @KER-1920  @ZYP_K1920-5265
  Scenario: Verify the view cart functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    And user click on view cart button
    Then User closes the web application

  @Regression @C-PDP  @Mobile @All @KER-1920  @ZYP_K1920-5272
  Scenario: Verify the checkout functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    And user click on checkout button
    Then User closes the web application
