Feature: Verify Item/Order Level Promotion Calculation

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3166 @ZYP_CHECKOUT_K3166-8086 @CR-AKK
Scenario: To verify Add Promotion Code
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user clicks on Add Promo code link under Cart Order Summary
	Then Promo code field is exposed
	
	
