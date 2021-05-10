Feature: Validate the Search Suggestions
    
     @TC-OMNI-35334 @ST-32432
    Scenario: Validate the Popular searches on Search Landing Page
   Given User launches the application
   And User continues as "guest user" on onboarding page
When User Clicks On MaY Be Later
When User Clicks On MaY Be Later
   Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User Sees the "Popular Searches" title
    And User sees the Popular Searches "shirt" , "shirts" , "nike" , "guns" , "shoes"
    Then User count the total Popular Searches is 5
    #And User sees the elipses when Character are more than 15 
  
   
    
  
    
    
    
    
    
    
    
    
    
    
    