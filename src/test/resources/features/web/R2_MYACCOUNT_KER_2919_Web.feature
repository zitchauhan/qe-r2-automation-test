Feature: Add Credit/Debit Card in Account 

@R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-2919 @ZYP_CART_K2919-10675 @CR-DPK 
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
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K2919-10677 @CR-DPK 
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
	
	
	
 @R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K2919-10678 @CR-DPK 
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
	
	
 @R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-2919 @ZYP_CART_K2919-10679 @CR-DPK 
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
	
	
 @R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-2919 @ZYP_CART_K2919-10680 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition without valid credit card expiration date
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
	
 @R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K2919-10682 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with non number credit card expiration date
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
	
 @R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K2919-10683 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with invalid credit card CVV length 
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
	

 @R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K2919-10685 @CR-DPK 
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
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-2919 @ZYP_CART_K2919-10692 @CR-DPK 
Scenario: Verify that Payment Details are not saved if User clicks on Cancel CTA
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
 	Then user enter First Name field "UpdateFirstName"
 	And user enter Last Name field "UpdateLastName"
 	And user enter Address field "UpdateAddress"
 	And user enter ZipCode field "UpdateZipcode"
 	And User clicks on cancel
 	Then User verifies that the form fields are closed 
 	
@R2_Web @R2_Regression @R2_All @P-Low @C-My_Account @KER-2919 @ZYP_CART_K2919-10698 @CR-DPK 
Scenario: Verify that the City and State are auto populated when Zip Code is entered
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
 	Then user enter First Name field "UpdateFirstName"
 	And user enter Last Name field "UpdateLastName"
 	And user enter Address field "UpdateAddress"
 	And user enter ZipCode field "UpdateZipcode"
 	Then User verifies that city and State are populated automatically 	
 	
		


