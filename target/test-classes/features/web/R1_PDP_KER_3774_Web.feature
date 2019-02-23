Feature: To Verify the Add To Cart Functionality 


@Regression @Web @All @C-PDP @1HR @KER-3774 @ZYP_PDP_K3774-4839  
Scenario: Verify the attributes on the PDP - Multiple SKU (Package) - Desktop
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy attribute in Multiple SKU PDP 
	

@Regression @Web @All @C-PDP @1HR @KER-3774 @ZYP_PDP_K3774-4840  
Scenario: To verify add to cart functionality on PDP - Multiple SKU (Package) - Desktop
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
	Then Add to cart modal is displayed
	
	
	
	
                 
