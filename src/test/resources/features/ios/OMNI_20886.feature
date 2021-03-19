Feature: Verify Details of PLP for product badging
  
  	@Sprint01 @TC-OMNI-20886_1
    Scenario Outline:: validate PLP badges
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
    When User taps on go to shop button
  	When I choose to navigate "L3Category" on page
    And  I choose to navigate at "ShopBycategory" landing page 
   # Then I choose to verify "PLP" landing page   
  Then verify the "<badge>" of product in PLP page
 Examples: 
     |    badge        |	
#    |    Hot Deal     | 
#    |   Clearance     | 
#    |   Price Drop    |
 #   |    New          |
 #   |   Exclusive     |
    |   Online Only    |
  #  |   Customize     |
 