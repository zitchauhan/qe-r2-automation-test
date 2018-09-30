Feature: Verfiy Edit Shipping Address in Checkout 


@R2_Web @R2_Regression @R2_All @P-High @1HR_R2 @C-Checkout @KER-3152 @ZYP_CHECKOUT_K3152-8025 @CR-DPK 
Scenario: 
	Verify that authenticated user is able to edit address in shipping address section on checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount
	And user lands on My Account page and click on adress
	When user clicks Remove button
	Then user Clicks on Add New Address link 
     When user enter First name "FirstName" in address book
	And user enter Last name "LastName" in address book
	And user enter Phone number "PhoneNumber" in address book
	And user enter Address "Address" in address book
	And user enter Zipcode "zipcode" in address book
	And user click on set as default button
	 And clicks on Add New Address button
	Then user Clicks on Add New Address link 
	When user enter First name "UpdateFirstName" in address book
	And user enter Last name "UpdateLastName" in address book
	And user enter Phone number "UpdatePhoneNumber" in address book
	And user enter Address "UpdateAddress" in address book
	And user enter Zipcode "UpdateZipcode" in address book
	And clicks on Add New Address button
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	And user click on checkout button in Cart page
	And user click on edit button in shipping address section 
	And user verifies all the saved addresses in my account should be displayed in the dropdown
	And User verify edit CTA 
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3152 @ZYP_CHECKOUT_K3152-8026 @CR-DPK 
Scenario: 
	Verify that guest user is able to edit address in shipping address section on checkout page
	Given user launches the browser and navigates to "ASO_HOME" page
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button
	Then user click on checkout button in Cart page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZIPCODE"
	Then user click on Go To Shipping Method button in Checkout page
	And user click on edit button in shipping address section 
	Then Verify below Sub/Main Module of Checkout Page
    |# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		|checkout_ShippingAddress_PhoneNumber_txt					|
		|checkout_ShippingAddress_Address_txt						|
		|checkout_ShippingAddress_ZipCode_txt						|
		|checkout_ShippingAddress_City_txt							|
		|checkOut_ShippingAddress_GoToShippingMethod_btn			|	
	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3152 @ZYP_CHECKOUT_K3152-10627 @CR-DPK
  Scenario: Verify while edit address Once user clicks on 'Confirm' or 'Go to Shipping Method' CTA (as applicable) , AVS check should happen and user should see AVS modal
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
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3152 @ZYP_CHECKOUT_K3152-10628 @CR-DPK
  Scenario: Verify if an error is found in the address while edit. And AVS returns a suggestion
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
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3152 @ZYP_CHECKOUT_K3152-10629 @CR-DPK
  Scenario: Verify if user selects suggestion and checkout while edit address
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
	And user verify the suggested address		
	And clicks on Use Selected Address button
	Then Verify below Sub/Main Module of Checkout Page 
	|# Verify following elements in Checkout > Shipping Address	|
	|checkout_ShippingInformation_Header_txt					|
	|checkout_ShippingAddress_txt								|	