Feature: Verify Gift Card - Payment Processing

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8922 @CR-RK 
Scenario: Verify The user must be able to input a valid email Id in checkout page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
     And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user click on SignIn link
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	And user enter the emailaddress "EmailAddress" in signin page
	And user enter the password "Password" 
	And user click on signin button 
	Then Verify below Sub/Main Module of My Account	
	|#verify following elements in profile page		|
		|ProfilePage_HelloMessage_label					| 


@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8923 @CR-RK 
	Scenario: Verify The user must be able to input a valid email Id while creating account
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	And clicks on SignUp link from SignIn page
	Then Verify below Sub/Main Module of My Account 
	|#Verify following elements in SignUp section|
	|SignUp_FirstName_txt						 |
	|SignUp_LastName_txt						 |
	|SignUp_EmailAddress						 |
	|SignUp_Password					         | 
	And user enter first "FirstName" 
	And user enter last "LastName" 
	And user enter random email address in signup page
	And user enter password "Password1"
	And user click optin checkbox 
	And clicks on Sign Up Button 
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8924 @CR-RK 	
	Scenario: Verify The user must see form field validations to ensure the e-mail address meets the desired format '@'provided in checkout page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user click on SignIn link
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	And user enter the emailaddress "InvalidEmailAddress" in signin page
	And user enter the password "Password" 
	And user click on signin button
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Invalid Email|

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8925 @CR-RK 	
	Scenario: Verify The user must see form field validations to ensure the e-mail address meets the desired format e.g.@ provided in creating account page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	And clicks on SignUp link from SignIn page 
	Then Verify below Sub/Main Module of My Account 
	|#Verify following elements in SignUp section|
	|SignUp_FirstName_txt						 |
	|SignUp_LastName_txt						 |
	|SignUp_EmailAddress						 |
	|SignUp_Password					         | 
	And user enter first "FirstName" 
	And user enter last "LastName" 
	And user enter random "InvalidEmailAddress" in signup page
	And user enter password "Password1"
	And user click optin checkbox 
	And clicks on Sign Up Button 
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Please enter the Email Address in a valid format (ex. abc@xyz.com)|
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8928 @CR-RK 		
	Scenario: Verify The user must see form field validations to ensure the e-mail address meets the desired format (domain provided) in checkout page
Given user launches the browser and navigates to "ASO_HOME" page 
Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user click on SignIn link
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	And user enter the emailaddress "InvalidEmailAddresswithoutdomain" in signin page
	And user enter the password "Password" 
	And user click on signin button
#	Then Verify the message on the page
##    |# Following Error Message should show on the page|
##    |Please enter the Email Address in a valid format (ex. abc@xyz.com)|
	
	
	@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8930 @CR-RK 	
Scenario: Verify The user must see form field validations to ensure the e-mail address meets the desired format (domain provided) in creating account page
Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	And clicks on SignUp link from SignIn page 
	Then Verify below Sub/Main Module of My Account 
	|#Verify following elements in SignUp section|
	|SignUp_FirstName_txt						 |
	|SignUp_LastName_txt						 |
	|SignUp_EmailAddress						 |
	|SignUp_Password					         | 
	And user enter first "FirstName" 
	And user enter last "LastName" 
	And user enter random "InvalidEmailAddresswithoutdomain" in signup page
	And clicks on Sign Up Button 
	Then Verify the message on the page
  	|# Following Error Message should show on the page|
 	|Please enter the Email Address in a valid format (ex. abc@xyz.com)|


@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8937 @CR-RK 	
Scenario: Verify The user must be able to see the relevant errors when entering the email address in checkout page
Given user launches the browser and navigates to "ASO_HOME" page 
Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user click on SignIn link
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	When user enter the emailaddress "InvalidEmailAddress" in signin page
	And user enter the password "Password" 
	And user click on signin button
	#Then user should get an error message stating please enter valid email	

	@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8938 @CR-RK 	
Scenario: Verify The user must be able to see the relevant errors when entering the email address in Account create page
Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button  
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user click on SignIn link
	And user click on Create a Account link
	When user enter random "InvalidEmailAddress" in signup page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|Please enter the Email Address in a valid format (ex. abc@xyz.com)|

