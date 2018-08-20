Feature: Verify Checkout Login Interstitial


@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8146 @CR-RK 
  Scenario: Verify if user can land on checkout page
   Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on one of the category and navigates to LOne
   Then user clicks on one of the subcategory and navigates to LTwo
   And user is able to see the product category name in section title
   Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user will click on Checkout button
	And user will verify the message for Sign-in
	

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8147 @CR-RK 
	Scenario: Verify is user can Sign-In for faster checkout experience
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user will click on Checkout button
	When user click on SignIn link
	And user enter the valid emailaddress 
	And user enter create password 
	And user click on signin button 
	Then user should get logged in successfully
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8148 @CR-RK 
	Scenario: Verify the  User must view Sign-In/Interstitial Modal
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user will click on Checkout button
	When user click on SignIn link
	And  user will verify the fields in SignIn popup
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8149 @CR-RK 
	Scenario: Verify if user can create an account from Not a member? Create an account link
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user will click on Checkout button
	When user click on SignIn link
	And user click on Create a Account link
	Then User is navigated to Create a Account page

	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-10423 @CR-RK 	
	Scenario: Verify that user is able to navigate back to checkout page after creating new account 
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user will click on Checkout button
	When user click on SignIn link
	And user click on Create a Account link
	And user enter first name 
	And user enter last name 
	And user enter email address
	And user enter create password
	And user click optin checkbox 
	And clicks on Sign Up Button 
	Then verify that user navigates to checkout page as a signed in user



	


   
    
 