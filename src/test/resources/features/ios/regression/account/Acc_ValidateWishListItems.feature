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
  Scenario: Verify User sees all the necessary elements of product tile in wishlist
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
		
	@Sprint5 @Regression
 	Scenario: Verify user successfully creates a wishlist 
	Given User launches the application 
	And User continues as guest user 
    And User is on Log In screen
	Then User sees email address field
    And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
    And User enters valid password "Password@123"
    And User taps on Login
	Then User sees the account page 
	When User taps on Wishlist
	Then User taps on "Add Wishlist" icon
	Then User sees "Add Wish list" screen 
	And User enters wishlist name
	And User sees "Add Wishlist" button enabled
	Then User taps on "Add Wishlist" button 
	And User sees "wishlist listing" screen
	When User taps on "< " back button 
	Then User sees "previous" screen	
	
	@Sprint5 @Regression
	Scenario: Verify user successfully Manage Wishlist - Rename, Edit, Remove 
	Given User launches the application 
	And User continues as guest user 
    And User is on Log In screen
	Then User sees email address field
    And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
    And User enters valid password "Password@123"
    And User taps on Login
	Then User sees the account page 
	When User taps on Wishlist
	Then User taps on "Add Wishlist" icon
	Then User sees "Add Wish list" screen 
	And User enters wishlist name
	And User sees "Add Wishlist" button enabled
	Then User taps on "Add Wishlist" button 
	And User sees "wishlist listing" screen
	When User taps on "edit" button
	Then User sees "edit wishlist" screen    
	And User renames wishlist                 
	When User taps on "update" button         
	Then User sees "updated name" 
	And User sees "previous" screen
	When User taps on "Delete Wishlist" button         
	Then User sees "Confirmation" pop up
	When User taps on "Delete" button
	Then User sees "edit wishlist" screen
	And User sees that wishlist is deleted
	When User taps on "Cancel" button
	Then User sees "edit wishlist" screen
	
	@Sprint5 @Regression
Scenario Outline: Verify user is restricted display of SOF on app Wishlist 
	# User should have logged in with the same credentials in web and 
	# must have a SOF/Firearm item added in to the "Wishlist"
	Given User launches the application 
	And User continues as guest user 
    And User is on Log In screen
	Then User sees email address field
    And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
    And User enters valid password "Password@123"
    And User taps on Login
	Then User sees the account page 
	When User taps on Wishlist
	And User sees "created wishlist" screen
	When User taps on "created" wishlist
    Then User sees "Information message" on wishlist page
    And User sees "Information message subtitle" on wishlist page
    And User sees information message title "<title>" on wishlist page
    And User sees information message subtitle "<subTitleMessage>" on wishlist page
    And User click on the "Visit Academy.com Cta" on wishlist page
    Then I choose to verify user navigated to Web

    Examples:
    | title                                    | subTitleMessage   |
    | Item(s) were removed from your Wish list | firearms cannot be purchased in app |
	
	