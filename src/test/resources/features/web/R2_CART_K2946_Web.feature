Feature: Verify accepted Payment Display in Cart

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2946 @ZYP_CART_K2946-7993 @CR-SK 
Scenario: Verify if unauthenticated user can view Accepted Payment Methods
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user logs in as "UserWithZeroProductsInCart"
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	When user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	Then user should see all payment icons on cart page
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2946 @ZYP_CART_K2946-7994 @CR-SK 
Scenario: Verify if Authenticated user can view Accepted Payment Methods
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	When user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	Then user should see all payment icons on cart page
	