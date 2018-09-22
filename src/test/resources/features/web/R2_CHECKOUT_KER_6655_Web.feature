Feature: B10-550 - Enable Buy Now Checkout

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8666 @CR-MS
Scenario: Verify that Authenticated user is able to view Enable Buy Now button on PDP if user does not have saved payment and Shipping Address details
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn|
    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8668 @CR-MS
Scenario: Verify that Authenticated user is able to view Enable Buy Now button on PDP if user does not have saved Shipping Address but has saved payment details
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutShipDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	When user clicks on one of the product category and navigates to LThree  
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn|
    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8667 @CR-MS
Scenario: Verify that Authenticated user is able to view Enable Buy Now button on PDP if user does not have saved payment details but has saved Shipping Address
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	When user clicks on one of the product category and navigates to LThree  
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn|

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8692 @CR-MS
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
    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8721 @CR-MS
Scenario: Verify the shipping details modal if user does not have saved Shipping Address and payment details in My Account
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
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
      
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-12346 @CR-MS
Scenario: Verify Enable Buy Now is applicable for Baits
   Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When user clicks on one of the category and navigates to LOne SOF
    Then user clicks on one of the subcategory and navigates to LTwo Baits
    Then user clicks on one of the product category and navigates to LThree Baits
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Default_Payment_Option_btn|
    
#Defect-KER-13488
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-12348 @CR-MS
Scenario: Verify Enable Buy Now is not applicable for following items SOF Age Restriction Items Item(s) having only In store Inventory while loading PDP
   Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When user clicks on one of the category and navigates to LOne SOF
    Then user clicks on one of the subcategory and navigates to LTwo SOF
    Then user clicks on one of the product category and navigates to LThree SOF
    Then user should not able to see the Enable BUY NOW button on the PDP    
    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-12347 @CR-MS
Scenario: Verify Enable Buy Now is applicable for Gift cards
   Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
    When User searches a product "SKUForGiftCard" and navigates to PDP 
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Default_Payment_Option_btn|    

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8726 @CR-MS
Scenario: Verify the Payment details modal if user does not have saved Shipping Address and payment details in My Account
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "productName" and navigates to PDP 
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn|
    When User clicks on Enable Buy Now button
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |Credit_CardNumber_txt|
    |Credit_Card_Expriration_txt|
    |Credit_Card_Cvv_txt|
    |BillingState_txt|
    |BillingFirstName_txt|
    |BillingLastName_txt|
    |BllingAddress_txt|
    |BillingZipCode_txt|
    |BillingCity_txt|
    |BillingPhone_txt|
    |BillingEmail_txt|
    |PaymentFormSubmit_btn|
    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8731 @CR-MS
Scenario: Verify the Payment details modal if user does not have saved Shipping Address and payment details in My Account
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "productName" and navigates to PDP 
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn|
    When User clicks on Enable Buy Now button
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |Credit_CardNumber_txt|
    |Credit_Card_Expriration_txt|
    |Credit_Card_Cvv_txt|
    |BillingState_txt|
    |BillingFirstName_txt|
    |BillingLastName_txt|
    |BllingAddress_txt|
    |BillingZipCode_txt|
    |BillingCity_txt|
    |BillingPhone_txt|
    |BillingEmail_txt|
    |PaymentFormSubmit_btn|   
    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8732 @CR-MS
Scenario: Verify that Authenticated user is able proceed to checkout by adding payment details in Payment Form modal if user does not have saved Payment Address but has saved Shipping details
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "productName" and navigates to PDP
	When User clicks on Enable Buy Now button
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |Credit_CardNumber_txt|
    |Credit_Card_Expriration_txt|
    |Credit_Card_Cvv_txt|
    |BillingState_txt|
    |BillingFirstName_txt|
    |BillingLastName_txt|
    |BllingAddress_txt|
    |BillingZipCode_txt|
    |BillingCity_txt|
    |BillingPhone_txt|
    |BillingEmail_txt|
    |PaymentFormSubmit_btn|
    And user enters creditcardnumber "CardVISA"
    And user enters creaditcardExp "ExpDate"
    And user enters creditcardcvv "ThreeDigitCVV"
    And user enters billingfirstname "FirstName"
    And user enters billinglastname "LastName"
    And user enters billingaddress "Address"
    And user enters billingzipcode "FindAsStoreZIPCode"
    And user enters billingphonenumber "PhoneNumber"
    And user enters billingemail "EmailWithoutPaymentDetails"
    And user clicks on paymentsubmit button
    Then Verify the message on the page
    |Your confirmation email is on its way|
    And delete the payment details in myaccount
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-12345 @CR-MS
Scenario: Verify Enable Buy Now is applicable for Bundle / Package Item(s)
Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User searches a product "SKUForBundleProducts" and navigates to PDP
	Then Verify the nextstep functionality 
    Then Verify below Sub/Main Module of PDP
    |EnableBuyNow_btn| 
    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8735 @CR-MS
Scenario: Verify that Authenticated user is able to view Enable Buy Now button on PDP if user does not have saved payment and Shipping Address details
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "OutOfStockSKUNumber" and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |Verify following elements in PDP page|
    |EnableBuyNow_btn|
        

    	 