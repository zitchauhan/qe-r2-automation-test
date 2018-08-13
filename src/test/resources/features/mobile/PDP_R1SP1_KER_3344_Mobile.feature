Feature: To Verify Bundles - Multi SKU Packages 

@Regression @C-PDP @Mobile @All @KER-3344 @ZYP_PDP_K3344-5073 @CR-AKK 
Scenario: Verify Bundle Product Title,Bundle SKU,Price,Bundle Product Image,Merchant controlled content at the Bundle level 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu 
	Then User navigates till PDP of multiple sku package 
	And User click on the product image of sku package 
	Then verify bundle product title and image  
	
@Regression @C-PDP @Mobile @All @KER-3344 @ZYP_PDP_K3344-5078 @CR-AKK 
Scenario: To verify Multi SKU Packages - Verify Next Step button & functionality  
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then User navigates till PDP of multiple sku package 
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verify nextstep and edit functionality     