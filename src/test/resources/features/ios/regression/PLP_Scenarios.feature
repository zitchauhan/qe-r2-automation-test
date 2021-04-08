Feature: Validate functionality of PLP and category navigation Scenarios

 @Sprint01 @TC-OMNI-24950_1
  Scenario: naviation to PLP
  	Given User launches the application
  	And User Logs into the application
  	When User taps on go to shop button 	
  	And I choose to navigate "L1Category" on page
  
  	
  	@Sprint01 @TC-OMNI-24950_2
  Scenario: naviation to PLP
  	Given User launches the application
  	And User Logs into the application
  	When User taps on go to shop button 	
  	And I choose to navigate "L1Category" on page
  	And I choose to navigate "L2Category" on page

  	
  	
  	@Sprint01 @TC-OMNI-24950_3
  Scenario: naviation to PLP
  	Given User launches the application
  	And User Logs into the application
  	When User taps on go to shop button 	
  	And I choose to navigate "L1Category" on page
  	And I choose to navigate "L2Category" on page
  	And I choose to navigate "L3Category" on page

  	
  	@Sprint01 @TC-OMNI-24950_4
    Scenario: validate ShopBycategory componet
  	Given User launches the application
  	And User Logs into the application
    When User taps on go to shop button
  	When I choose to navigate "L3Category" on page
  
  	And  I choose to navigate at "ShopBycategory" landing page 
  	Then I choose to verify "ShopBycategory" landing page

@Sprint01 @TC-OMNI-24950_5
    Scenario: validate ShopBycategory componet
  	Given User launches the application
  	And User Logs into the application
    When User taps on go to shop button
  	When I choose to navigate "L3Category" on page
  
  	And  I choose to navigate at "ShopBycategory" landing page 
  	Then I choose to verify "ShopBycategory" landing page
#	Then I choose to verify "other" landing page components
# 	 | Fields                            | 
# 	 | Pick Up in Store Banner           | 
#    | Free Shipping with Sign-in Banner | 
#    | Hero Banner          			 | 
#    | Shop by Category Component 		 | 
#    |Sort By Option					 | 
#    |Filter Option 					 | 
#    |Product Grid  				     | 
#    |Promo-ad Card						 | 
    