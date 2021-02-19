Feature: Verify user is able to quickly access cart in any point using bottom navigation

  @Sprint1 @ST-OMNI-20661
  Scenario: Verify when cart is empty then no badge counter should be visible on the cart icon
  	Given User goes to a cart page and deletes all the items
  	Then User sees no counter badge on the cart icon on bottom navigation
  	And User sees Cart Empty label	
  	
  @Sprint1 @ST-OMNI-20661
  Scenario: Verify when qty/items added to cart is less than 100 then display item count on the cart badge
  	Given User adds "1" qty of "STH" item to the cart  	
  	Then User goes to the cart page
  	Then User sees the correct item count on the cart badge counter on bottom navigation
  	
  @Sprint1 @ST-OMNI-20661
  Scenario: Verify when qty/items added to cart is more than 99 then display item 99+ on the cart badge
  	Given User adds "100" qty of "STH" item to the cart  	
  	Then User goes to the cart page
  	Then User sees the correct item count on the cart badge counter on bottom navigation
  	
  @Sprint1 @ST-OMNI-20661
  Scenario: Verify when user taps on cart icon from bottom nav should redirect to cart page
  	Given User is able to see cart icon on bottom navigation
  	Then User taps on the cart icon on bottom navigation
  	Then Guest User is on empty cart page
    And User sees Cart Empty label	
    
  @Sprint1 @ST-OMNI-20661
  Scenario: Verify when user changes qty of the item using action icons then item count is also changed on the cart badge counter
  	Given User adds "100" qty of "STH" item to the cart  	
  	Then User goes to the cart page
  	Then User sees the correct item count on the cart badge counter on bottom navigation
  	Then User tap on "+" action for quantity
  	Then User sees the correct item count on the cart badge counter on bottom navigation
  	Then User tap on "-" action for quantity
  	Then User sees the correct item count on the cart badge counter on bottom navigation
  
  @Sprint1 @ST-OMNI-20661A
  Scenario: Verify when user edits qty of the item count is also changed on the cart badge counter
  	Given User adds "100" qty of "STH" item to the cart  	
  	And User goes to the cart page
  	Then User sees the correct item count on the cart badge counter on bottom navigation
	Then User edits the quantity to "12" on cart page	
  	Then User sees the correct item count on the cart badge counter on bottom navigation
  	
  	
