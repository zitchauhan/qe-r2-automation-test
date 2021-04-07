Feature: PDP - Delivery Options – Standard - (Static Content Only)

  @Sprint1 @TC_OMNI_22011
  Scenario Outline: User verifies delivery options in PDP
  	Given User launches the application
    And User continues as guest user
 #   Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<product>" 
    And I choose to navigate to PDP
    Then User verifies delivery options in PDP
     Examples: 
     |    product            |	
     |    SearchKeyword           | 
  
    
  @Sprint1 @TC_OMNI_22011
  Scenario Outline: User verifies default delivery option selected in PDP
  		Given User launches the application
    And User continues as guest user
 #   Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<product>" 
    And I choose to navigate to PDP
    Then User verifies delivery options in PDP
    Then User verifies default delivery option selected in PDP
     Examples: 
     |    product            |	
     |    SearchKeyword           | 
  
    