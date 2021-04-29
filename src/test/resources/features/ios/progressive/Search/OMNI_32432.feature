Feature: Validate the Search Suggestions
 @TC-OMNI-35333 @ST-32432
Scenario: Validate the recent searches on Search Landing Page
   Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And User navigate Back to Search Page
   And user clicks on cancel button
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
   And User navigate Back to Search Page
     And user clicks on cancel button
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And User navigate Back to Search Page
    And user clicks on cancel button
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
   And User navigate Back to Search Page
     And user clicks on cancel button
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And User navigate Back to Search Page
    And user clicks on cancel button
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User Sees the "Recent Searches" title
    And User sees the Recent Searches "title1" , "title2" , "title3" , "title4" , "title5"
    Then User count the total Recent Searches is 5
    And User validate the number of visible Recent Searches is 3 and total no of characters are 15 
    Then User scroll to last Recent search and click on it
   And User navigate Back to Search Page
     And User CLick on clear all
    And User sees all Recent Searches got clear
    
    
     @TC-OMNI-35334 @ST-32432
    Scenario: Validate the Popular searches on Search Landing Page
   Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User Sees the "Popular Searches" title
    And User sees the Popular Searches "title1" , "title2" , "title3" , "title4" , "title5"
    Then User count the total Popular Searches is 5
    And User validate the number of visible Popular Searches is 3 and total no of characters are 15 
    Then User scroll to last Popular search and click on it
   And User navigate Back to Search Page
     And User CLick on clear all
    And User sees all Popular Searches got clear
    
  
    
    
    
    
    
    
    
    
    
    
    