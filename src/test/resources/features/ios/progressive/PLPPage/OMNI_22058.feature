Feature: Validate the OOS Functionality

@Sprint3 @TC-OMNI-33177 @ST-22058
Scenario: Validate the OOS for Search Listing Page
Given User launches the application
And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
     And User sees the Hide Out Of Stock Section
    Then User sees the OOS toggle is deactivated
    Then User Sees the Products list which included OOS product
    When User Enabled the OOS toggle
     Then User sees the Product which are in stock
     
@Sprint3 @TC-OMNI-33177 @ST-22058
Scenario: Validate the OOS for CLP Page
Given User launches the application
And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	And User fetch the "L1 category" list
  	Then User navigates to "clothing" category in the list
  	And User taps on shop all link
  	Then User sees "clothing" PLP page
  	Then User sees Shop By Category title on PLP
  	And User sees the Hide Out Of Stock Section
    Then User sees the OOS toggle is deactivated
    Then User Sees the Products list which included OOS product
    When User Enabled the OOS toggle
    Then User sees the Product which are in stock
    
    @Sprint3 @TC-OMNI-33177 @ST-22058
  Scenario: Vlidate the OOS for PLP
    Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	And User fetch the "L1 category" list
  	Then User navigates to "clothing" category in the list
  	Then User navigates to "Men's clothing" category in the list
    And User fetch the "L3 category" list
  	And User taps on shop all link
  	Then User sees "Men's clothing" PLP page
  	Then User sees Shop By Category title on PLP
    Then User navigates to "Men's Shorts" category on PLP Page
    And User sees the Hide Out Of Stock Section
    Then User sees the OOS toggle is deactivated
    Then User Sees the Products list which included OOS product
    When User Enabled the OOS toggle
    Then User sees the Product which are in stock
    
  
    
    
    
    
    
   
   
    
    
    
    
    

