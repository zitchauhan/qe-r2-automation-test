Feature: Wishlist Product listing

  @Sprint5 @Regression
  Scenario: Verify User is shown empty wishlist screen if there are no items in the wishlist
    Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "wishlistaccount@yopmail.com"
 		And User enters valid password "Testing@123"
 		And User taps on Login
 		When User taps on account in bottom nav
    Then User sees the account page
		When User taps on Wishlist
		Then User taps on wishlist "Empty"
		Then User is taken to "Empty" wishlist
		Then User sees "Empty Label" of the wishlist item
  
  @Sprint5 @Regression
  Scenario: Verify User is navigated to the corresponding wishlist
    Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "wishlistaccount@yopmail.com"
 		And User enters valid password "Testing@123"
 		And User taps on Login
 		When User taps on account in bottom nav
    Then User sees the account page
		When User taps on Wishlist
		Then User taps on wishlist "Shirts"
		Then User is taken to "Shirts" wishlist

  @Sprint5 @Regression
  Scenario Outline: Verify User sees all the necessary elements of product tile in wishlist
  	Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "wishlistaccount@yopmail.com"
 		And User enters valid password "Testing@123"
 		And User taps on Login
 		When User taps on account in bottom nav
    Then User sees the account page
		When User taps on Wishlist
		Then User taps on wishlist "Shirts"
		Then User is taken to shirt wishlist
		Then User sees item count in wishlist items screen
		Then User sees "Product Title" of the wishlist item
		Then User sees "Product Image" of the wishlist item
		Then User sees "Product Price" of the wishlist item
		Then User sees "Remove Button" of the wishlist item
		Then User sees "Move To Cart" of the wishlist item
	
	@Sprint5 @Regression
	Scenario: Verify User is Shown the confirmation popup when it removes the item from wishlit
    Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "wishlistaccount@yopmail.com"
 		And User enters valid password "Testing@123"
 		And User taps on Login
 		When User taps on account in bottom nav
    Then User sees the account page
		When User taps on Wishlist
		Then User taps on wishlist "Shirts"
		Then User is taken to "Shirts" wishlist
		When User taps on Remove button
		Then User is shown the confirmation popup