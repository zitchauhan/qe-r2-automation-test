Feature: Velidate the Search Functionality
@Sprint2 @ST-OMNI-20256 @TC-OMNI-30460
Scenario: Validate  the user able to click on search Box At Home page
Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And User sees all products related to search keyword
    
  @Sprint2 @ST-OMNI-20256 @TC-OMNI-30460 
 Scenario: Validate App Showing Error message if no Exact matches found
   Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "wrongSearchKeyword" 
    And User observe message "try again"
    And user works
