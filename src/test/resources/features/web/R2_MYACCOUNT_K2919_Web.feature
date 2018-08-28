Feature: Add Credit/Debit Card in Account 

@R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-2919 @ZYP_CART_K3093-10675 @CR-DPK 
Scenario: Verify that authenticated user is able to navigate to "Payments" Page.
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When user clicks on payment tab
	And user clicks on Add New Credit Card button
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|		
		|AddCreditCardPage_FirstName_txt										|
		|AddCreditCardPage_LastName_txt											|
		|AddCreditCardPage_Address_txt											|
		|AddCreditCardPage_ZipCode_txt											|
		|AddCreditCardPage_City_txt												|
		|AddCreditCardPage_State_dropdown										|
		|AddCreditCardPage_PhoneNumber_txt										|
		|AddCreditCardPage_Add_btn												|
		|AddCreditCardPage_Cancel_btn											|
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K3093-10677 @CR-DPK 
Scenario: Verify CVV Tool Tip
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When user clicks on payment tab
	And user clicks on Add New Credit Card button
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|		
		|AddCreditCardPage_FirstName_txt										|
		|AddCreditCardPage_LastName_txt											|
		|AddCreditCardPage_Address_txt											|
		|AddCreditCardPage_ZipCode_txt											|
		|AddCreditCardPage_City_txt												|
		|AddCreditCardPage_State_dropdown										|
		|AddCreditCardPage_PhoneNumber_txt										|
		|AddCreditCardPage_Add_btn												|
		|AddCreditCardPage_Cancel_btn											|	
	And user clicks the CVV Tool Tip
	Then verify that a flyout with tool tip is opened		
	
	
	
 @R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K3093-10678 @CR-DPK 
Scenario: Verify that user is not able to proceed  with Credit card addition without valid credit card details 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "InvalidCreditCard"
	Then User views red outlined box and message 'Unrecognized card number' 
	
	
 @R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-2919 @ZYP_CART_K3093-10679 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with past expiration date 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "InvalidCreditCard"
 	And User enters expiration date "PastExpirationDate"
	Then Verify that red outlined box and message 'Past expiration date' is displayed	
	
	
 @R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-2919 @ZYP_CART_K3093-10680 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with past expiration date 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "InvalidCreditCard"
 	And User enters expiration date "NonExistentExpirationDate"
	Then Verify that red outlined box and message 'Unrecognized expiration date' is displayed	
	
 @R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K3093-10682 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with past expiration date 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "InvalidCreditCard"
 	And User enters expiration date "NonNumberExpirationDate"
	Then Verify that red outlined box and message 'Unrecognized expiration date' is displayed
	
 @R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K3093-10683 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with past expiration date 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCard"
 	And User enters expiration date "ExpirationDate"
 	And User enters CVV number "InvalidCVV"
	Then verify that red outlined box and message 'Please enter a valid security code' is displayed	
	

 @R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K3093-10685 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with non number CVV 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCard"
 	And User enters expiration date "ExpirationDate"
 	And User enters CVV number "NonNumberCVV"
	Then verify that the field population does not happen	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-2919 @ZYP_CART_K3093-10689 @CR-DPK 
Scenario: Verify that user is not able to proceed with Billing Information addition without entering all the required fields 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCard"
 	And User enters expiration date "ExpirationDate"
 	And User enters CVV number "CVV"
 	And User clicks on Add CTA
 	Then verify that inline error messages are displayed prompting the user to enter all required fields	
		


