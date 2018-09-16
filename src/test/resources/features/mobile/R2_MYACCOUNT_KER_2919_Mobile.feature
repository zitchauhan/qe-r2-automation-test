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
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919 @ZYP_CART_K2919-10678 @CR-DPK 
Scenario: Verify that user is not able to proceed  with Credit card addition without valid credit card details 
Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "InvalidCreditCard"
	And user clicks the CVV Tool Tip
	Then Verify the message on the page
	|# Following Error Message should show on the page|
	|Unrecognized card number|		
	
	
	
 @R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919 @ZYP_CART_K2919-10679 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with past expiration date 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "PastExpirationDate"
	And user clicks the CVV Tool Tip
	Then Verify the message on the page
	|# Following Error Message should show on the page|
	|Past expiration date|	
	
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919 @ZYP_CART_K2919-10680 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition without valid credit card expiration date
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "NonExistentExpirationDate"
	And user clicks the CVV Tool Tip
	Then Verify the message on the page
	|# Following Error Message should show on the page|
	|Unrecognized expiration date|		
	
 @R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919 @ZYP_CART_K2919-10682 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with non number credit card expiration date
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "NonNumberExpirationDate"
	And user clicks the CVV Tool Tip
	Then Verify the message on the page
	|# Following Error Message should show on the page|
	|Please enter an expiration date|
	
 @R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919 @ZYP_CART_K2919-10683 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with invalid credit card CVV length 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "ExpDate"
 	And User enters CVV number "InvalidCVV"
	And user clicks the CVV Tool Tip
	Then Verify the message on the page
	|# Following Error Message should show on the page|
	|Please enter a valid security code|
	

 @R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919 @ZYP_CART_K2919-10685 @CR-DPK 
Scenario: Verify that user is not able to proceed with Credit card addition with non number CVV 
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "ExpDate"
 	And User enters CVV number "NonNumberCVV"
	And user clicks the CVV Tool Tip
	Then Verify the message on the page
	|# Following Error Message should show on the page|
	|Please enter a security code|	
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919 @ZYP_CART_K2919-10689 @CR-DPK 
Scenario: Verify that user is not able to proceed with Billing Information addition without entering all the required fields
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "ExpDate"
 	And User enters CVV number "CVV"
 	Then click on Add button
	Then Verify the message on the page
	|# Following Error Message should show on the page|
	|Please enter the First Name|
	|Please Enter a Last Name|
	|Please enter a phone number|
	|Please enter a street address|
	|Please enter a zip code|
	|Please enter the City name|
	|Please select a State|
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919 @ZYP_CART_K2919-10690 @CR-DPK 
Scenario: Verify that Payment Details are not saved if User clicks on Cancel CTA
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "ExpDate"
 	And User enters CVV number "CVV"
 	Then user enter First Name field "UpdateFirstName"
 	And user enter Last Name field "UpdateLastName"
 	And user enter Address field "UpdateAddress"
 	And user enter ZipCode field "UpdateZipcode"
 	And User clicks on cancel
 	Then User verifies that the form fields are closed 	
	
 	
 			
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919 @ZYP_CART_K2919-10692 @CR-DPK 
Scenario: Verify that Payment Details are not saved if User clicks on Cancel CTA
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "ExpDate"
 	And User enters CVV number "CVV"
 	Then user enter First Name field "UpdateFirstName"
 	And user enter Last Name field "UpdateLastName"
 	And user enter Address field "UpdateAddress"
 	And user enter ZipCode field "UpdateZipcode"
 	And User clicks on cancel
 	Then User verifies that the form fields are closed 	
 	
 	
 	
 @R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919 @ZYP_CART_K2919-10693 @CR-DPK 
Scenario: Verify if entered address is validated by AVS
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "ExpDate"
 	And User enters CVV number "CVV"
 	When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter PhoneNumber field "PhoneNumber"
    And user enter Address field "AVSAddress"
    And user enter ZipCode field "zipcode"
    Then click on Add button	
	And error is found in the shipping address
	And user selects the suggested address instead of entered address
	And clicks on Use Selected Address button
 	And Verify that Credit Card details as entered are saved in User Profile.
 	
 	
 			
 	
 	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919 @ZYP_CART_K2919-10698 @CR-DPK 
Scenario: Verify that the City and State are auto populated when Zip Code is entered
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	Then user click on My Account and navigate to payment
	#When user clicks on payment tab
	And user clicks on Add New Credit Card button	
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|	
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "ExpDate"
 	And User enters CVV number "CVV"
 	Then user enter First Name field "UpdateFirstName"
 	And user enter Last Name field "UpdateLastName"
 	And user enter Address field "UpdateAddress"
 	And user enter ZipCode field "UpdateZipcode"
 	Then User verifies that city and State are populated automatically 	