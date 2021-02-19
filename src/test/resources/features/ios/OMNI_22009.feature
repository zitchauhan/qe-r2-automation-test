Feature: Verify user is able to change the delivery options for the items in the cart

  @Sprint1 @TC_OMNI_22009
  Scenario: Verify user is able to see pre selected delivery option on the cart page
  	Given User adds "1" qty of "BOPIS" item to the cart
  	Then User goes to the cart page
  	Then User sees pre-selected delivery option for "BOPIS" item on the cart page
  	And User sees delivery message for "BOPIS" item on the cart
  	And User sees arrow button for more delivery options
  	
  @Sprint1 @TC_OMNI_22009
  Scenario: Verify when user taps on chevron button then available delivery options are visible
 	Given User adds "1" qty of "BOPIS" item to the cart
  	Then User goes to the cart page
  	Then User sees pre-selected delivery option for "BOPIS" item on the cart page
  	Then User clicks on chevron button
  	Then User sees both fulfillment options
  	And User is able to click on "BOPIS" fulfillment option
  	And User is able to click on "STH" fulfillment option