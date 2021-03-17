Feature: Validate User is able view product list by category

  @ST-OMNI-24745 @Sprint2
  Scenario: validate user is able to navigate to different categories
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	#And User sees the categories list is not empty
  	Then User navigates to "clothing" category in the list
  	Then User fetch the sub category name list
  	And User taps on shop all link
  	Then User sees "clothing" PLP page
  	Then User sees Shop By Category title on PLP
  	Then User verifies the Shop page categories are "displaying" on PLP page