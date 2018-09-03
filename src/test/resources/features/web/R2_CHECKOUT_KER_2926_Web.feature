Feature: E02-100 - My Account, Address Book

@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8100 @CR-MS
Scenario: To Edit cart items from Order summary
	    Given user launches the browser and navigates to "ASO_HOME" page  
		And User navigates to L2 Mens clothing
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
        
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8101 @CR-MS
Scenario: To Remove cart items from Order summary
		Given user launches the browser and navigates to "ASO_HOME" page  
		And User navigates to L2 Mens clothing
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
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8098 @CR-AKK		
Scenario: To view the Order Summary details on the Check out
		Given user launches the browser and navigates to "ASO_HOME" page  
		And User navigates to L2 Mens clothing
	    And user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    And user clicks on one of the product category and navigates to LThree
		And User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		When user will click on Checkout button and navigates to Checkout page
		Then verify the presence of the following in the Order Summary 

@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8099 @CR-AKK	
Scenario: To view the item summary with number of items
Given user launches the browser and navigates to "ASO_HOME" page  
		And User navigates to L2 Mens clothing
	    And user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    And user clicks on one of the product category and navigates to LThree
		And User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		When user will click on Checkout button and navigates to Checkout page
		Then user verifies item summary of Shipping items
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-9685 @CR-AKK			
Scenario: Verify To view the item summary with number of pick up items
Given user launches the browser and navigates to "ASO_HOME" page  
		And User navigates to L2 Mens clothing
	    And user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    And user clicks on one of the product category and navigates to LThree
		And User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		When user will click on Checkout button and navigates to Checkout page
		And user in checkout page And verify items count
		Then Item summary with number of pick up items should display in checkout page
		 
		