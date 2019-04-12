Feature: To Verify the Add To Cart Functionality

 @Regression @C-PDP @Web @All @KER-1920 @ZYP_PDP_K1920-5269 @Rerun @CR-AG @sample
  Scenario: Verify the Add To Cart functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    #Then user click on Add to cart button
    And user click on ship it button
	And user click on viewcart button
    Then User closes the web application

  @Regression @Sanity @C-PDP @Web @All @KER-1920 @ZYP_PDP_K1920-5263 @Rerun @1HR @CR-AG
  Scenario: Verify the view cart functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    #Then user click on Add to cart button
    And user click on ship it button
	And user click on viewcart button
    #And user click on view cart button
    Then User closes the web application

  @Regression  @C-PDP @Web @All @KER-1920 @ZYP_PDP_K1920-5260 @Rerun @CR-AG
  Scenario: Verify the checkout functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    #Then user click on Add to cart button
    And user click on ship it button
	And user click on viewcart button
    And user click on checkout button
    Then User closes the web application
    
  @Regression @C-PDP @Web @All @KER-1920 @ZYP_PDP_K1920-5829 @CR-AG
  Scenario: Verify the Add To Cart functionality and check the product image-Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
 
    @Regression @C-PDP @Web @All @KER-1920 @ZYP_PDP_K1920-5835 @CR-AG
    Scenario: Verify the Add To Cart functionality and check the product price-Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    
     @Regression @C-PDP @Web @All @KER-1920 @ZYP_PDP_K1920-5836 @CR-AG @1HR @RBeta
    Scenario: Verify the Add To Cart functionality and check the product name-Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    
    @Regression @C-PDP @Web @All @KER-1920 @ZYP_PDP_K1920-5840 @CR-AG
    Scenario: Verify the Add To Cart functionality and close the popup-Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    #Then user click on Add to cart button
    And user click on ship it button
    And then user close the add to cart popup
    
    @Regression @C-PDP @Web @All @KER-1920 @ZYP_PDP_K1920-5270 @CR-AG
    Scenario:  Verify the  checkout functionality-Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User click on the product image
    #Then user click on Add to cart button
    And user click on ship it button
	And user click on viewcart button
   
  