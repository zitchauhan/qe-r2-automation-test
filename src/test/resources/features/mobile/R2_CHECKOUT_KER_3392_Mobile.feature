Feature: Verify Checkout Login Interstitial


@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8146 @CR-RK
  Scenario: Verify if user can land on checkout page
   Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user navigate to Cart page 
 	Then user click on checkout button in Cart page
	And user will verify the message for Sign-in
	

@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8147 @CR-RK 
	Scenario: Verify is user can Sign-In for faster checkout experience
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button
	Then user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And user enter the emailaddress "EmailAddress" in signin page
	And user enter the password "Password"
	And user click on signin button 
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8148 @CR-DPK 
	Scenario: Verify the  User must view Sign-In/Interstitial Modal
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user click on SignIn link
	And  user will verify the fields in SignIn popup
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-3392 @ZYP_CHECKOUT_K3392-8149 @CR-RK 
	Scenario: Verify if user can create an account from Not a member? Create an account link
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button
	Then user navigate to Cart page 
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
