Feature: Debug Testing 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-8639 @ZYP_CHECKOUT_K6575-8639 @CR-MS
Scenario: Verify user clicks on the mini cart Icon should navigates user to the cart page.
	    Given user launches the browser and navigates to "ASO_HOME" page  
		  When user clicks on one of the category and navigates to LOne
	    Then user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    Then user clicks on one of the product category and navigates to LThree
		 Then User is navigated to pdp page
		 Then user click on Add to Cart Button
		 Then user is navigated to Add to cart Notification popup  
		 And user will click on View Cart button 
		 And user navigate to Cart page
		 And user will click on Checkout button and navigates to Checkout page
		 And user clicks on mini cart Icon in checkout page
	   Then user should navigates to the CartPage "CartTitle"