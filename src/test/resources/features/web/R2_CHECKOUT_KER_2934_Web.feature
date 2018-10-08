Feature: Add Shipping Address in Checkout 


@R2_Web @R2_Regression @R2_All @P-Highest @1HR_R2 @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-8177 @CR-DPK 
Scenario: Verify the Shipping address form that authenticated user can view on adding new shipping address during checkout
 	Given user launches the browser and navigates to "ASO_HOME" page
 	And user clicks on SignIn link from global header
 	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	And User clicks on edit CTA 
	And user click on Add a new Shipping Address button in the shipping address drop down 
	Then Verify below Sub/Main Module of Checkout Page
    |# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		|checkout_ShippingAddress_PhoneNumber_txt					|
		|checkout_ShippingAddress_Address_txt						|
		|checkout_ShippingAddress_ZipCode_txt						|
		|checkout_ShippingAddress_City_txt							|
		|checkOut_ShippingAddress_GoToShippingMethod_btn			|
	
	
	

@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-8178 @CR-DPK 
Scenario: Verify if unauthenticated user be presented with the blank shipping address form fields
 	Given user launches the browser and navigates to "ASO_HOME" page
#	And User Navigates L2 form Homepage Header 
#     And User clicks on product in PLP
When User searches a product "productName" and navigates to PDP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	Then user click on Go To Shipping Method button in Checkout page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Please enter the First Name|
	|Please enter a Last Name|
	|Please enter a phone number|
	|Please enter a street address|
#	|Please enter a zip code|
	|Required|	

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-8179 @CR-DPK 
Scenario: Verify Guest user should view zipcode pre-populated if previously provided on Cart
 	Given user launches the browser and navigates to "ASO_HOME" page
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	Then Verify below Sub/Main Module of Checkout Page
    |# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		|checkout_ShippingAddress_PhoneNumber_txt					|
		|checkout_ShippingAddress_Address_txt						|
		|checkout_ShippingAddress_ZipCode_txt						|
		|checkout_ShippingAddress_City_txt							|
		|checkOut_ShippingAddress_GoToShippingMethod_btn			|
	And user should see the Zip code pre-populated in Shipping Address drawer
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-9681 @CR-DPK 
Scenario: Verify guest user, if after placing order, registers the account saves the address in My Account
 	Given user launches the browser and navigates to "ASO_HOME" page
#	And User Navigates L2 form Homepage Header 
#     And User clicks on product in PLP
	When User searches a product "productName" and navigates to PDP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	Then user click on Go To Shipping Method button in Checkout page
	And verify the error message for mandatory field
	And user enter Zipcode "ZIPCODE"
	Then user click on Go To Shipping Method button in Checkout page
	And user click on go to payment present in shipping method
		

	
@R2_Web @R2_Regression @R2_All @P-Highest @1HR_R2  @1HR_R2  @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-9683 @CR-DPK 
Scenario: Verify User needs to enter Zip code(it is mandatory) if not provided on cart page 
 	Given user launches the browser and navigates to "ASO_HOME" page
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user click on checkout button 
	Then Verify below Sub/Main Module of Checkout Page
    |# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		|checkout_ShippingAddress_PhoneNumber_txt					|
		|checkout_ShippingAddress_Address_txt						|
		|checkout_ShippingAddress_ZipCode_txt						|
		|checkout_ShippingAddress_City_txt							|
		|checkOut_ShippingAddress_GoToShippingMethod_btn			|
	And user adds shipment address on checkout page for "guest" user without zipcode
	And verify the error message for mandatory field
	And user enter Zipcode "ZIPCODE"
	Then user click on Go To Shipping Method button in Checkout page
	
	
@R2_Web @R2_Regression @R2_All @P-Highest @1HR_R2 @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-10382 @CR-DPK
  Scenario: Verify if user selects AVS address suggestion and checkout
    Given user launches the browser and navigates to "ASO_HOME" page
  And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
    And user will click on View Cart button
     Then user click on checkout button in Cart page
     Then Verify below Sub/Main Module of Checkout Page
    |# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		|checkout_ShippingAddress_PhoneNumber_txt					|
		|checkout_ShippingAddress_Address_txt						|
		|checkout_ShippingAddress_ZipCode_txt						|
		|checkout_ShippingAddress_City_txt							|
		|checkOut_ShippingAddress_GoToShippingMethod_btn			|
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "AVSAddress"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page	
	And error is found in the shipping address
	And user verify the suggested address	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-10383 @CR-DPK
  Scenario: Verify if user selects AVS address suggestion and checkout
    Given user launches the browser and navigates to "ASO_HOME" page
   And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
     And user will click on View Cart button
    Then user click on checkout button in Cart page
    Then Verify below Sub/Main Module of Checkout Page
    |# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		|checkout_ShippingAddress_PhoneNumber_txt					|
		|checkout_ShippingAddress_Address_txt						|
		|checkout_ShippingAddress_ZipCode_txt						|
		|checkout_ShippingAddress_City_txt							|
		|checkOut_ShippingAddress_GoToShippingMethod_btn			|
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "AVSAddress"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page	
	And error is found in the shipping address
	And user selects the suggested address instead of entered address
	And clicks on Use Selected Address button
	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2934 @ZYP_CHECKOUT_K2934-11681 @CR-DPK
  Scenario: Verify Once user clicks on 'Confirm' or 'Go to Shipping Method' CTA, Shipping Method drawer gets open on successful validation
    Given user launches the browser and navigates to "ASO_HOME" page
    And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
     And user will click on View Cart button
    Then user click on checkout button in Cart page
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "AVSAddress"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page	
	And error is found in the shipping address
	And user selects the suggested address instead of entered address
	And clicks on Use Selected Address button
	Then Verify below Sub/Main Module of Checkout Page 
	|# Verify following elements in Checkout > Shipping Address	|
	|checkout_ShippingInformation_Header_txt					|
	|checkout_ShippingAddress_txt								|
	

		