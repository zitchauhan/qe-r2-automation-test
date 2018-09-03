Feature: B05-350 Shipping Estimate in Cart

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3511 @ZYP_CART_K3511-7991 @CR-DPK
Scenario: Verify if authenticated user can view updated estimated shipping when zip code updated on cart page in order summary section.
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "login" 
	And user enter the valid password "password" 
	And user click on signin button
	Then User clicks on ASO Logo and should be navigated to Home Page
	And User navigates to L2 Mens clothing
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
	
	
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3511 @ZYP_CART_K3511-7992 @CR-DPK
	Scenario: Verify if unauthenticated user can view estimated shipping cost based entered zip code
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
	When user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page
	And user enters new "Zipcode" in Change ZIP Code modal overlay 
	And user clicks on Submit button
	Then user verifies the estimated shipping cost based on updated zip code.
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-8637 @ZYP_CART_K3511-8873 @CR-MS
Scenario: Verify that Unauthenticated user can view estimated shipping based on detected geo-location
  	    Given user launches the browser and navigates to "ASO_HOME" page  
		And User navigates to L2 Mens clothing
	    And user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    And user clicks on one of the product category and navigates to LThree
		And User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		When user navigate to Cart page
	    Then Verify that estimated shipping is displayed on the basis of detected Geo location

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-8872 @ZYP_CART_K3511-8872 @CR-MS	    
Scenario: Verify that authenticated user with no store information can view estimated shipping
        Given user launches the browser and navigates to "ASO_HOME" page  
		And User navigates to L2 Mens clothing
	    And user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    And user clicks on one of the product category and navigates to LThree
		And User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		When user navigate to Cart page
	    Then Verify that estimated shipping is displayed on the basis of detected Geo location
	
	
	
