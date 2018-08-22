Feature: To Verify Bundles - Multi SKU Packages 
	
@Regression @C-PDP @Web @All @KER-3344 @ZYP_PDP_K3344-5077 @CR-AKK 
Scenario Outline: To verify Multi SKU Packages- Verify Next Step button & functionality 
	Given user launches the browser and navigates to "ASO_HOME" page 
	 When user enters "<SearchTerm>" in the search box
	Then verfiy the product details and features 
	And verify nextstep and edit functionality     
	Examples: 
      | SearchTerm |
      | 109224180 |