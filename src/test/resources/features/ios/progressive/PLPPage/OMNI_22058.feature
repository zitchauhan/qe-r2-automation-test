Feature: Validate the OOS Functionality

Scenario: Validate the OOS for Search Listing Page
Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And User sees the Hide Out Of Stock Section
    Then User sees the OOS toggle is deactivated
    When User Enabled the OOS toggle
    Then User Sees the Product which are in stock
    
    
    
    
    
    
    

