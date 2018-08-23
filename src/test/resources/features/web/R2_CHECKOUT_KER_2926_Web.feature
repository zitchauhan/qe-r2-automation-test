Feature: E02-100 - My Account, Address Book

@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-8100 @ZYP_CHECKOUT_K2926-8100 @CR-MS
Scenario: To Edit cart items from Order summary
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
		And user will click on Checkout button and navigates to Checkout page
		When user clicks on Edit My cart in Order Summary
        Then user should navigates to the CartPage "CartTitle"
        
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-8101 @ZYP_CHECKOUT_K2926-8101 @CR-MS
Scenario: To Remove cart items from Order summary
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
		And user will click on Checkout button and navigates to Checkout page
		When user clicks on Edit My cart in Order Summary
		Then user should navigates to the CartPage "CartTitle"
		Then Remove items from the cart
		Then verify the item is removed