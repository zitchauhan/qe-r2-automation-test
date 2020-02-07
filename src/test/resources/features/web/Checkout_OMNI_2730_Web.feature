Feature: Academy credit card should display as seperate option in Enable buy now


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