Feature: Add Credit/Debit Card in Account 

@R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-MyAccount @KER-2919
@ZYP_CART_K2919-10675 @CR-DPK 
Scenario: Verify that authenticated user is able to navigate to "Payments" Page. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
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
		
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919
@ZYP_CART_K2919-10677 @CR-DPK 
Scenario: Verify CVV Tool Tip 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_CVV_toolTip											|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919
@ZYP_CART_K2919-10678 @CR-DPK 
Scenario:
Verify that user is not able to proceed  with Credit card addition without valid credit card details 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "InvalidCreditCard" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Unrecognized card number|		
		
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919
@ZYP_CART_K2919-10679 @CR-DPK 
Scenario:
Verify that user is not able to proceed with Credit card addition with past expiration date 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "PastExpirationDate" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Past expiration date|	
		
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919
@ZYP_CART_K2919-10680 @CR-DPK 
Scenario:
Verify that user is not able to proceed with Credit card addition without valid credit card expiration date 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "NonExistentExpirationDate" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Unrecognized expiration date|		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919
@ZYP_CART_K2919-10682 @CR-DPK 
Scenario:
Verify that user is not able to proceed with Credit card addition with non number credit card expiration date 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "NonNumberExpirationDate" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter an expiration date|
		
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919
@ZYP_CART_K2919-10683 @CR-DPK 
Scenario:
Verify that user is not able to proceed with Credit card addition with invalid credit card CVV length 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "InvalidCVV" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter a valid security code|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919
@ZYP_CART_K2919-10685 @CR-DPK 
Scenario:
Verify that user is not able to proceed with Credit card addition with non number CVV 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "NonNumberCVV" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter a security code|	
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919
@ZYP_CART_K2919-10689 @CR-DPK 
Scenario:
Verify that user is not able to proceed with Billing Information addition without entering all the required fields 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "CVV" 
	Then click on Add button on credit card page 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter the First Name|
		|Please enter a Last Name|
		|Please enter a phone number|
		|Please enter a street address|
		|Please enter a zip code|
		|Please enter the City name|
		|Please select a State|
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919
@ZYP_CART_K2919-10690 @CR-DPK 
Scenario: Verify that Payment Details are not saved if User clicks on Cancel CTA 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "CVV" 
	Then user enter First Name field "UpdateFirstName" 
	And user enter Last Name field "UpdateLastName" 
	And user enter Address field "UpdateAddress" 
	And user enter ZipCode field "UpdateZipcode" 
	And User clicks on cancel 
	Then User verifies that the form fields are closed 
	
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919
@ZYP_CART_K2919-10692 @CR-DPK 
Scenario: Verify that Payment Details are not saved if User clicks on Cancel CTA 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
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
	And Verify that Credit Card details as entered are saved in User Profile. 
	
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919
@ZYP_CART_K2919-10693 @CR-DPK 
Scenario: Verify if entered address is validated by AVS 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "CVV" 
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter PhoneNumber field "PhoneNumber" 
	And user enter Address field "AVSAddress" 
	And user enter ZipCode field "zipcode" 
	Then click on Add button on credit card page 
	And error is found in the shipping address 
	And user selects the suggested address instead of entered address 
	And clicks on Use Selected Address button 
	And Verify that Credit Card details as entered are saved in User Profile. 
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-2919 
@ZYP_CART_K2919-10696 @CR-DPK 
Scenario: TC_7-Verify Add Credit Card and added as a Default Card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "CVV" 
	Then user enter First Name field "UpdateFirstName" 
	And user enter Last Name field "UpdateLastName" 
	And user enter Address field "UpdateAddress" 
	And user enter ZipCode field "UpdateZipcode" 
	And user enter PhoneNumber field "PhoneNumber" 
	Then User verifies that city and State are populated automatically 
	Then click on Add button on credit card page 
	And click on Add another Credit Card button 
	And User enters Credit Card number "SecondCreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "CVV" 
	Then user enter First Name field "UpdateFirstName" 
	And user enter Last Name field "UpdateLastName" 
	And user enter Address field "UpdateAddress" 
	And user enter ZipCode field "UpdateZipcode" 
	And user enter PhoneNumber field "UpdatePhoneNumber" 
	Then User verifies that city and State are populated automatically 
	Then click on Add button on credit card page 
	#	/hen User clicks on ASO Logo and should be navigated to Home Page
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page 
	And user click on edit payment metnod 
	Then User verifies that in Payment section credit card "CreditCardNumber" is pre-populated by default 
	
	
	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-2919
@ZYP_CART_K2919-10698 @CR-DPK 
Scenario:
Verify that the City and State are auto populated when Zip Code is entered 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	And user deletes all existing credit card 
	And user clicks on Add New Credit Card button 
	And User enters Credit Card number "CreditCardNumber" 
	And User enters expiration date "ExpDate" 
	And User enters CVV number "CVV" 
	Then user enter First Name field "UpdateFirstName" 
	And user enter Last Name field "UpdateLastName" 
	And user enter Address field "UpdateAddress" 
	And user enter ZipCode field "UpdateZipcode" 
	Then User verifies that city and State are populated automatically 	