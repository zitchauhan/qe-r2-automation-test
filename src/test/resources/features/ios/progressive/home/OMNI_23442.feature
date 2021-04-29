Feature: Validate the Offer details and t&C has displayed on home Page
 @TC-OMNI-35335 @ST-23442
Scenario: Validate the Offer details and t&C
   Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User sees the Offer Details and terms and conditions "title"
    And User click on Offer Details and terms and conditions