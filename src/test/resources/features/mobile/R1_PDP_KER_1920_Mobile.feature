Feature: To Verify the Add To Cart Functionality

  @Regression @C-PDP  @Mobile @All @KER-1920  @ZYP_PDP_K1920-5268 @CR-AG
  Scenario: Verify the Add To Cart functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    Then User closes the web application

  @Regression @C-PDP @1HR @Mobile @All @KER-1920  @ZYP_PDP_K1920-5265 @CR-AG
  Scenario: Verify the view cart functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    And user click on view cart button
    Then User closes the web application

  @Regression @C-PDP  @Mobile @All @KER-1920  @ZYP_PDP_K1920-5272 @CR-AG
  Scenario: Verify the checkout functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    And user click on checkout button
    Then User closes the web application
  
  
  @Regression @C-PDP @Mobile @All @KER-1920 @ZYP_PDP_K1920-5832 @CR-AG @1HR
  Scenario: Verify the Add To Cart functionality and check the product image-Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then User add product to cart and validate the price title and image of the product

 
    @Regression @C-PDP @Mobile @All @KER-1920 @ZYP_PDP_K1920-5834 @CR-AG
    Scenario: Verify the Add To Cart functionality and check the product price-Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then User add product to cart and validate the price title and image of the product

    
     @Regression @C-PDP @Mobile @All @KER-1920 @ZYP_PDP_K1920-5837 @CR-AG
    Scenario: Verify the Add To Cart functionality and check the product name-Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then User add product to cart and validate the price title and image of the product

    
    @Regression @C-PDP @Mobile @All @KER-1920 @ZYP_PDP_K1920-5844 @CR-AG
    Scenario: Verify the Add To Cart functionality and close the popup-Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then user click on Add to cart button
    And then user close the add to cart popup
    
      @Regression @C-PDP @Mobile @All @KER-1920 @ZYP_PDP_K1920-3439 @CR-AG @1HR
    Scenario: Verify the Add to Cart Notification message
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    Then User add product to cart and validate the price title and image of the product
    And user click on checkout button
   
  