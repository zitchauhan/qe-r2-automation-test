Feature: Add Credit/Debit Card in Account 

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919 @ZYP_CART_K2919-10675 @CR-DPK 
Scenario: Verify that authenticated user is able to navigate to "Payments" Page.
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	And user clicks on Add New Credit Card button
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
	#	|AddCreditCardPage_CreditCardNumber_txt									|
	#	|AddCreditCardPage_CardExpiryDate_txt									|
	#	|AddCreditCardPage_CardCVV_txt											|		
		|AddCreditCardPage_FirstName_txt										|
		|AddCreditCardPage_LastName_txt											|
		|AddCreditCardPage_Address_txt											|
		|AddCreditCardPage_ZipCode_txt											|
		|AddCreditCardPage_City_txt												|
		|AddCreditCardPage_State_dropdown										|
		|AddCreditCardPage_PhoneNumber_txt										|
		|AddCreditCardPage_Add_btn												|
		|AddCreditCardPage_Cancel_btn											|
		|AddCreditCardPage_CVV_toolTip											|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919 @ZYP_CART_K2919-10677 @CR-DPK 
Scenario: Verify CVV Tool Tip
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	And user clicks on Add New Credit Card button
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_CVV_toolTip											|
	
	
	
 