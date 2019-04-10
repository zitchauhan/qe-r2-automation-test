Feature: Add to Cart - Error Messages (PDP) 

@C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-5040 @CR-AG 
Scenario: [UI-Desktop]- Verify Ship It -message to inform the user that the item is OOS(Out of Stock) 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "OutOfStockProduct" in the search box 
	#Then User select out of stock PDP 
	#Above step not reqired as 2nd step is validating out of stock item 
	
	
	
@C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-5038 @CR-AG 
Scenario: [UI-Desktop]- Verify Ship It -messaging to confirm the limited quantity was added 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "limitedQuantityRestriction_CMC" in the search box plcc 
	And user click on search icon 
	Then User to select the product 
	Then verify Sorry the selected item is limited to XYZ order. 
	
	
@C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-5039 @CR-AG @RBeta 
Scenario: [UI-Desktop]- Verify Add to Cart -messaging to confirm the quantity was added 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user search the data in search box "limitedAvailable_Inventory" 
	Then User to selects the product from PLP and add product in cart with access quantity 
	Then verify user gets a msg Sorry we only have XYZ of this item available We added those to the cart 
	
	
	
@C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-3443 @CR-RKA @trail
Scenario: Verify Add to Cart -messaging confirming the restriction 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page 
	Then User should be able to see L3 Page 
	And User clicks on required product in L3 Page 
	Then user put the quantity on PDP 
	
	
