Feature: Verify Details of PDP for product badging

  @Sprint1 @TC-OMNI-24863
  Scenario Outline:  User Selects a product without any variants
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User navigated to  pdp with "<product>"
   	Then verify the "<badge>" of product
  Examples: 
     | product       |    badge        |	
    #| Hot Deal  	|    Hot Deal     | 
       | Clearance 	|   Clearance     | 
   # | Price Drop 	|   Price Drop    |
  #  |  New         |    New         |
  #  |Ships to Store	|   Ships to Store|
  #  |Exclusive		|   Exclusive     |
     #  |Online Only    |   Online Only  |
 #   |Customize		|   Customize     |
    
    
    
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
    |   Exclusive      |
  #   |   Online Only  |
  #  |   Customize     |
 