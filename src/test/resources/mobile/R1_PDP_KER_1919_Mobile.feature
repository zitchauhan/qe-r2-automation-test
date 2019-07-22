#Feature: [Mobile]  Add to Cart - Error Messages (PDP)
#
#  @C-PDP @Mobile @Regression @KER-1919  @ZYP_PDP_K1919-5042 @CR-AG @RBeta
#  Scenario Outline: - Verify Add to Cart -messaging confirming the restriction
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User to click on search button after putting data"<data>"
#    Then User to select the product
#    Then verify Sorry the selected item is limited to XYZ order.
#
#    Examples: 
#      | data                                          |
#      | Magellan Outdoors Men's Neoprene Wading Boots |
#
#  @C-PDP @Mobile @Regression @KER-1919 @ZYP_PDP_K1919-5043 @CR-AG
#  Scenario Outline: Verify the functionality of Add to Cart for "Out of Stock"
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User to click on search button after putting data"<data>"
#    Then User select item of "out of stock"
#    Then verify out of stock
#
#    Examples: 
#      | data           |
#      | Toddler Shirts |
#
#
#  @C-PDP @Mobile @Regression @KER-1919 @ZYP_HP_K1919-5046 @CR-AG
#  Scenario Outline: [UI-Desktop]- Verify Add to Cart -messaging to confirm the quantity was added
#    Given user launches the browser and navigates to "ASO_HOME" page
#   Then User to click on search button after putting data"<data>"
#    Then User to selects the product from PLP and add product in cart with access quantity
#    Then verify user gets a msg Sorry we only have XYZ of this item available We added those to the cart
#
#    Examples: 
#      | data                                          |
#      | Ariat Men's Workhog Work Boots |
#      
# @C-PDP @Mobile @Regression @KER-1919  @ZYP_PDP_K1919-5044 @CR-AG
#  Scenario: Verify Add to Cart -messaging to confirm the quantity was added
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    And User navigates to L3
#    Then user clicks on the product card and navigates to PDP of the product
#    Then user click on Add to cart button
#    And user able to see item added in the cart