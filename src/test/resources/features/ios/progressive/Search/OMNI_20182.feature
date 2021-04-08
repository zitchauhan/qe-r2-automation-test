Feature: verify Search box Active/Inactive
@Sprint2 @ST-OMNI-20182 @TC-OMNI-30558
Scenario: validate the Search box at home page 
Given User launches the application
And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    And User Sees the Search Box
    Then User clicks on the Search Box
    And user clicks on cancel button
    Then User sees the homepage
 @Sprint2 @ST-OMNI-20182 @TC-OMNI-30558   
 Scenario: validate the search box at shop page
 Given User launches the application
 And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User taps on shop in bottom nav
    Then User sees the shop page
    And User Sees the Search Box
    Then User clicks on the Search Box
    And user clicks on cancel button
    Then User sees the shop page
 @Sprint2 @ST-OMNI-20182 @TC-OMNI-30558  
 Scenario: validate the search box at sub categories
 Given User launches the application
 And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User taps on shop in bottom nav
    Then User sees the shop page
    And User click on Shop sub categories
    And User Sees the Search Box
    Then User clicks on the Search Box
    And user clicks on cancel button
    And User Sees the Search Box
  @Sprint2 @ST-OMNI-20182 @TC-OMNI-30558
Scenario: validate the search box at PLP Page

     Given User launches the application
     And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User taps on shop in bottom nav
    Then User sees the shop page
    And User click on Shop sub categories
    And User click on Shop All
    And User Sees the Search Box
    Then User clicks on the Search Box
    And user clicks on cancel button
    And User Sees the Search Box
 
    