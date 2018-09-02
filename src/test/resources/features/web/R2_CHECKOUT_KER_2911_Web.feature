Feature: Verify Accurate Shipping Prices at Checkout

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2911 @ZYP_CHECKOUT_K2926-8229 @CR-DPK
Scenario: Verify if the shipping price on Checkout screen is same as Order Summary on Cart page
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
		When user views Estimated Shipping in the Item Subtotal
		And user will click on Checkout button and navigates to Checkout page
		Then User should verify the Shipping Price on Checkout order Summary page
		And User should have same Shipping price on Cart Page Order Summary
		
		
	
		
        

		