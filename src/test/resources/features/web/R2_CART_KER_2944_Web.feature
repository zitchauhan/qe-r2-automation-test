Feature: Out of Stock 

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2944 @ZYP_CART_K2944-9822 @CR-SK 
Scenario: Verify that user is able to proceed with checkout by updating the fulfillment method  of OOS items in the Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user creates an account and signs in 
		|firstName |lastName|email						   |password |confirmPassword|
		|automation|user	|automationuser@academymail.com|Pass@1234|Pass@1234		 |
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user clicks on "Continue to Checkout" CTA 
	And user changes the fulfillment method of OOS item (BOPIS to STH) 
	And user clicks on "Continue to Checkout" CTA 
	Then verify that user is able to navigate to Checkout page 
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2944 @ZYP_CART_K2944-9821 @CR-SK 
Scenario: Verify that user is able to proceed with checkout by moving the OOS items to wishlist 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user creates an account and signs in 
		|firstName |lastName|email						   |password |confirmPassword|
		|automation|user	|automationuser@academymail.com|Pass@1234|Pass@1234		 |
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user clicks on "Continue to Checkout" CTA 
	And user clicks on "Move to wish list" CTA for OOS item 
	And user clicks on "Continue to Checkout" CTA 
	Then verify that user is able to navigate to Checkout page 
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2944 @ZYP_CART_K2944-9819 @CR-SK 
Scenario: Verify that user is able to proceed with checkout by removing  OOS items from Cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user creates an account and signs in 
		|firstName |lastName|email						   |password |confirmPassword|
		|automation|user	|automationuser@academymail.com|Pass@1234|Pass@1234		 |
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user clicks on Continue to Checkout CTA
	And user clicks on Remove from Cart CTA for OOS item 
	And user clicks on Continue to Checkout CTA
	Then verify that user is able to navigate to Checkout page
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2944 @ZYP_CART_K2944-8176 @CR-SK 
Scenario: Verify that user is able to add OOS item to wishlist
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user creates an account and signs in 
		|firstName |lastName|email						   |password |confirmPassword|
		|automation|user	|automationuser@academymail.com|Pass@1234|Pass@1234		 |
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user clicks on Continue to Checkout CTA
	And user clicks on Add to Wish list CTA for OOS item 
	Then verify that message( Item is successfully added to wishlist) is displayed
	And verify that item is added to wishlist 
	And verify that the item is removed from cart
	
	