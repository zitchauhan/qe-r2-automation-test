Feature: B10-550 - Enable Buy Now Checkout

@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8666 @CR-MS
Scenario: Verify that Authenticated user is able to view Enable Buy Now button on PDP if user
   	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And User navigates to LThree 
	When user clicks on the product card and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn|
	
    
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8668 @CR-MS
Scenario: Verify that Authenticated user is able to view "Enable Buy Now" button on PDP if user does not have saved Shipping Address but has saved payment details
    Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutShipDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And User navigates to LThree 
	When user clicks on the product card and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn|
    
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8667 @CR-MS
Scenario: Verify that Authenticated user is able to view "Enable Buy Now" button on PDP if user does not have saved payment details but has saved Shipping Address
    Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And User navigates to LThree 
	When user clicks on the product card and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn| 
    
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8692 @CR-MS
Scenario: Verify that Authenticated user is able to view modal to add shipping details if user does not have saved Shipping Address but has saved payment details
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutShipDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree  
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn|
    When User clicks on Enable Buy Now button
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Shipping_First_Name_txt|
    |Shipping_Last_Name_txt|
    |Shipping_Address_txt|
    |Shipping_ZipCode_txt|
    |Shipping_City_txt|
    |Shipping_State_txt|
    |Signup_Cbx|
    |Default_Payment_Option_btn|    
    
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8721 @CR-MS
Scenario: Verify the shipping details modal if user does not have saved Shipping Address and payment details in My Account
    Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And User navigates to LThree 
	When user clicks on the product card and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn|
    When User clicks on Enable Buy Now button
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Shipping_First_Name_txt|
    |Shipping_Last_Name_txt|
    |Shipping_Address_txt|
    |Shipping_ZipCode_txt|
    |Shipping_City_txt|
    |Shipping_State_txt|
    |Signup_Cbx|
    |Default_Payment_Option_btn|       
 
    
    