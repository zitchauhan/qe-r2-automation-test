Feature: Velidate the Product Search Results Listing

@Sprint2 @ST-OMNI-20256 @TC-OMNI-30460
Scenario: Verify user is able to see Product Search Results Listing
Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And User sees all products related to search keyword
    And User sees "ITEM count label" in Search results page
    And User sees the Hide Out Of Stock Section
    And User sees "Sort options" in Search results page 
 # User should be able to filter search results handled in OMNI-20323
 	
   
   