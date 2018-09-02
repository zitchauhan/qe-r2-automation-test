Feature: Add Shipping Address in Checkout 

@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-9683 @CR-DPK 
Scenario: Verify User needs to enter Zip code(it is mandatory) if not provided on cart page 
 	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on one of the category and navigates to LOne
   Then user clicks on one of the subcategory and navigates to LTwo
   And user is able to see the product category name in section title
   Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	Then user click on Go To Shipping Method button in Checkout page
	And verify the error message for mandatory field
	And user enter Zipcode "ZIPCODE"
	Then user click on Go To Shipping Method button in Checkout page
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-9681 @CR-DPK 
Scenario: Verify As an unauthenticated user should be presented with the un-populated shipping address form fields 
 	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on one of the category and navigates to LOne
   Then user clicks on one of the subcategory and navigates to LTwo
   And user is able to see the product category name in section title
   Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user navigate to Cart page 
	Then user click on checkout button in Cart page
	Then verify un-populated shipping address form fields	
	
	

		