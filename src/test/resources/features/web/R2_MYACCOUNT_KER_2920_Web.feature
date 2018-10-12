Feature: Verfiy  View/Delete/Set Default Credit/Debit Card in Account 

@R2_Web @R2_Regression @R2_All @P-Highest @1HR_R2 @C-MyAccount @KER-2920 
@ZYP_MYACCOUNT_K2920-10549 @CR-RK 
Scenario: Verify user is able to remove the saved credit card from My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments > Add new credit card section	|
		|PaymentPage_PaymentsHeader_label				|
	Then user clicks Remove button in payment page 
	And user should see the proper message 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2920 
@ZYP_MYACCOUNT_K2920-10553 @CR-RK 
Scenario: Verify user is able to make any saved credit card as default 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "CVV" 
	Then user enter First Name field "UpdateFirstName" 
	And user enter Last Name field "UpdateLastName" 
	And user enter Address field "UpdateAddress" 
	And user enter ZipCode field "UpdateZipcode" 
	And user enter PhoneNumber field "UpdatePhoneNumber" 
	Then click on Add button on credit card page 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments > Add new credit card section	|
		|PaymentPage_PaymentsHeader_label				|
	Then user click on set as default button 
	And user verifies the credit card saved is set as default 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2920 
@ZYP_MYACCOUNT_K2920-10556 @CR-RK 
Scenario: Verify that user is able to remove the only saved CC from My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments > Add new credit card section	|
		|PaymentPage_PaymentsHeader_label				|
	Then user clicks Remove button in payment page 
	And user should see the proper message 
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-2920 
@ZYP_MYACCOUNT_K2920-10545 @CR-RK @1HR_R2 
Scenario: 
	Verify user is able to see the list of saved credit cards on the Payment page under My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments > Add new credit card section	|
		|PaymentPage_PaymentsHeader_label				|
	And user verifies the credit card saved is set as default 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payment page		|
		|PaymentPage_CrediCardList_txt|
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-2920 
@ZYP_MYACCOUNT_K2920-10552 @CR-RK @C1-Message 
Scenario: Verify deleted CC retains in the saved CC list in My Account on Undo 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments > Add new credit card section	|
		|PaymentPage_PaymentsHeader_label				|
	Then user clicks Remove button in payment page 
	Then Verify the message on the page 
		|# verify the remove quantity message|
		|Undo|
		
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2920 
@ZYP_MYACCOUNT_K2920-10554 @CR-RK 
Scenario: 
	Verify last added credit card in saved list becomes the default on deletion of Default credit card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments > Add new credit card section	|
		|PaymentPage_PaymentsHeader_label				|
	And user clicks on add new credit card cta 
	And user fills the credit/debit form 
	And user clicks on add cta 
	Then user click on set as default button 
	And user clicks on add new credit card cta 
	And user fills the credit/debit form 
	And user clicks on add cta 
	And user verifies the credit card saved is set as default 
	And user clicks Remove button in payment page 
	And user verifies the credit card saved is set as default