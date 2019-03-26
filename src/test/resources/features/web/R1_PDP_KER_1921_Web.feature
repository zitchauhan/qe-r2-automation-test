Feature: [Desktop]  Add to Cart on PDP

    @C-PDP @Web @Regression @KER-1921 @ZYP_PDP_K1921-3432 @CR-RKA  @1HR @RBeta
  Scenario: Verify the functionality of Add to Cart- inventory/quantity restrictions are in place, then add the maximum available/allowable
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User to click on search button after putting data "limitedQuantityRestriction_CMC"
    Then User to select the product
    Then verify Sorry the selected item is limited to XYZ order.


  @C-PDP @Web @Regression @KER-1921 @ZYP_PDP_K1921-5053 @CR-RKA @RBeta 
Scenario: Verify the functionality of Add to Cart for "not sold online" 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User to click on search button after putting data "Gun_Not_Sold_Online" 
	Then User select to not sold online item 
	Then User verify not sold online 


  @C-PDP @Web @Regression @KER-1921 @ZYP_PDP_K1921-5074 @CR-RKA @1HR
  Scenario: Verify the functionality of Add to Cart for "Out of Stock"
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "OutOfStockProduct" in the searchbox
    Then User select item of out of stock
    Then verify out of stock

  @C-PDP @Web @Regression @KER-1921 @ZYP_PDP_K1921-5075 @CR-RKA @1HR
  Scenario: Verify the functionality of Add to Cart for "size not available and color available"
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    Then user to verify add to cart is disable when color and size is not avialable

  @C-PDP @Web @Regression @KER-1921 @ZYP_PDP_K1921-5076 @CR-RKA
  Scenario: Verify the functionality of Add to Cart for -Enable
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    #Then user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section

  @C-PDP @Web @Regression @KER-1921 @ZYP_PDP_K1921-5079 @CR-RKA
  Scenario: Verify selected SKU(item) should be added to cart.
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    Then Verify SKU
