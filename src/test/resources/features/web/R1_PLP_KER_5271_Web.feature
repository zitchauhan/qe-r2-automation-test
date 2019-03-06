# Blocking this feaure in UAT7 Regression suite since this is a existing PROD defect
@ignoreUAT7
Feature: To Verify SearchDex: Brand Pages 

 @Regression @Web @All @C-PLP @KER-5271 @ZYP_PLP_K5271-6390 @CR-AKK @RBeta
Scenario: To verify SearchDex Links on - L1 Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne page 
	Then scroll down and verfiy Featured Categories 
	Then click on SearchDex link 
	
 @Regression @Web @All @C-PLP @KER-5271 @ZYP_PLP_K5271-6391 @CR-AKK @RBeta
Scenario: To verify SearchDex Links on - L2 Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L2 from home page 
	Then scroll down and verfiy Featured Categories 
	Then click on SearchDex link 
	
 @Regression @Web @All @C-PLP @KER-5271 @ZYP_PLP_K5271-6392 @CR-AKK @RBeta
Scenario: To verify SearchDex Links on - L3 Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page 
	Then scroll down and verfiy Featured Categories 
	Then click on SearchDex link
