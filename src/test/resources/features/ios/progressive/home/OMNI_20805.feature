Feature: Validate the Academy Exclusive
@Sprint2 @TC-OMNI-31527 @ST-20805
Scenario: Verify the Academy Exclusive
Given User launches the application
And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    And user sees the academy Exclusive component
    Then user click on the academy Exclusive Banner
    And user sees the Academy Exclusive Page
    Then user navigate back to Homepage