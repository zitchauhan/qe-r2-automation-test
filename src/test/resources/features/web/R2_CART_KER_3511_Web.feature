Feature: Verify Item/Order Level Promotion Calculation

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3511 @ZYP_CHECKOUT_K3511-7991 @CR-DPK
Scenario: Verify if authenticated user can view updated estimated shipping when zip code updated on cart page in order summary section.
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "login" 
	And user enter the valid password "password" 
	And user click on signin button
	Then User clicks on ASO Logo and should be navigated to Home Page
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page
	And user enters new "Zipcode" in Change ZIP Code modal overlay 
	And user clicks on Submit button
	Then user verifies the estimated shipping cost based on updated zip code.
	
	
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3511 @ZYP_CHECKOUT_K3511-7992 @CR-DPK
	Scenario: Verify if unauthenticated user can view estimated shipping cost based entered zip code
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
	When user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page
	And user enters new "Zipcode" in Change ZIP Code modal overlay 
	And user clicks on Submit button
	Then user verifies the estimated shipping cost based on updated zip code.
	
	
	
