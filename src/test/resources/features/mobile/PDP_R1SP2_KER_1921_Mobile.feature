Feature: [Mobile]  Add to Cart on PDP

  @C-PDP @Mobile @Regression @KER-1921  @ZYP_PDP_K1921-5092 @CR-RKA
  Scenario Outline: Verify the functionality of Add to Cart- inventory/quantity restrictions are in place, then add the maximum available/allowable
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User to click on search button after putting data"<data>"
    Then User to select the product
    Then verify Sorry the selected item is limited to XYZ order.

    Examples: 
      | data                                          |
      | Magellan Outdoors Men's Neoprene Wading Boots |

  @C-PDP @Mobile @Regression @KER-1921  @ZYP_PDP_K1921-5096 @CR-RKA @1HR
  Scenario Outline: Verify the functionality of Add to Cart for "not sold online"
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User to click on search button after putting data"<data>"
    Then User select to not sold online item
    Then User verify not sold online

    Examples: 
      | data                       |
      | GLOCK G17 Gen4 9x19 Pistol |

  @C-PDP @Mobile @Regression @KER-1921  @ZYP_PDP_K1921-5098 @CR-RKA
  Scenario Outline: Verify the functionality of Add to Cart for "Out of Stock"
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User to click on search button after putting data"<data>"
    Then User select item of "out of stock"
    Then verify out of stock

    Examples: 
      | data           |
      | Toddler Shirts |

  @C-PDP @Mobile @Regression @KER-1921  @ZYP_PDP_K1921-5100 @CR-RKA
  Scenario: Verify the functionality of Add to Cart for -Enable
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user select the product having star rating
    Then user to verify add to cart is disable/enable when color and size is not avialable

  @C-PDP @Mobile @Regression @KER-1921  @ZYP_PDP_K1921-5099 @CR-RKA @1HR
  Scenario: Verify the functionality of Add to Cart for "size and color combination availability"
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user select the product having star rating
    Then user to verify add to cart is disable/enable when color and size is not avialable

  @C-PDP @Mobile @Regression @KER-1921  @ZYP_PDP_K1921-5012 @CR-RKA
  Scenario: Verify selected SKU(item) should be added to cart.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user select the product having star rating
    Then Verify SKU
