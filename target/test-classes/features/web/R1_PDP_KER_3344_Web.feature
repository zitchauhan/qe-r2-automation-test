Feature: To Verify Bundles - Multi SKU Packages 
	
@Regression @C-PDP @Web @All @KER-3344 @ZYP_PDP_K3344-5077 @CR-AKK 
Scenario: To verify Multi SKU Packages- Verify Next Step button & functionality 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	And verify nextstep and edit functionality   
	
