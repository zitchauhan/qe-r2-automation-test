Feature: Prevent customers with a California shipping or billing state from purchasing online

 
	@OMNI-165 @C-Order @Regression @CR-SB @C-Checkout @Web @RegressionP1 @TC-OMNI-13464
	Scenario: Verify Global State Restriction message is displayed if guest user tries to proceed from shipping address 
	with state from restriction lists
	
  	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user creates an account
		And User searches a product "productName" and navigates to PDP 
	#	And user click on Add to Cart Button 
	#	And user is navigated to Add to cart Notification popup 
	#	When user click on checkout button 
		And user click on ship it button
		And user click on viewcart button
		Then user navigates to Cart Page
		And user clicks on checkout button on cart page
  	And user adds restricted shipment address on checkout page for "guest" user
  	Then global restriction error message is displayed for "CA" on "shipping" section

	
	@OMNI-165 @C-Order @Regression @CR-SB @C-Checkout @Web @RegressionP1 @TC-OMNI-13465
  Scenario: Verify Global State Restriction message is displayed if guest user tries to proceed from billing address 
  with state from restriction lists

    Given user launches the browser and navigates to "ASO_HOME" page
    #When user creates an account
    And User searches a product "productName" and navigates to PDP
    And user click on ship it button
    And user click on viewcart button
    Then user navigates to Cart Page
    And user clicks on checkout button on cart page
    And user adds shipment address on checkout page for "guest" user
    Then user click on go to payment present in shipping method
    And user uncheck the checkbox for Billing address different from shipping address
    And user adds restricted billing address on checkout page
    Then global restriction error message is displayed for "CA" on "payment" section
    

	@OMNI-165 @C-Order @Regression @CR-SB @C-Checkout @Web 
  Scenario: Verify Global State Restriction message is displayed if registered user try to add address in my account 
  with state from restriction lists
  
  	Given user launches the browser and navigates to "ASO_HOME" page 
		And clicks on SignIn button in home page 
		Then Verify below Sub/Main Module of My Account 
		|SignInPage_EmailAddress_txt			| 
		|SignInPage_Password_txt					|
		|SignInPage_SignIn_btn						|
		And user enter the valid emailaddress "RawUser" 
		And user enter the valid password "Password" 
		And user click on signin button 
		And user click on MyAccount 
		And user lands on My Account page and click on adress 
		When user Clicks on Add New Address link
		Then Verify below Sub/Main Module of My Account 
		|AddressPage_FirstName_txt				|
		|AddressPage_LastName_txt					|
		|AddressPage_PhoneNumber_txt			|
		|AddressPage_Address_txt 					|
		|AddressPage_ZipCode_txt			   	|
		|AddressPage_City_txt						  |
		|AddressPage_State_txt						|
		And user adds restricted address on my account page
  	Then global restriction error message is displayed for "CA" on "myaccountaddress" section
		
	
	@OMNI-165 @C-Order @Regression @CR-SB @C-Checkout @Web 
	Scenario: Verify Global State Restriction message is displayed if registered user try to edit address in my account 
  with state from restriction lists

		Given user launches the browser and navigates to "ASO_HOME" page
		And user clicks on SignIn link from global header
		And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
  	And user click on signin button
		And user click on MyAccount 
		And user lands on My Account page and click on adress
		And user clicks on edit in my account section
		And user enter restricted ZipCode field in my account 
		Then global restriction error message is displayed for "CA" on "myaccountaddress" section

  @OMNI-165 @C-Order @Regression @CR-SB @C-Checkout @Web 
  Scenario: Verify Global State Restriction message is displayed if regsitered user try to add payment in my account 
  with state from restriction lists in billing address
  
  Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
  And user click on signin button
	Then user click on My Account and navigate to payment
	#And user deletes all existing credit card
	And user clicks on Add New Credit Card button	
	And user clicks on "CreditCard" radio button
	And user enters Card Holder name
	And User enters Credit Card number "CreditCardNumber"
 	And User enters expiration date "ExpDate"
 	And User enters CVV number "CVV"
 	Then user enter First Name field "UpdateFirstName"
 	And user enter Last Name field "UpdateLastName"
 	And user enter Address field "UpdateAddress"
 	And user enter PhoneNumber field "UpdatePhoneNumber"
 	And user enter restricted ZipCode field in my account 
 	Then click on Add button on credit card page
 	Then global restriction error message is displayed for "CA" on "myaccountbilling" section
		
		
	@OMNI-165 @C-Order @Regression @CR-SB @C-Checkout @Web 
 	Scenario: Verify Global State Restriction message is displayed if registered user try to edit payment in my account 
  with state from restriction lists in billing address
  
  Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
  And user click on signin button
	Then user click on My Account and navigate to payment
	And user clicks on edit in my account section
	And user enter restricted ZipCode field in my account 
	Then global restriction error message is displayed for "CA" on "myaccountbilling" section
	
	
	@OMNI-165 @C-Order @Regression @CR-SB @C-Checkout @Web 	
	Scenario: Verify Global State Restriction message is displayed if user try edit billing address with restricted address
	on order summary during checkout 
	
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "UserWithSavedAddressAndPayment" 
	And user navigate and deletes existing items in cart 
	And User searches a product "productName" and navigates to PDP 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on edit payment cta 
	Then Verify below Sub/Main Module of Checkout Page 
	|#Verify the billing information is already displayed|
	|ChangeBillingInformation_Txt|
	And user clicks on change billing info cta 
	And user enter restricted ZipCode field in billing section on checkout 
  Then global restriction error message is displayed for "CA" on "payment" section
  
  
  @OMNI-165 @C-Order @Regression @CR-SB @C-Checkout @Web 		
  Scenario: Verify Global State Restriction message is displayed if user tries to add restricted zip code on faster checkout 
  while registering user
  
  Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in SignUp section	|
		|SignUp_FirstName_txt						 		|
		|SignUp_LastName_txt								|
		|SignUp_EmailAddress						 		|
		|SignUp_Password					         	| 
#		|SignUp_ReceivePromotion_chkBx			|
		|SignUpPage_SignUp_btn							|
		|SignUpPage_AlreadyHaveAnAccount_txt|
		|SignUpPage_SignInNow_lnk						|
	Then user select Add Address for Faster Checkout checkbox
	And user enter restricted ZipCode field for faster checkout
	Then global restriction error message is displayed for "CA" on "shipping" section
	
		
		
		
		
	
	
 	