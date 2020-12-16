Feature: To To verify Quick View - Product Attributes

  @C-PLP @Web @Regression @KER-737 @ZYP_PLP_K737-3508 @CR-AKK @RBeta  @TC-OMNI-13435
  Scenario: To verify All of the products defining attributes in Quick View
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    Then User click on Quick view button
    Then verify addcart button is displayed
    #Then verify ship it button is displayed
    Then user is able to see color and size attributes
    And user is able to see full product details attribute
    And user is able to see quantity attribute

  @C-PLP @Web @Regression @KER-737 @ZYP_PLP_K737-6058 @CR-AKK @RBeta @P1 @P1Temp
  Scenario: To Verify the default SKU selection(color)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    Then User click on Quick view button
    Then verify addcart button is displayed 

   @C-PLP @Web @Regression @KER-737 @ZYP_PLP_K737-6059 @CR-AKK @RBeta
  Scenario: Verify OOS states for quick view
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
     Then User click on Quick view button
    Then verify addcart button is displayed
