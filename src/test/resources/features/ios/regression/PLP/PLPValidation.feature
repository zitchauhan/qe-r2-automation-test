Feature: PLP regression scenario

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
    
   @Sprint2 @ST-OMNI-23433 @TC-OMNI-30788
Scenario: Varify ratings and review
Given User launches the application
And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "RatingsAndReviewProduct"
    And user sees the ratings and review count