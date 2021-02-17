Feature: Verify user is able to change the delivery options for the items in the cart

  @Sprint1 @TC_OMNI_22009
  Scenario: Verify user is able to see pre selected delivery option on the cart page
  	Given User has selected a delivery option and adds "BOPIS" item to the cart
  	Then User goes to the cart page
  	Then User sees pre-selected delivery option for "BOPIS" item on the cart page 
  	
  	
  	
    
   