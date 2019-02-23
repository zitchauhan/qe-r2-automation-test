Feature: B03-500- Cart with SOF items

@C-BOPIS @R2_Web @R2_All @C-Cart @KER-7034 @ZYP_CART_K7034-9173
Scenario: Verify for SOF items System should check the store eligibility for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store1" 
	When user enters "BOPIS_SOF_Product" in the searchbox 
	And user click on Add to Cart Button 
	And then user close the add to cart popup 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	And user should be able to see the item available message for BOPIS poroduct in store modal
	