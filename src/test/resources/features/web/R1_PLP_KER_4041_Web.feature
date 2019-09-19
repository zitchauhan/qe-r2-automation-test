Feature: [Web] Page Auto Scroll 

@Regression @Web @KER-4041 @ZYP_PLP_K4041-6279 @C-PLP @1HR 
Scenario: Verify the Page Auto Scroll functionality in L2 page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User to navigate to bottom 
	Then verify Auto scroll 
	Then user click on Auto scroll button 
	
@Regression @Web @KER-4041 @ZYP_PLP_K4041-4873 @C-PLP @1HR 
Scenario: Verify the Page Auto Scroll functionality in Home page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User to navigate to bottom 
	Then verify Auto scroll 
	Then user click on Auto scroll button 
	
@Regression @Web @KER-4041 @ZYP_PLP_K4041-6278 @C-PLP 
Scenario: Verify the Page Auto Scroll functionality in L1 page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L2 from home page 
	Then User to navigate to bottom 
	Then verify Auto scroll 
	Then user click on Auto scroll button 
	
@Regression @Web @KER-4041 @ZYP_PLP_K4041-6284 @C-PLP @1HR 
Scenario: Verify the Page Auto Scroll functionality in L3 page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page 
	Then User to navigate to bottom 
	Then verify Auto scroll 
	Then user click on Auto scroll button 
	
@Regression @Web @KER-4041 @ZYP_PLP_K4041-6285 @C-PLP 
Scenario: Verify the Page Auto Scroll functionality in PDP page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne page 
	And User clicks on any of the subcategory in L1 Page 
	Then User should be navigated to L2 Page 
	When User clicks on required category in L2 Page 
	Then User should be navigated to L3 Page 
	And User clicks on required product in L3 Page 
	Then User should be navigated to PDP Page 
	Then User to navigate to bottom 
	Then verify Auto scroll 
	Then user click on Auto scroll button 
	
    