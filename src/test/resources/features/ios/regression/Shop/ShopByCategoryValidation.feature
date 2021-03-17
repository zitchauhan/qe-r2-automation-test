Feature: Validate User is able to navigate to all categories

@Regression
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
  	Then User navigates to "Boys' Clothing" category in the list
  	Then User verifies the level three category list
