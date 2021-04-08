Feature: Verify Details of PLP for product badging

 
  @Regression 	@Sprint01 @TC-OMNI-20886_2
    Scenario Outline:: validate PLP badges
  	Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<badge>"
#   Then User sees all products related to search Keyword
  Then verify the "<badge>" of product in PLP page
Examples: 
     |    badge          |	
 #    |   Ships_to_Store |
#    |    HotDeal        | 
#    |   clearence_Prod  | 
#    |   Price_Drop      |
 #   |    New            |
 #   |   Exclusive       |
    |   Online_Only     |
  #  |   Customize      |