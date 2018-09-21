Feature: View/Select Shipping Address in Checkout


@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9406 @CR-DPK 
Scenario: Verify if user clicks "Go to Payment" without completing mandatory fields, system should accurate and displays relevant error messages.
 	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu   
	And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	Then user click on Go To Shipping Method button in Checkout page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Please enter the First Name|
	|Please Enter a Last Name|
	|Please enter a phone number|
	|Please enter a street address|
	|Please enter a zip code|
	|Required|	
	
	 

@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9407 @CR-DPK 
Scenario: Verify if user clicks "Go to Payment" with incorrect details, system should accurate and displays relevant error messages.
	 Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu   
	And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	 When user enter First name "InvalidFirstName" 
	And user enter Last name "InvalidLastName" 
	And user enter Phone number "InvalidPhoneNumber" 
	And user enter Address "Invalidaddress" 
	And user enter Zipcode "Invalidzipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
 	 |First name and Last name can only contain letters|
	|Please enter a valid 10 digit phone number|
	|Please enter a valid street address|
	|Invalid zip code, please enter a valid zip code|
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9408 @CR-DPK
  Scenario: Verify user address verified by the system.
    Given user launches the browser and navigates to "ASO_HOME" page
   And User clicks on the burger menu   
	And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
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
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9409 @CR-DPK
  Scenario: Verify user can select the suggested address or modify the address that has been filled.
    Given user launches the browser and navigates to "ASO_HOME" page
    And User clicks on the burger menu   
	And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
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
	
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9410 @CR-DPK
  Scenario: Verify user can redirect to address fields on clicking modify address.
    Given user launches the browser and navigates to "ASO_HOME" page
    And User clicks on the burger menu   
	And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
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
	When user clicks Modify Address link 
	Then Verify below Sub/Main Module of Checkout Page
    |# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		|checkout_ShippingAddress_PhoneNumber_txt					|
		|checkout_ShippingAddress_Address_txt						|
		|checkout_ShippingAddress_ZipCode_txt						|
		|checkout_ShippingAddress_City_txt							|
		|checkOut_ShippingAddress_GoToShippingMethod_btn			|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Highest @1H_R2 @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9413 @CR-DPK
  Scenario: Verify user can continue checkout with the suggested address/ entered address.
    Given user launches the browser and navigates to "ASO_HOME" page
   And User clicks on the burger menu   
	And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
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
	Then Verify below Sub/Main Module of Checkout Page 
	|# Verify following elements in Checkout > Shipping Address	|
	|checkout_ShippingInformation_Header_txt					|
	|checkout_ShippingAddress_txt								|	