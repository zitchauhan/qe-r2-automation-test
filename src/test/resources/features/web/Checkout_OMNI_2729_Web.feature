Feature: Academy credit card should display as seperate option in payment section of checkout

@Web @Regression @OMNI-2729_1 @CR-MT @C-Checkout @C-Order
  Scenario: Verify ACC is displayed as seperate option in payment section of checkout when ACC is selected
  Given user launches the browser and navigates to "ASO_HOME" page 
  And User searches a product "productName" and navigates to PDP 
	And user click on ship it button
	And user click on view cart
	And user will click on Checkout button and navigates to Checkout page
	And user adds shipment address on checkout page for "guest" user
	Then user click on go to payment present in shipping method
	When user clicks on Go to payment CTA
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify user can view the Payment drawer|
		|PaymentHeader_Txt|
		|PaymentMethodHeader_Txt|
		|Academy_CreditCard_radioBtn|
		|CreditCard_radioBtn|
		|PayPal_radioBtn|
	And user click on academy creditcard radiobtn
	Then Verify below Sub/Main Module of Checkout Page 
		|CreditCardNumber_Input|
	And user click on checkbox Same as shipping address
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements billing address form|
		|SameAsShippingAddress_checkBox|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
		|Adderss_Input|
		|ZipCode_Input|
		|City_Input|
		|State_DD|
		|SignuptogetHotDeals_checkBox|
		|ReviewOrder_Btn|

@Web @Regression @OMNI-2729_2 @CR-MT @C-Checkout @C-Order
  Scenario: Verify ACC is displayed as seperate option in payment section of checkout when CC is selected
  Given user launches the browser and navigates to "ASO_HOME" page 
  And User searches a product "productName" and navigates to PDP 
	And user click on ship it button
	And user click on view cart
	And user will click on Checkout button and navigates to Checkout page
	And user adds shipment address on checkout page for "guest" user
	Then user click on go to payment present in shipping method
	When user clicks on Go to payment CTA
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify user can view the Payment drawer|
		|PaymentHeader_Txt|
		|PaymentMethodHeader_Txt|
		|Academy_CreditCard_radioBtn|
		|CreditCard_radioBtn|
		|PayPal_radioBtn|
		|CreditCardHolder_Input|
		|CreditCardNumber_Input|
		|ExpirationDate_Input|
		|Cvv_Input|
		|Plus_GiftCard|
		|BillingInformation_Txt|
		|SameAsShippingAddress_Txt|
	And user click on checkbox Same as shipping address
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements billing address form|
		|SameAsShippingAddress_checkBox|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
		|Adderss_Input|
		|ZipCode_Input|
		|City_Input|
		|State_DD|
		|SignuptogetHotDeals_checkBox|
		|ReviewOrder_Btn|



		