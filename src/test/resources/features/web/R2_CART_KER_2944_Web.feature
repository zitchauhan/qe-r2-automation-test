Feature: B03-300- Out of Stock

@R2_Web @R2_Regression @R2_All @P-Highest @1HR_R2 @C-Cart @KER-2942 @ZYP_CART_K2942-8044 @CR-AKK 
Scenario: verify if User is prompted to remove the OOS item from cart to proceed to checkout (BOPIS)
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User Navigates L2 form Homepage Header 
	And User clicks on product in PLP  
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes) 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And modified quantity should get updated 
	Then Order Summary should get recalculated 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page"Order Summary"|
		|SubTotal_txt|
	And user should be able to see the increased quantity and Price in Cart Order summary 
