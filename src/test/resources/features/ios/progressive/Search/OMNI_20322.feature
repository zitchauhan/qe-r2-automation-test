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
 	
    
  @Sprint2 @ST-OMNI-20256 @TC-OMNI-30460 
 Scenario: Validate App Showing Error message if no Exact matches found
   Given User launches the application
   And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "wrongSearchKeyword" 
    And User observe message "try again"

@Sprint5 @ST-OMNI-20264 @TC-OMNI-
Scenario: Validate the user able to redirect to a PLP
Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
	Then I chose to verify "Yeti" in PLP Page
#    Then User verifies breadcrumb is present for the product
    And User Sees the Search Box
    Then User clicks on the Search Box
    And User can "edit" the search
    And User sees all products related to search keyword
     
   