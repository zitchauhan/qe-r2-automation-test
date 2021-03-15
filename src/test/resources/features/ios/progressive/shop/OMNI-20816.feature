Feature: Validate User is able to shop by category

  @TC-OMNI-20816 @Sprint1
  Scenario: validate user is able to navigate to different categories
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	And User verifies the level One category list
  	Then User navigates to link 1 in the list
  	Then User verifies the level two category list
  	Then User navigates to "Boys' Clothing" category in the list
  	Then User verifies the level three category list
  	 	
  @TC-OMNI-20816 @Sprint1 
  Scenario: validate when user clicks on shop icon, he lands on the page where he was
   Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	Then User navigates to "clothing" category in the list
  	Then User navigates to "Boy's Clothing" category in the list
  	And User taps on home in bottom nav
  	Then verify user is on "Boy's Clothing" page	
  	And User taps on home in bottom nav
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	
