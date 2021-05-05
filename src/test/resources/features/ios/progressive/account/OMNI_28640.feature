Feature: Manage Wishlist - Rename, Edit, Remove

@Sprint5 @TC-OMNI-35036 @ST-OMNI-28640
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

	
	
	
