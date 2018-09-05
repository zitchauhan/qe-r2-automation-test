Feature: Verfiy  View/Delete/Set Default Credit/Debit Card in Account

@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-2920 @ZYP_MYACCOUNT_K2920-10549 @CR-RK 
Scenario: Verify user is able to remove the saved credit card from My Account
Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user clicks on payment tab
	Then Verify below Sub/Main Module of My Account
	|#Verify following elements in Payments > Add new credit card section	|
	|PaymentPage_PaymentsHeader_label				|
	|AddCreditCardPage_AddNewCreditCardsHeader_label											|
	Then user clicks Remove button in payment page
	And user should see the proper message
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-2920 @ZYP_MYACCOUNT_K2920-10553 @CR-RK 	
Scenario: Verify user is able to make any saved credit card as default
Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password"
	And user click on signin button
		And user clicks on payment tab
		Then Verify below Sub/Main Module of My Account
	|#Verify following elements in Payments > Add new credit card section	|
	|PaymentPage_PaymentsHeader_label				|
	Then user click on set as default button 
	And user verifies the credit card saved is set as default 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2920 @ZYP_MYACCOUNT_K2920-10556 @CR-RK 	
Scenario: Verify that user is able to remove the only saved CC from My Account
Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password"
	And user click on signin button
	And user clicks on payment tab
	Then Verify below Sub/Main Module of My Account
	|#Verify following elements in Payments > Add new credit card section	|
	|PaymentPage_PaymentsHeader_label				|
	Then user clicks Remove button in payment page
	And user should see the proper message

@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2920 @ZYP_MYACCOUNT_K2920-10545 @CR-RK	
Scenario: Verify user is able to see the list of saved credit cards on the Payment page under My Account
Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password"
	And user click on signin button
	And user clicks on payment tab
	Then Verify below Sub/Main Module of My Account
	|#Verify following elements in Payments > Add new credit card section	|
	|PaymentPage_PaymentsHeader_label				|
	And user verifies the credit card saved is set as default 
	Then Verify below Sub/Main Module of My Account
	|#Verify following elements in Payment page		|
	|PaymentPage_CrediCardList_txt|
	



