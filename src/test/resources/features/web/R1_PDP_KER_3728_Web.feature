Feature: To Verify Page Templates: PDP - No Diff Selection 

@Regression @C-PDP @Web @All @KER-3728 @ZYP_PDP_K3728-4889 @CR-AKK @RBeta @V1
Scenario: Verify the attributes on the PDP - No Different Selection
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "NodiffSelectionProd" in the searchbox
	Then verfiy the product attribute of no diff
	
	
@Regression @C-PDP @Web @All @KER-3728 @ZYP_PDP_K3728-4891 @CR-AKK  @RBeta
Scenario: To verify add to cart functionality on PDP - No Different Selection 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "NodiffSelectionProd" in the searchbox
	Then verfiy the product attribute of no diff 
	#Then user click on Add to cart button
	And user click on ship it button
	Then Add to cart modal is displayed  
