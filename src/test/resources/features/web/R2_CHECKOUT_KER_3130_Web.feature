Feature: [Web] Billing Address Verification

  @R2_Web  @P-Medium @C-Checkout @KER-3130 @ZYP_CART_K3132-9552 @CR-AG
  Scenario: Verify user gets the form field validation error on leaving mandatory name/address fields blank
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
   #And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button 
    And user click on checkout button
    And user adds shipment address on checkout page for "guest" user
    And user selects shipment method on check out page for "guest" user
    Then user uncheck the checkbox for Billing address different from shipping address
    Then user clicks on the Review order button
    And user validates error msg displayed for all required fields

  @R2_Web   @P1 @1HR_R2 @C-Order @CC-Checkout_Order @KER-3130 @ZYP_CART_K3132-9554 @ZYP_CART_K3132-9557 @CR-AG
  Scenario Outline: Verify user gets the form field validation error on leaving mandatory name/address fields blank
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    #And user click on Add to Cart Button 
		And user click on ship it button
		And user click on viewcart button
		And user click on checkout button
    And user adds shipment address on checkout page for "guest" user
    And user selects shipment method on check out page for "guest" user
    And user verifies visa card entery in the card fields
    Then user uncheck the checkbox for Billing address different from shipping address
    And user enter alternative person FirstName "PickupFirstName"
    And user enter alternative person LastName "PickupLastName"
    And user can enter the alternative person phone number "PhoneNumber"
    And user enter Address field "UpdateAddress"
    And user enter ZipCode field "UpdateZipcode"
    #And user enter alternative person Email "PickupEmail"
    Then user clicks on the Review order button
    Then user see the form validation error for email field
    #And user able to see the button place order
    Examples: 
		|Payment Type	|
		|Credit Card - VISA	|
  
  @R2_Web  @P-Medium   @C-Checkout @KER-3130 @ZYP_CART_K3132-9560 @CR-AG
  Scenario: Verify user gets the form field validation error on leaving mandatory name/address fields blank
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    #And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button
	And user click on checkout button
    And user adds shipment address on checkout page for "guest" user
    And user selects shipment method on check out page for "guest" user
    And user verifies visa card entery in the card fields
    Then user uncheck the checkbox for Billing address different from shipping address
    And user enter alternative person FirstName "PickupFirstName"
    And user enter alternative person LastName "PickupLastName"
    And user can enter the alternative person phone number "PhoneNumber"
    And user enter Address field "Address1"
    And user enter ZipCode field "UpdateZipcode"
    And user enter alternative person Email "PickupEmail"
    And User verifies that city and State are populated automatically

  @R2_Web   @P-Medium  @C-Checkout @KER-3130 @ZYP_CART_K3132-9564 @CR-AG 
  Scenario: Verify user gets the form field validation error on leaving mandatory name/address fields blank
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    #And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button
	And user click on checkout button
    And user adds shipment address on checkout page for "guest" user
    And user selects shipment method on check out page for "guest" user
    And user verifies visa card entery in the card fields
    Then user uncheck the checkbox for Billing address different from shipping address
    And user enter alternative person FirstName "PickupFirstName"
    And user enter alternative person LastName "PickupLastName"
    And user can enter the alternative person phone number "InvalidPhoneNumber"
    And user enter Address field "Address1"
    And user enter ZipCode field "WrongzipCode"
    And user enter alternative person Email "InvalidEmailAddresswithoutdomain"
    Then user clicks on the Review order button
    And user able to see error msgs for Phone Email Zip Address fields
    
  @RegressionP2
  Scenario: Verify user should not be able to place order for more than the limit in a single day for MULTIPLE RESTRICTED ITEMS items with the same billing address
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "BOPIS_Store_Selection"
	When user enters "Limited_Stock1" in the search box
  Then user should be able to see PDP mention in the current url
  Then user verifies the restricted message is visible on "PDP"
  And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user verifies the restricted message is visible on "Cart"
	When user enter qty more then the limit qty by "3"
	Then user should get message item is limited to qty per order
	When user enters "Limited_Stock2" in the search box
  Then user should be able to see PDP mention in the current url
  Then user verifies the restricted message is visible on "PDP"
  And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user verifies the restricted message is visible on "Cart"
	When user enter qty more then the limit qty by "3"
	Then user should get message item is limited to qty per order
	And user click on checkout button in Cart page 
  And user adds shipment address on checkout page for "guest" user
  Then user click on Go To Shipping Method button in Checkout page
  Then user click on go to payment present in shipping method
  And user click on academy creditcard radiobtn
  And user fills the academy credit card details in payment
  And user enters a corresponding billing address
  And user enters order confirmation email
  And user click on REVIEW ORDER button
  And user expect discount text to be present
  And user clicks on place order on checkout page
  Then verify user is able to successfully place the order
  When user enters "Limited_Stock1" in the search box
  Then user should be able to see PDP mention in the current url
  Then user verifies the restricted message is visible on "PDP"
  And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user click on checkout button in Cart page 
  And user adds shipment address on checkout page for "guest" user
  Then user click on Go To Shipping Method button in Checkout page
  Then user click on go to payment present in shipping method
  And user click on academy creditcard radiobtn
  And user fills the academy credit card details in payment
  And user enters a corresponding billing address
  And user enters order confirmation email
  And user click on REVIEW ORDER button
  And user expect discount text to be present
  And user clicks on place order on checkout page
  Then user sees the restriction error message on checkout page
    
    
    
    
    
 
