Feature: Create a wishlist 

@Sprint5 @TC-OMNI-35000 @ST-OMNI-33102 
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
	
	
	
