Feature: Validate the Ratings and review
@Sprint2 @ST-OMNI-23433 @TC-OMNI-30788
Scenario: Varify ratings and review
Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "RatingsAndReviewProduct"
    And user sees the ratings and review count