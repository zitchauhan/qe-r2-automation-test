Feature: Verify Checkout Login Interstitial


@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8146 @CR-DPK
  Scenario: Verify if user can land on checkout page
   Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
   Then user clicks on one of the subcategory and navigates to LTwo
   And user is able to see the product category name in section title
   Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	#Then user click on Add to Cart Button
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user navigate to Cart page 
	Then user click on checkout button in Cart page
	And user will verify the message for Sign-in
	

@R2_Web @R2_Regression @R2_All @P2 @1HR_R2 @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8147 @CR-RK 
	Scenario: Verify is user can Sign-In for faster checkout experience
	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	#Then user click on Add to Cart Button
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button
	Then user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And user enter the emailaddress "EmailAddress" from checkout page
	And user enter the password "Password" from checkout page
	And user click on signin button
	
@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-3392
@ZYP_CHECKOUT_K3392-8148 @CR-DPK 
Scenario: Verify the  User must view Sign-In/Interstitial Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	#	And User navigates to L2 Mens clothing
	#    Then user clicks on one of the subcategory and navigates to LTwo
	#    And user is able to see the product category name in section title
	#    Then user clicks on one of the product category and navigates to LThree
	
	When User searches a product "productName" and navigates to PDP 
	Then User is navigated to pdp page 
	#Then user click on Add to Cart Button
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page 
	When user click on SignIn link 
	And  user will verify the fields in SignIn popup 
	
@R2_Web @R2_Regression @R2_All @P1 @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8149 @CR-RK 
	Scenario: Verify if user can create an account from Not a member? Create an account link
	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	#Then user click on Add to Cart Button
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button
	Then user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And user click on Create a Account link
	Then User is navigated to Create a Account page

	@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-10423 @CR-RK 	
	Scenario: Verify that user is able to navigate back to checkout page after creating new account 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	#Then user click on Add to Cart Button
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button
	Then user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And user click on Create a Account link
	When user enter first "FirstName" 
	And user enter last "LastName" 
	And user enter random email address in signup page
	And user enter create password
	And clicks on Sign Up Button 
	Then Verify below Sub/Main Module of Checkout Page 
	|# Verify following elements in Checkout > Shipping Address	|
	|checkout_ShippingInformation_Header_txt					|
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8150 @CR-DPK @C1-Message
	Scenario: Verify is user gets proper validation message for invalid email address
	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	#Then user click on Add to Cart Button
	And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user click on SignIn link	
	When user enter the valid Emailaddress "UnregisteredEmailAddress"
	And user enter the valid Password "Password" 
	And user click on signin button
#	Then user should not be allowed to login
#	And user should get an error message for nonregisteredemailid address
	 Then Verify the message on the page
	 |#verify following MSG should be displayed|
	 |The combination of Email Address and Password is incorrect. Please try again.|
	
	
@R2_Web @R2_Regression @R2_All @P-Lowest @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8151 @CR-DPK @C1-Message
	Scenario: Verify is user gets proper validation message for invalid password
	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	#Then user click on Add to Cart Button
	And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user click on SignIn link	
	When user enter the Invalid emailaddress "IncorrectEmailAddress"
	And user enter the Invalid password "IncorrectPassword" 
	And user click on signin button
#	Then user should not be allowed to login
#	And user should get an error message stating email id or password is incorrect
	 Then Verify the message on the page
	 |#verify following MSG should be displayed|
	 |The combination of Email Address and Password is incorrect. Please try again.|
	
	@R2_Web @R2_Regression @R2_All @P-Lowest @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8152 @CR-DPK 
	Scenario: Verify if user is able to close the Sign-in popup window
	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	#Then user click on Add to Cart Button
	And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And user will click on close button on the popup 
	Then User will verfiy that the Sign-in popup is closed
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8153 @CR-DPK 
	Scenario: Verify the if user not authenticated, user must see empty fields in Sign-in popup
	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	#Then user click on Add to Cart Button
	And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And user is not authenticated, user must see empty fields in signin popup



@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-10426 @CR-DPK 	
	Scenario: Verify that user is able to navigate back to forgot password page 
	Given user launches the browser and navigates to "ASO_HOME" page
	 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP 
	#Then user click on Add to Cart Button
	And user click on ship it button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	When user click on SignIn link
	When user clicks on Forgot your password link on the Sign in for checkout page
	Then Verify below Sub/Main Module of My Account 
	|# Verify following elements in forgot password page|
	|ForgotPasswordPage_EmailAddress_txt				|
	|ForgotPasswordPage_Submit_btn						|
	

#=============================================Sanity============================================#
	
@R2_Web @R2_MAST-18 @P2 @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8147 @AutomationSmoke
Scenario: TC_19-Verify Sign In During Checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
	When user click on SignIn link 
	And user enter the valid emailaddress "SanityEmailAddress" from checkout page 
	And user enter the valid password "Password" from checkout page 
	And user click on signin button
	
	
   
    
 
