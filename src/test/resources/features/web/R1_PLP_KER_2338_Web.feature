Feature: [Web] Product Recommendations

@C-PLP @Web @Regression @KER-2338 @ZYP_PLP_K2338-3949 @CR-RKA @RBeta 
Scenario: Desktop PLP L3- Validating Product Recommendation functionality 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page 
	Then User Verify product recommendation
	
@C-PLP @Web @Regression @KER-2338 @ZYP_PLP_K2338-6152 @CR-RKA @RBeta
Scenario: Desktop L2- Validating Product Recommendation functionality 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L2 from home page 
	Then User Verify product recommendation
	
@C-PLP @Web @Regression @KER-2338 @ZYP_PLP_K2338-6153 @CR-SG @RBeta 
Scenario: Desktop  L1- Validating Product Recommendation functionality 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to see L1 Page
	Then User Verify product recommendation