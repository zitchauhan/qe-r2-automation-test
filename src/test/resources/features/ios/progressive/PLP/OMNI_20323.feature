Feature: Verify the filters on SRP/PLP/CLP and Brand Category page
  
   
   @Sprint3 @OMNI-20323 @TC-OMNI-20323-01
    Scenario: validate Filter screen is dislay when user tap on fiter button on SRP
    Given User launches the application
    And User Clicks On MaY Be Later
    And User Goes to home page
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    Then User see filter Button
    When User tap on filter Button
    Then User sees filter screen
    
    

 @Sprint3 @OMNI-20323 @TC-OMNI-20323-02
    Scenario: validate Filter screen is dislay when user tap on fiter button on PLP
   Given User launches the application
    And User Clicks On MaY Be Later
   And User Goes to home page
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
    Then User see filter Button
    When User tap on filter Button
   Then User sees filter screen
    
    
  @Sprint3 @OMNI-20323 @TC-OMNI-20323-03
    Scenario: validate Filter screen is dislay when user tap on fiter button on CLP
   Given User launches the application
   And User Clicks On MaY Be Later
    And User Goes to home page
    Then User sees the homepage
    When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	And User fetch the "L1 category" list
  	Then User navigates to "clothing" category in the list
  	And User taps on shop all link
  	Then User sees "clothing" PLP page 
    Then User see filter Button
    When User tap on filter Button
    Then User sees filter screen
    
     @Sprint3 @OMNI-20323 @TC-OMNI-20323-04 
    Scenario: validate Filter types are displayed when user tap on fiter button on SRP
    Given User launches the application
    And User Clicks On MaY Be Later
    And User Goes to home page
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    Then User see filter Button
    When User tap on filter Button
    Then User sees filter screen
    Then User sees "Pick up & Delivery option" as filter type
    Then User sees "Category" as filter type
    Then User sees "Brand" as filter type
    Then User sees "Size" as filter type
    Then User sees "Style" as filter type
    Then User sees "Color" as filter type
    Then User sees "Price" as filter type
    Then User sees "Rating" as filter type
    Then User sees "Deal" as filter type
    Then User see the Apply Button as disabled
    
    @Sprint3 @OMNI-20323 @TC-OMNI-20323-05 
    Scenario: validate Filter types are displayed when user tap on fiter button on PLP
    Given User launches the application
    And User Clicks On MaY Be Later
   And User Goes to home page
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
    Then User see filter Button
    When User tap on filter Button
   Then User sees filter screen
    Then User sees "Pick up & Delivery option" as filter type
    Then User sees "Category" as filter type
    Then User sees "Brand" as filter type
    Then User sees "Size" as filter type
    Then User sees "Style" as filter type
    Then User sees "Color" as filter type
    Then User sees "Price" as filter type
    Then User sees "Rating" as filter type
    Then User sees "Deal" as filter type
    Then User see the Apply Button as disabled
    
     @Sprint3 @OMNI-20323 @TC-OMNI-20323-06 
    Scenario: validate Filter types are displayed when user tap on fiter button on CLP
     Given User launches the application
   And User Clicks On MaY Be Later
    And User Goes to home page
    Then User sees the homepage
    When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	And User fetch the "L1 category" list
  	Then User navigates to "clothing" category in the list
  	And User taps on shop all link
  	Then User sees "clothing" PLP page 
    Then User see filter Button
    When User tap on filter Button
    Then User sees filter screen
    Then User sees "Pick up & Delivery option" as filter type
    Then User sees "Category" as filter type
    Then User sees "Brand" as filter type
    Then User sees "Size" as filter type
    Then User sees "Style" as filter type
    Then User sees "Color" as filter type
    Then User sees "Price" as filter type
    Then User sees "Rating" as filter type
    Then User sees "Deal" as filter type
    Then User see the Apply Button as disabled
    
     @Sprint3 @OMNI-20323 @TC-OMNI-20323-07 
    Scenario: validate Cancel link on filter screen
    Given User launches the application
    And User Clicks On MaY Be Later
    And User Goes to home page
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    Then User see filter Button
    When User tap on filter Button
    Then User sees filter screen
    When User tap on Cancel link 
    Then User see filter Button 
    
    
    
 
