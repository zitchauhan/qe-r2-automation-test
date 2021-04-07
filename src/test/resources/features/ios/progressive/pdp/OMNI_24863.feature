Feature: Verify Details of PDP for product badging

  	@Sprint01 @TC-OMNI-24863_1
    Scenario Outline:: validate PDP badges
  	Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<badge>"
#   Then User sees all products related to search Keyword  
    And I choose to navigate to PDP 
    Then verify the "<badge>" of product
 Examples: 
     |    badge        |	
#    |    Hot Deal     | 
#    |   Clearance     | 
#    |   Price Drop    |
 #   |    New          |
     |   Exclusive     |
  #  |   Online Only   |
  #  |   Customize     |
 