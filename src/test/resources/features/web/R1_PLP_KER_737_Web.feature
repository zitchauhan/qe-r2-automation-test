Feature: To To verify Quick View - Product Attributes

  @C-PLP @Web @Regression @KER-737 @ZYP_PLP_K737-3508 @CR-AKK @RBeta
  Scenario: To verify All of the products defining attributes in Quick View
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    Then User click on Quick view button
    Then verify addcart button is displayed
    #Then verify ship it button is displayed
    Then user is able to see color and size attributes
    And user is able to see full product details attribute
    And user is able to see quantity attribute

  @C-PLP @Web @Regression @KER-737 @ZYP_PLP_K737-6058 @CR-AKK @RBeta 
  Scenario: To Verify the default SKU selection(color)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    Then User click on Quick view button
    And User verifies the alternative available colors
    Then User sees color options to be notated near the product image

   @C-PLP @Web @Regression @KER-737 @ZYP_PLP_K737-6059 @CR-AKK @RBeta @vidya
  Scenario: Verify OOS states for quick view
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
     Then User click on Quick view button
    Then verify addcart button is displayed
    #Then verify ship it button is displayed
 
