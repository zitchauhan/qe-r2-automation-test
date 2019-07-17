Feature: View/Select Shipping Address in Checkout


@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9406 @CR-DPK @C1-Message
Scenario: Verify if user clicks "Go to Payment" without completing mandatory fields, system should accurate and displays relevant error messages.
 	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
   Then user clicks on one of the subcategory and navigates to LTwo
     Then user clicks on one of the product category and navigates to LThree
	#	And user click on Add to Cart Button
	And user click on ship it button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	Then user click on Go To Shipping Method button in Checkout page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Please enter a First Name|
	|Please enter a Last Name|
	|Please enter a phone number|
	|Please enter a street address|
#	|Please enter a zip code|
	|Required|	
	
	 

 @R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9407 @CR-DPK @C1-Message
Scenario: Verify if user clicks "Go to Payment" with incorrect details, system should accurate and displays relevant error messages.
	 Given user launches the browser and navigates to "ASO_HOME" page
#	And User navigates to L2 Mens clothing
#   Then user clicks on one of the subcategory and navigates to LTwo
#     Then user clicks on one of the product category and navigates to LThree
When User searches a product "productName" and navigates to PDP
	#	And user click on Add to Cart Button
	And user click on ship it button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	 When user enter First name "InvalidFirstName" 
	And user enter Last name "InvalidLastName" 
	And user enter Phone number "InvalidPhoneNumber" 
	And user enter Address "Invalidaddress" 
	And user enter Zipcode "Invalidzipcode"  
	Then user click on Go To Shipping Method button in Checkout page
   Then user click on Go To Shipping Method button in Checkout page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
 	 |First name and Last name can only contain letters|
	|Please enter a valid 10 digit phone number|
	#updated by MJR on 16/7/19
	|#Please enter a valid street address|
	|Please enter a full street address (ex: 1 Example Rd). P.O. Box or Military Address (PSC, CMR, or UNIT).|
	|Invalid zip code, please enter a valid zip code|
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9408 @CR-DPK
  Scenario: Verify user address verified by the system.
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
     #	And user click on Add to Cart Button
	And user click on ship it button
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
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9409 @CR-DPK
  Scenario: Verify user can select the suggested address or modify the address that has been filled.
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
     #	And user click on Add to Cart Button
	And user click on ship it button
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
	
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9410 @CR-DPK
  Scenario: Verify user can redirect to address fields on clicking modify address.
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
     #	And user click on Add to Cart Button
	And user click on ship it button
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
		
		
@R2_Web @R2_Regression @R2_All @P1 @1HR_R2 @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9413 @CR-DPK 
  Scenario: Verify user can continue checkout with the suggested address/ entered address.
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
     #	And user click on Add to Cart Button
	And user click on ship it button
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