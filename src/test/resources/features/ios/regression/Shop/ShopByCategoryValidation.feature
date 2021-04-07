Feature: Validate User is able to navigate to all categories

@Regression 
  Scenario: validate when user navigates to any given L1 and L2 category then user lands on correct sub category page and when user navigates to any l3 category then user lands on correct PLP L2 page.
  verify L1 categories are

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
  	And User taps on home in bottom nav
  	Then User taps on shop in bottom nav
  	Then verify user is on "Men's Clothing" page	
  	When User taps on shop in bottom nav
  	Then verify user is on "Shop By Category" page
  	Then User verifies all categories and navigates to each PLP from Shop By Category	
  	
  	@Regression
  	Scenario: Validate user is navigating to each category level and verifies the following scenarios
  	1. get each category level list and verify the sub categories are displaying for L1 and L2 categories
  	2. Navigate to each PLP L1 page by shop all link and verify the corresponding sub categories are displaying
  	3. Navigate to each PLP L2 page by L3 categories/PLP L1 categories and verify there is no shop by category displayed
  	
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User taps on shop in bottom nav
  	Then User verifies all categories and navigates to each PLP from Shop By Category	
