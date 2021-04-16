Feature: PLP regression scenario

  @ST-OMNI-20256 @TC-OMNI-30460 @Regression
Scenario: Validate  the user able to click on search Box At Home page
Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And User sees all products related to search keyword
    And user clicks on cancel button
    Then User clicks on the Search Box
    And User search for the "wrongSearchKeyword" 
    And User observe message "No Product found"
    
 @ST-OMNI-23433 @TC-OMNI-30788 @Regression
Scenario: Varify ratings and review
Given User launches the application
And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "RatingsAndReviewProduct"
    And user sees the ratings and review count
    
    @ST-OMNI-24745 @Regression
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