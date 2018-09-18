Feature: PayPal on Checkout page 


@R2_Web @R2_Regression @R2_All @P-High @1HR-R2 @C-Checkout @KER-3338
@ZYP_CHECKOUT_3338-8256 @CR-AKK 
Scenario:
Verify guest user is able to select Paypal as Payment method on checkout for non-SOF items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	Then user click on paypal radiobtn 
	Then user switch to iframe to verify paypalcheckoutBtn 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify gift card related things are not displayed |
		|PayPalCheckOut_Btn|
		
@R2_Web @R2_Regression @R2_All @P-Low @1HR-R2 @C-Checkout @KER-3338
@ZYP_CHECKOUT_3338-8262 @CR-AKK 		
Scenario: Verify the user is navigated to the PayPal page
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	Then user click on paypal radiobtn 
	Then user switch to iframe to verify paypalcheckoutBtn 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify gift card related things are not displayed |
		|PayPalCheckOut_Btn|	
	Then Verify paypal button is clicked
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @1HR-R2 @C-Checkout @KER-3338
@ZYP_CHECKOUT_3338-8261 @CR-AKK 
	Scenario: Verify authenticated user is able to proceed with Paypal as checkout for non-SOF items
   Given user launches the browser and navigates to "ASO_HOME" page 
   And user clicks on SignIn link from global header
 	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	Then user click on paypal radiobtn 
	Then user switch to iframe to verify paypalcheckoutBtn 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify gift card related things are not displayed |
		|PayPalCheckOut_Btn|	
	Then Verify paypal button is clicked
	
	@R2_Web @R2_Regression @R2_All @P-Low @1HR-R2 @C-Checkout @KER-3338
@ZYP_CHECKOUT_3338-8259 @CR-AKK 
	Scenario: Verify logged in user is able to select Paypal as Payment method on checkout for non-SOF items
  Given user launches the browser and navigates to "ASO_HOME" page 
  And user clicks on SignIn link from global header
 	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up 
	Then user click on paypal radiobtn 
	
	@R2_Web @R2_Regression @R2_All @P-Low @1HR-R2 @C-Checkout @KER-3338
@ZYP_CHECKOUT_3338-8258 @CR-AKK 
	Scenario: Verify guest user is able to proceed with Paypal as checkout for non-SOF items
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	Then user click on paypal radiobtn 