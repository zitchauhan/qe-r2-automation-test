Feature: BO6-125 - Fulfillment Options

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3779 @ZYP_CHECKOUT_K3779-10813 @CR-RKA
Scenario: Verify that user should be able to fulfill an order when cart having single item with single fulfillment option(Ship to home)
Given user launches the browser and navigates to "ASO_HOME" page 
When User searches a product "productName" and navigates to PDP
Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then Shipping radio button is selected by default
   When user will click on Checkout button and navigates to Checkout page
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page
    Then Verify below Sub/Main Module of Checkout Page
    |#verify following is being displayed |
    |checkout_ShippingMethod_ShippingMethodHeader_txt|
    |checkout_ShippingMethod_GoToPayment_btn|
    |checkout_ShippingMethod_ItemImage_img|
        
    @R2_Web @R2_Regression @R2_All @P-High @1HR_R2 @C-Checkout @KER-3779 @ZYP_CHECKOUT_K3779-10815 @CR-RKA
    Scenario: Verify that user should be able to fulfill an order when cart having multiple item with single fulfillment option(Ship to home)
    Given user launches the browser and navigates to "ASO_HOME" page 
    When User searches a product "productName" and navigates to PDP
    Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
    Then Shipping radio button is selected by default
    And user clicks on one of the category and navigates to LOne page
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
    And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user will click on View Cart button
    Then Shipping radio button is selected by default
When user will click on Checkout button and navigates to Checkout page
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page
    Then Verify below Sub/Main Module of Checkout Page
    |#verify following is being displayed |
     |checkout_ShippingMethod_ShippingMethodHeader_txt|
    |checkout_ShippingMethod_GoToPayment_btn|
    |checkout_ShippingMethod_ItemImage_img|


 @R2_Web @R2_Regression @R2_All @P-Highest @1HR @C-Checkout @KER-3779 @ZYP_CHECKOUT_K3779-10817 @CR-RKA
Scenario: Verify that user should be able to fulfill an order when cart having items with single fulfillment option(dropship to home)
Given user launches the browser and navigates to "ASO_HOME" page 
When User searches a product "productName" and navigates to PDP
Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then Shipping radio button is selected by default
   When user will click on Checkout button and navigates to Checkout page
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page
    Then Verify below Sub/Main Module of Checkout Page
    |#verify following is being displayed |
    |checkout_ShippingMethod_ShippingMethodHeader_txt|
    |checkout_ShippingMethod_GoToPayment_btn|
    |checkout_ShippingMethod_ItemImage_img|
        
 @R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3779 @ZYP_CHECKOUT_K3779-10877 @CR-RKA
Scenario: Verify that user should be able to fulfill an order when cart having single item with single fulfillment option(dropship to home)
Given user launches the browser and navigates to "ASO_HOME" page 
When User searches a product "productName" and navigates to PDP
Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	
	Then Shipping radio button is selected by default
   When user will click on Checkout button and navigates to Checkout page
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page
    Then Verify below Sub/Main Module of Checkout Page
    |#verify following is being displayed |
    |checkout_ShippingMethod_ShippingMethodHeader_txt|
    |checkout_ShippingMethod_GoToPayment_btn|
    |checkout_ShippingMethod_ItemImage_img|


@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3779 @ZYP_CHECKOUT_K3779-10878 @CR-RKA
Scenario: Verify that user should be able to fulfill an order when cart having single item like SOF products with single fulfillment option(dropship to store)

Given user launches the browser and navigates to "ASO_HOME" page
When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user click on Make My store button	
#Then user navigate to GunStorageAndSafty L_Three   
#    Then user select the product from L_Three and navigate to PDP
 
 When User searches a product "SOFSKUNumber" and navigates to PDP
    And user click on Add to Cart Button 
   And user will click on View Cart button
   When user will click on Checkout button and navigates to Checkout page
And user does accepts the firearm specific compliance 
	And user clicks on Continue button	
    Then verify that user navigates to payment drawer
		And Verify below Sub/Main Module of Checkout Page 
	|#verify following element is display after click on checkout page|
	|BillingInformation_Txt|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
#		|SendSMSTextUpdatesAboutMyOrder_checkbox|
		|Adderss_Input|
		|ZipCode_Input|
		|City_Input|
		|State_DD|
		|EmailAddressforOrderConfirmation_Input|
		|SignuptogetHotDeals_checkBox|
		|ReviewOrder_Btn|
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3779 @ZYP_CHECKOUT_K3779-10913 @CR-RKA
Scenario: Verify that user should be able to fulfill an order when cart having multiple items like SOF products with single fulfillment option(dropship to store)

Given user launches the browser and navigates to "ASO_HOME" page
When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user click on Make My store button	
#Then user navigate to GunStorageAndSafty L_Three   
#    Then user select the product from L_Three and navigate to PDP
 When User searches a product "SOFSKUNumber" and navigates to PDP
    And user click on Add to Cart Button 
   And user will click on View Cart button
When user will click on Checkout button and navigates to Checkout page
And user does accepts the firearm specific compliance 
	And user clicks on Continue button	
    Then verify that user navigates to payment drawer
		And Verify below Sub/Main Module of Checkout Page 
	|#verify following element is display after click on checkout page|
	|BillingInformation_Txt|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
#		|SendSMSTextUpdatesAboutMyOrder_checkbox|
		|Adderss_Input|
		|ZipCode_Input|
		|City_Input|
		|State_DD|
		|EmailAddressforOrderConfirmation_Input|
		|SignuptogetHotDeals_checkBox|
		|ReviewOrder_Btn|


  
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3779 @ZYP_CHECKOUT_K3779-10932 @CR-RKA
Scenario: Scenario:Verify that user should be able to fulfill an order when cart having multiple item with single fulfillment option( ship from store)
Given user launches the browser and navigates to "ASO_HOME" page
When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user click on Make My store button	
	When User searches a product "productName" and navigates to PDP
	Then user click on Add to Cart Button 
	And user will click on View Cart button
 And user clicks on one of the category and navigates to LOne page
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
    And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user will click on View Cart button
 When user will click on Checkout button and navigates to Checkout page
When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page
    Then Verify below Sub/Main Module of Checkout Page
    |#verify following is being displayed |
    |checkout_ShippingMethod_ShippingMethodHeader_txt|
    |checkout_ShippingMethod_GoToPayment_btn|
    |checkout_ShippingMethod_ItemImage_img|











