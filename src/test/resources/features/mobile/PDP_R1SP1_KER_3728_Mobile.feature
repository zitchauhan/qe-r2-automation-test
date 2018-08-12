Feature: To Verify Page Templates: PDP - No Diff Selection 

@Regression @C-PDP @Mobile @All @KER-3728 @ZYP_PDP_K3728-4887 @CR-AKK @1HR
Scenario: Verify the attributes on the PDP - No Different Selection- Mobile
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then User navigates till PDP of multiple sku package 
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	
@Regression @C-PDP @Mobile @All @KER-3728 @ZYP_PDP_K3728-4891 @CR-AKK
Scenario: To verify add to cart functionality on PDP - No Different Selection- Mobile 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then User navigates till PDP of multiple sku package 
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality  