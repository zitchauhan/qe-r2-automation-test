Feature: Home Page Grid Filter by Brandname

@testVenk @Web @Regression @KER-710 @ZYP_HP_K710-3656 @C-HP @CR-SG @AutomationSmoke @RegressionP2 @TC-OMNI-13418
Scenario: Filter products in grid by Brand Name
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SearchForSort" in the searchbox 
	Then navigate to sort by and navigate to best selling 
	And user select the brand "brandName" 	
	#Then user validates selected facets "brandName"

#@RegressionP2    
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user enters "SearchForSort" in the searchbox 
#    Then navigate to sort by and navigate to best selling
#    And user select the deal "dealName"
#    Then user validates selected facets "dealName"