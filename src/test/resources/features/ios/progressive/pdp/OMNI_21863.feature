Feature: Verify Add to Cart (Variations & Restrictions)

  @Sprint3 @TC-OMNI-21863_1
  Scenario Outline:  User Selects a product with any variants and addTo Cart
    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<product>"
    And I choose to navigate to PDP
    When User selects home delivery option
  	Then User sees quantity stepper
 # 	And User Selects the Variants of the products
    When User sets qty to "<quantity>"
    Then Quantity is changed to "<quantity>"
    When User taps on increment quantity stepper
    Then Quantity is changed to "<quantity>"  
    And User taps on add to cart button
   # And User taps on view cart button
   Then I choose to verify Error Message "<Error_msg>"
   	
  Examples: 
     | product                   |    quantity                  |         Error_msg                                                             |
    # | current stock and more than 1 item in stock     |    2   |  Sorry, we only have <x> of this item available. We added those to the cart.  |
     #| only 1 item in stock  	 |    2                         |  Sorry, we only have 1 of this item available. We added it to the cart        |
     #| per_customer_per_day  	 |    2                         |  The selected item is limited to {{maxQty}} per 24hr period. We added those to the cart  |
    
   @TC-OMNI-21863
  Scenario Outline:  User Selects a product with any variants and addTo Cart
    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<product>"
    And I choose to navigate to PDP
    When User selects home delivery option
  	Then User sees quantity stepper
 # 	And User Selects the Variants of the products
   Then I choose to verify Error Message "<Limit_Msg>"
  Examples: 
     | product                            |    quantity                  |         Limit_Msg                                                             |	
    # | Limit_Per_Customer_Per_Day         |    1                         |  Limit <x> per customer per day  |
    
    
   @TC_OMNI_21863_3
   Scenario Outline:  User Selects a product with any variants and addTo Cart
    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<product>"
    And I choose to navigate to PDP
    When User selects home delivery option
  	Then User sees quantity stepper
 # 	And User Selects the Variants of the products
    When User sets qty to "<quantity>"
    Then Quantity is changed to "<quantity>"
    When User taps on increment quantity stepper
    Then Quantity is changed to "<quantity>"  
    And User taps on add to cart button
   # And User taps on view cart button
   Then I choose to verify Error Message "<OOPS_Msg>"
   Then I choose to click on "Ok"
   And I choose to verify "<OOS_Msg>"
  Examples: 
     | product    |    quantity       |         OOPS_Msg                                                               |	OOS_Msg                 |
   #  | OOS        |                 1 |  Oops, something went wrong. An unexpected error occurred. Please try again.   |  product is out of stock    | 
    
