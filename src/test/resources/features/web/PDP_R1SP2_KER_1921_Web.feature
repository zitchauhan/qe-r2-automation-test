Feature: [Desktop]  Add to Cart on PDP

  @C-HP @Web @Regression @KER-1921 @ZYP_PDP_K1921-3432 @CR-RKA  @1HR
  Scenario Outline: Verify the functionality of Add to Cart- inventory/quantity restrictions are in place, then add the maximum available/allowable
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user search the data in search box"<data>"
    Then User to select the product
    Then verify Sorry the selected item is limited to XYZ order.

    Examples: 
      | data                                          |
      | Magellan Outdoors Men's Neoprene Wading Boots |

  @C-HP @Web @Regression @KER-1921 @ZYP_PDP_K1921-5053 @CR-RKA
  Scenario Outline: Verify the functionality of Add to Cart for "not sold online"
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user search the data in search box"<data>"
    Then User select to not sold online item
    Then User verify not sold online

    Examples: 
      | data                       |
      | GLOCK G17 Gen4 9x19 Pistol |

  @C-HP @Web @Regression @KER-1921 @ZYP_PDP_K1921-5074 @CR-RKA @1HR
  Scenario Outline: Verify the functionality of Add to Cart for "Out of Stock"
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user search the data in search box"<data>"
    Then User select item of "out of stock"
    Then verify out of stock

    Examples: 
      | data           |
      | Toddler Shirts |

  @C-HP @Web @Regression @KER-1921 @ZYP_PDP_K1921-5075 @CR-RKA @1HR
  Scenario: Verify the functionality of Add to Cart for "size and color combination availability"
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    Then user to verify add to cart is disable/enable when color and size is not avialable

  @C-HP @Web @Regression @KER-1921 @ZYP_PDP_K1921-5076 @CR-RKA
  Scenario: Verify the functionality of Add to Cart for -Enable
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    Then user to verify add to cart is disable/enable when color and size is not avialable

  @C-HP @Web @Regression @KER-1921 @ZYP_PDP_K1921-5079 @CR-RKA
  Scenario: Verify selected SKU(item) should be added to cart.
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    Then Verify SKU
