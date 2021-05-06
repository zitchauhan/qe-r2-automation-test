Feature: Cart Add to wish list 
     
  @Sprint5 @ST-OMNI-20600  @TC-OMNI-37124
	Scenario: Validate that guest user see move to wishlist button on page
		Given User launches the application
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		And User continues as "guest user" on onboarding page
		Then User sees the homepage
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    When User taps on add to cart button
    And User taps on View Cart button
    And User is on "Cart" screen
     Then User scrolls down to the bottom
     Then user click on "Add to Wish list"  button on cart page
     Then user see "Wish list" page
 
	
	
	@Sprint5 @ST-OMNI-20600 @TC-OMNI-37125
	Scenario: Validate that guest user see move to wishlist button on page and move item to wist by login 
	Given User launches the application
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		And User continues as "guest user" on onboarding page
		Then User sees the homepage
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    When User taps on add to cart button
    And User taps on View Cart button
    And User is on "Cart" screen
     Then User scrolls down to the bottom
     Then user click on "Add to Wish list"  button on cart page
     Then user see "Wish list" page
     Then user click on "login" on wish list page
     When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then user see "Wish list" page
		Then User taps on "Add Wishlist" icon
	Then User sees "Add Wish list" screen 
	And User enters wishlist name
	And User sees "Add Wishlist" button enabled
	Then User taps on "Add Wishlist" button 
	And User is on "Cart" screen
	
	
	@Sprint5 @ST-OMNI-20600 @TC-OMNI-37126
	Scenario: Validate that a logged in user is able to add item in existing wish list from cart page
	Given User launches the application
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		And User continues as "guest user" on onboarding page
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		When User taps on shop in bottom nav
		 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    When User taps on add to cart button
    And User taps on View Cart button
    And User is on "Cart" screen
     Then User scrolls down to the bottom
     Then user click on "Add to Wish list"  button on cart page
     Then user click on "existingwishlist" on wish list page
     And User sees "item moved to wishlist sucess message" on cart page 
	
	