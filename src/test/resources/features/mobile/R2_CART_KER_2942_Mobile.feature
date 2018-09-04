Feature: [Mobile] Verify Quantity Adjustment in Cart 

@R2_Mobile @R2_Regression @R2_All @P-Highest @C-Cart @KER-2942 @ZYP_K2942-8044_M @CR-AKK
Scenario: Verify add quantity adjustment in the Cart Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user view the items in order summary details (Subtotal, Estimated Shipping/In-Store Pickup, Estimated Taxes) 
	When enter the "Quantity" to X 
	And modified quantity should get updated 
	And Order Summary should get recalculated 
	Then user should be able to see the increased quantity and Price in Cart Order summary 