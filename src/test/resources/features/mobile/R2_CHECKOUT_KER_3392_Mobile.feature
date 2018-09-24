Feature: Verify Checkout Login Interstitial


@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8146 @CR-RK
  Scenario: Verify if user can land on checkout page
   Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
		 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page|
		|checkout_YouAreCheckingOutAsGuest_txt		|
		|checkout_SignIn_lnk						|
	

@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8147 @CR-RK 
	Scenario: Verify is user can Sign-In for faster checkout experience
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
		 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And user enter the emailaddress "EmailAddress" in signin page
	And user enter the password "Password"
	And user click on signin button 
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8148 @CR-DPK 
	Scenario: Verify the  User must view Sign-In/Interstitial Modal
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
		 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	Then user click on checkout button in Cart page
	When user click on SignIn link
	Then Verify below Sub/Main Module of Checkout Page 
	|#Verify following elements in checkout page|
		|checkout_YouAreCheckingOutAsGuest_txt		|
		|checkout_SignIn_lnk						|
		|WelcomeBackEmailAddress_Input|
		|WelcomeBackPassword_Input|
		|WelcomeBackSignIN_Btn|
	
@R2_Mobile @R2_Regression @R2_All @P-Highest @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8149 @CR-RK 
	Scenario: Verify if user can create an account from Not a member? Create an account link
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
		 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button 
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And user click on Create a Account link
	Then Verify below Sub/Main Module of My Account 
	|#Verify following elements in SignUp section	|
		|SignUp_FirstName_txt						 	|
		|SignUp_LastName_txt							|
		|SignUp_EmailAddress						 	|
		|SignUp_Password					         	| 
		|SignUp_ReceivePromotion_chkBx					|
		|SignUpPage_SignUp_btn							|

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8150 @CR-DPK 
	Scenario: Verify is user gets proper validation message for invalid email address
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
		 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	Then user click on checkout button in Cart page
	When user click on SignIn link	
	When user enter the valid Emailaddress "UnregisteredEmailAddress"
	And user enter the valid Password "Password" 
	And user click on signin button
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |The combination of Email Address and Password is incorrect. Please try again.|
	
	
	
@R2_Mobile @R2_Regression @R2_All @P-Lowest @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8151 @CR-DPK 
	Scenario: Verify is user gets proper validation message for invalid password
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
		 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	Then user click on checkout button in Cart page
	When user click on SignIn link	
	When user enter the Invalid emailaddress "EmailAddress"
	And user enter the Invalid password "IncorrectPassword" 
	And user click on signin button
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |The combination of Email Address and Password is incorrect. Please try again.|	
	
	
@R2_Mobile @R2_Regression @R2_All @P-Lowest @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8152 @CR-DPK 
	Scenario: Verify if user is able to close the Sign-in popup window
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
		 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	Then user click on checkout button in Cart page
	When user click on SignIn link
	Then Verify below Sub/Main Module of Checkout Page 
	|#Verify following elements in checkout page|
		|checkout_YouAreCheckingOutAsGuest_txt		|
		|WelcomeBackEmailAddress_Input|
		|WelcomeBackPassword_Input|
		|WelcomeBackSignIN_Btn|
	And user will click on close button on the popup 
	Then User will verfiy that the Sign-in popup is closed
	
	
	@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8153 @CR-DPK 
	Scenario: Verify the if user not authenticated, user must see empty fields in Sign-in popup
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
		 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And user click on signin button
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Please enter email address|
	|Please enter password|	
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-10423 @CR-RK 	
	Scenario: Verify that user is able to navigate back to checkout page after creating new account 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
		 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button 
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And user click on Create a Account link
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Address "Address" 
	And user enter create password
	And user click optin checkbox 
	And clicks on Sign Up Button 
	Then verify that user navigates to checkout page as a signed in user
	
	
	@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-10426 @CR-DPK 	
	Scenario: Verify that user is able to navigate back to forgot password page 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
		 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP 
	Then user click on Add to Cart Button 
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	When user click on SignIn link
	When user clicks on Forgot your password link on the Sign in for checkout page
	Then Verify below Sub/Main Module of My Account 
	|# Verify following elements in forgot password page|
	|ForgotPasswordPage_EmailAddress_txt				|
	|ForgotPasswordPage_Submit_btn						|