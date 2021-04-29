Feature: Velidate the Product Search Results Listing

@Sprint5 @ST-OMNI-20322  
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
    
  @Sprint5 @ST-OMNI-20322  
 Scenario: Verify user can navigate to PDP page when user tap on any prodcut 
Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And User sees all products related to search keyword
    When I choose to navigate to PDP
   Then User sees product image
   
   @Sprint5 @ST-OMNI-20322  
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
    Then User swipe down on the screen
    

 	@Sprint5 @ST-OMNI-20322 
   Scenario: Verify user see null search result page for invalid search
Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "wrongSearchKeyword"
    Then User sees null search result  as "No products found"
   
   