Feature:  Add to Cart - Error Messages (PDP)

  @C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-5040 @CR-AG 
  Scenario Outline: [UI-Desktop]- Verify Add to Cart -message to inform the user that the item is OOS(Out of Stock)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user search the data in search box"<data>"
    Then User select item of "out of stock"
    Then verify out of stock

    Examples: 
      | data           |
      | Toddler Shirts |

      
  @C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-5038 @CR-AG
  Scenario Outline: [UI-Desktop]- Verify Add to Cart -messaging to confirm the limited quantity was added
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user search the data in search box"<data>"
    Then User to select the product
    Then verify Sorry the selected item is limited to XYZ order.

    Examples: 
      | data                                          |
      | Magellan Outdoors Men's Neoprene Wading |
      
          
  @C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-5039 @CR-AG
  Scenario Outline: [UI-Desktop]- Verify Add to Cart -messaging to confirm the quantity was added
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user search the data in search box"<data>"
    Then User to selects the product from PLP and add product in cart with access quantity
    Then verify user gets a msg Sorry we only have XYZ of this item available We added those to the cart

    Examples: 
      | data                                          |
      | shirts |
      