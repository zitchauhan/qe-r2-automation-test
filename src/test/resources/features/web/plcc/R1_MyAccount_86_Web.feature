Feature: PLCC: MyAccount

@C-PLCC @Regression @All @PLCC-86 @CR-VS
Scenario: Verify PLCC card information saved under customer profile
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	When user click on My Account link 
	Then Verify below Sub/Main Module of MyAccount 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "passwordPlcc" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page  
	When user click on My Account link 
    And user click on Payments link 
	Then Verify below Sub/Main Module of MyAccount 
		|#Verify following elements in Payments > Add new credit card section	|
		|PaymentPage_PaymentsHeader_label				|
	And user verifies the credit card saved and set as default 
	Then Verify below Sub/Main Module of MyAccount 
		|#Verify following elements in Payment page		|
		|PaymentPage_CrediCardList_txt|
	And delete all credit cards from My Account
	