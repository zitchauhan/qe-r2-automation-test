Feature: Validate functionality of Search result page 


@ST-OMNI-20322 @Regression
 Scenario: Verify user is able to see Product Search Results Listing
Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And User sees all products related to search keyword
    And User sees search result count in Search result page
    And User sees the Hide Out Of Stock Section
    And User sees sort option  in Search result page 
    And User sees fiter option in Search result page
    
    @ST-OMNI-20322 @Regression
     Scenario: Verify user see null search result page for invalid search
Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "wrongSearchKeyword"
    Then User sees null search result  as "No products found"    