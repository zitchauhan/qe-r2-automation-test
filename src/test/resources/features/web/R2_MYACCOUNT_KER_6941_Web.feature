Feature: Verify Gift Card - Payment Processing

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8922 @CR-RK 
Scenario: Verify The user must be able to input a valid email Id in checkout page
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
	And user click on checkout button in Cart page
	And user click on SignIn link
	And user enter the emailaddress "EmailAddress" in signin page
	And user enter the password "Password" 
	And user click on signin button 
	#Then user should get logged in successfully


@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8923 @CR-RK 
	Scenario: Verify The user must be able to input a valid email Id while creating account
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	And user enter first "FirstName" 
	And user enter last "LastName" 
	And user enter random email address in signup page
	And user enter password "Password1"
	And user click optin checkbox 
	And clicks on Sign Up Button 
	And user should see the successfull message
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8924 @CR-RK 	
	Scenario: Verify The user must see form field validations to ensure the e-mail address meets the desired format '@'provided in checkout page
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
	And user click on checkout button in Cart page
	And user click on SignIn link
	And user enter the emailaddress "InvalidEmailAddress" in signin page
	And user enter the password "Password" 
	And user click on signin button
	#Then user should get an error message stating please enter valid email

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8925 @CR-RK 	
	Scenario: Verify The user must see form field validations to ensure the e-mail address meets the desired format e.g.@ provided in creating account page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	And user enter first "FirstName" 
	And user enter last "LastName" 
	And user enter random "InvalidEmailAddress" in signup page
	And user enter password "Password1"
	And user click optin checkbox 
	And clicks on Sign Up Button 
	Then user should get an error message stating please enter valid email
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8928 @CR-RK 		
	Scenario: Verify The user must see form field validations to ensure the e-mail address meets the desired format (domain provided) in checkout page
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
	And user click on checkout button in Cart page
	And user click on SignIn link
	And user enter the emailaddress "InvalidEmailAddresswithoutdomain" in signin page
	And user enter the password "Password" 
	And user click on signin button
	#Then user should get an error message stating please enter valid email
	

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8930 @CR-RK 	
Scenario: Verify The user must see form field validations to ensure the e-mail address meets the desired format (domain provided) in creating account page
Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	And user enter first "FirstName" 
	And user enter last "LastName" 
	And user enter random "InvalidEmailAddresswithoutdomain" in signup page
	And user enter password "Password1"
	And user click optin checkbox 
	And clicks on Sign Up Button 
	Then user should get an error message stating please enter valid email

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6941 @ZYP_MYACCOUNT_K6941-8937 @CR-RK 	
Scenario: Verify The user must be able to see the relevant errors when entering the email address in checkout page
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
	And user click on checkout button in Cart page
	And user click on SignIn link
	When user enter the emailaddress "InvalidEmailAddress" in signin page
	And user enter the password "Password" 
	And user click on signin button
	#Then user should get an error message stating please enter valid email

	
