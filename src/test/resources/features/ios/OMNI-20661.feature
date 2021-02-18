Feature: Verify user is able to quickly access cart in any point using bottom navigation

  @Sprint1 @TC_OMNI-20661
  Scenario: Verify when cart is empty then no badge counter should be visible on the cart icon
  	Given User goes to a cart page and deletes all the items
  	Then User sees no counter badge on the cart icon on bottom navigation
  	
  @Sprint1 @TC_OMNI-20661
  Scenario: Verify when cart is empty then no badge counter should be visible on the cart icon	
  	Given User adds "1" qty of "STH" item to the cart  	
  	Then User goes to the cart page
  	Then User sees the item count on the cart badge counter on cart icon on bottom navigation
