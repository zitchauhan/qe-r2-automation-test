Feature: Validate User is able view product list by category

  @ST-OMNI-24745 @TC-OMNI-30218 @Sprint2
  Scenario: validate followings when user taps on shop all link from L2 category
  1. shop by L2 categories are displaying on PLP L1 
  2. shop by L3 categories are displaying on PLP L2
  3. There is no further categories displayed on PLP L3
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	And User fetch the "L1 category" list
  	Then User navigates to "clothing" category in the list
  	And User fetch the "L2 category" list
  	Then User navigates to "Boys' clothing" category in the list
  	And User fetch the "L3 category" list
  	Then User taps on back button
  	And User taps on shop all link
  	Then User sees "clothing" PLP page
  	Then User sees Shop By Category title on PLP
  	Then User verifies "L2 categories" are displaying on PLP
  	Then User navigates to "Boys' clothing" category on PLP Page
  	Then User verifies "L3 categories" are displaying on PLP
  	Then User navigates to "Boys' shirts" category on PLP Page
  	Then User verifies "No categories" are displaying on PLP
  	
    @ST-OMNI-24745 @TC-OMNI-30199 @Sprint2 
   Scenario: validate followings when user taps on shop all link from L3 category
  1. shop by L3 categories are displaying on PLP L1
  2. There is no further categories displayed on PLP L2
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	And User fetch the "L1 category" list
  	Then User navigates to "clothing" category in the list
  	And User fetch the "L2 category" list
  	Then User navigates to "Boys' clothing" category in the list
  	And User fetch the "L3 category" list
  	And User taps on shop all link
  	Then User sees "Boys' Clothing" PLP page
  	Then User sees Shop By Category title on PLP
  	Then User verifies "L3 categories" are displaying on PLP
  	Then User navigates to "Boys' shirts" category on PLP Page
  	Then User verifies "No categories" are displaying on PLP
