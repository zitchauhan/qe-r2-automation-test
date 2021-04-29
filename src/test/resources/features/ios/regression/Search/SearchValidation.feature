Feature: Search Validation

@Sprint5 @Regression
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
    
    @Sprint5 @Regression
   Scenario: Verify user is swipe down on the screen
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