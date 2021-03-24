Feature: Validate the Shop New Compnent
@Sprint2 @TC-OMNI-31528 @ST-20800
Scenario: validate the shop new component
Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    Then User Sees the Shop New section
    And user click on shop new Section
    Then user sees shop new page
    Then user navigate back to Homepage
    