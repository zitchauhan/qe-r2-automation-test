Feature:  Add to Cart - Error Messages (PDP)

@C-PDP @Web @Regression @KER-4107 @ZYP_PDP_K4107-6695 @CR-RKA @RBeta 
Scenario: To verify Product Recommendations - ATC Modal on adding item to cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page 
	Then User should be able to see L3 Page 
	And User clicks on required product in L3 Page 
	Then user click on Add to cart button 
	Then Add to cart modal is displayed 
	Then User Verify product recommendation
