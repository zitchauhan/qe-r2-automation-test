Feature: Validate User is able to shop by category

  @ST-OMNI-20816 @TC-OMNI-29797 @Sprint1 
  Scenario: validate user is able to navigate to different categories
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	And User verifies the level One category list
  	Then User navigates to "clothing" category in the list
  	Then User verifies the level two category list
  	Then User navigates to "Men's Clothing" category in the list
  	Then User verifies the level three category list
  	 	
  @ST-OMNI-20816 @TC-OMNI-29799 @Sprint1 
  Scenario: validate when user clicks on shop icon, he lands on the page where he was
   Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	Then User navigates to "Clothing" category in the list
  	Then verify user is on "Clothing" page
  	Then User navigates to "Men's Clothing" category in the list
  	Then verify user is on "Men's Clothing" page
  	And User taps on home in bottom nav
  	Then User taps on shop in bottom nav
  	Then verify user is on "Men's Clothing" page	
  	And User taps on home in bottom nav
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	
  	@ST-OMNI-20816 @TC-OMNI-29800 @Sprint1 
  	Scenario: validate user is able to navigate to PLP by tapping on shop all link
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	Then User navigates to "clothing" category in the list
  	And User taps on shop all link
  	Then User sees "clothing" PLP page
  	
