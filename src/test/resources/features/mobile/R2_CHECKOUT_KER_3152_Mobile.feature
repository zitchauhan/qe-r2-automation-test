Feature: Verfiy Edit Shipping Address in Checkout 



@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3152 @ZYP_CHECKOUT_K3152-10627 @CR-DPK
  Scenario: Verify while edit address Once user clicks on 'Confirm' or 'Go to Shipping Method' CTA (as applicable) , AVS check should happen and user should see AVS modal
 Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
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
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3152 @ZYP_CHECKOUT_K3152-10628 @CR-DPK
  Scenario: Verify if an error is found in the address while edit. And AVS returns a suggestion
       Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
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
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3152 @ZYP_CHECKOUT_K3152-10629 @CR-DPK
  Scenario: Verify if user selects suggestion and checkout while edit address
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
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
	And user selects the suggested address instead of entered address
	And clicks on Use Selected Address button
	Then Verify below Sub/Main Module of Checkout Page 
	|# Verify following elements in Checkout > Shipping Address	|
	|checkout_ShippingInformation_Header_txt					|
	|checkout_ShippingAddress_txt								|