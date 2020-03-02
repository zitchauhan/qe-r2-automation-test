Feature: Academy credit card should display as seperate option in Enable buy now

#Following scripts will be executed when Enable buy now is incorporated in the new PDP

@Web @Regression @OMNI-2730_1 @CR-MT @C-Checkout @C-Order
Scenario: Verify ACC is display as seperate option in enable buy now when ACC is selected
	 Given user launches the browser and navigates to "ASO_HOME" page
   And user clicks on SignIn link from global header 
	 And user enter the valid emailaddress "Email_Address_2" 
	 And user enter the valid password "Password_2" 
	 And user click on signin button 
	 When User searches a product "SKUForBuyNow" and navigates to PDP
   Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP page|
    |EnableBuyNow_btn|
   When User clicks on Enable Buy Now button
	 Then Verify below Sub/Main Module of PDP
		|Academy_Credit_CardNumber_txt|
    |BillingFirstName_txt|
		|BillingLastName_txt|
		|BillingPhone_txt|
		|BllingAddress_txt|
		|BillingZipCode_txt|
		|BillingCity_txt|
		|BillingState_txt|
   	|BillingEmail_txt|
		|PaymentFormSubmit_btn|
		
		
@Web @Regression @OMNI-2730_2 @CR-MT @C-Checkout @C-Order
Scenario: Verify ACC is display as seperate option in enable buy now when CC is selected
	 Given user launches the browser and navigates to "ASO_HOME" page
   And user clicks on SignIn link from global header 
	 And user enter the valid emailaddress "Email_Address_2" 
	 And user enter the valid password "Password_2" 
	 And user click on signin button 
	 When User searches a product "SKUForBuyNow" and navigates to PDP
   Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP page|
    |EnableBuyNow_btn|
   When User clicks on Enable Buy Now button
   And user click on creditcard radiobtn
	 Then Verify below Sub/Main Module of PDP
		|CreditCardHolder_txt|
		|CreditCardNumber_txt|
		|ExpirationDate_txt|
		|Cvv_txt|
    |BillingFirstName_txt|
		|BillingLastName_txt|
		|BillingPhone_txt|
		|BllingAddress_txt|
		|BillingZipCode_txt|
		|BillingCity_txt|
		|BillingState_txt|
   	|BillingEmail_txt|
		|PaymentFormSubmit_btn|
		
@Web @Regression @OMNI-2730_3 @CR-MT @C-Checkout @C-Order
Scenario: Verify the system behavior when user enters valid digits as BIN number on ACC of EBN
	 Given user launches the browser and navigates to "ASO_HOME" page
   And user clicks on SignIn link from global header 
	 And user enter the valid emailaddress "Email_Address_2" 
	 And user enter the valid password "Password_2" 
	 And user click on signin button 
	 When User searches a product "SKUForBuyNow" and navigates to PDP
   Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP page|
    |EnableBuyNow_btn|
   When User clicks on Enable Buy Now button
   And user fills the academy credit card details 
	Then user verifies the credit card logo image in EBN modal
	
@Web @Regression @OMNI-2730_4 @CR-MT @C-Checkout @C-Order
Scenario: Verify the system behavior when user enters valid digits as BIN number on CC of EBN
	 Given user launches the browser and navigates to "ASO_HOME" page
   And user clicks on SignIn link from global header 
	 And user enter the valid emailaddress "Email_Address_2" 
	 And user enter the valid password "Password_2" 
	 And user click on signin button 
	 When User searches a product "SKUForBuyNow" and navigates to PDP
   Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP page|
    |EnableBuyNow_btn|
   When User clicks on Enable Buy Now button
   And user click on creditcard radiobtn
   And user fills the credit card details in iframe of EBN
	Then user verifies the credit card logo image in EBN modal
	
@Web @Regression @OMNI-2730_5 @CR-MT @C-Checkout @C-Order
Scenario: Verify the system behavior when user enters invalid digits as BIN number on ACC of EBN
	 Given user launches the browser and navigates to "ASO_HOME" page
   And user clicks on SignIn link from global header 
	 And user enter the valid emailaddress "Email_Address_2" 
	 And user enter the valid password "Password_2" 
	 And user click on signin button 
	 When User searches a product "SKUForBuyNow" and navigates to PDP
   Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP page|
    |EnableBuyNow_btn|
   When User clicks on Enable Buy Now button
   And user fills the invalid credit card details in EBN
	Then user expect element Unrecognized card number to be present
	
@Web @Regression @OMNI-2730_6 @CR-MT @C-Checkout @C-Order
Scenario: Verify the system behavior when user enters invalid digits as BIN number on CC of EBN
	 Given user launches the browser and navigates to "ASO_HOME" page
   And user clicks on SignIn link from global header 
	 And user enter the valid emailaddress "Email_Address_2" 
	 And user enter the valid password "Password_2" 
	 And user click on signin button 
	 When User searches a product "SKUForBuyNow" and navigates to PDP
   Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP page|
    |EnableBuyNow_btn|
   When User clicks on Enable Buy Now button
   And user click on creditcard radiobtn
   And user fills the invalid credit card details in iframe of EBN
	Then user expect element Unrecognized card number to be present