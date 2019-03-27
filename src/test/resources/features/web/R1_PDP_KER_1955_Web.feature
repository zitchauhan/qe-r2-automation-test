Feature: To Verify the Add To Cart Functionality 


@Regression @Web @All @C-PDP @1HR @KER-1955 @ZYP_PDP_K1955-3485 @Rerun 
Scenario: Verify the Add To Cart functionality 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 
	And User selects Required product in Product Listing Page 
	Then User should be select the Quantity 
#	And User clicks on AddToCart Button 
#	Then Add to cart modal is displayed 
#	When User clicks on View_Cart Button 
#	Then User should be navigated to Cart Page 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	Then User should be able to see added product in cart 
	
	
	
                 
