Feature: B10-500 - Buy Now Checkout Error Conditions

#   #Defect-KER-14238--Functionality is not working
#@R2_Web  @R2_All @P-low @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K7040-8907 @CR-MS
#Scenario: Verify that Authenticated user is NOT able proceed to checkout if payment information fails fraud check
# Given user launches the browser and navigates to "ASO_HOME" page
#    And user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "userhavingfraudcreditcard" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUForBuyNow" and navigates to PDP
#    Then Verify below Sub/Main Module of PDP
#    |#Verify following elements in PDP modal popup|
#    |Default_Payment_Option_btn|
#    When User clicks on Enable Buy Now button
##    Then verify the error message
#
#@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K6655-12028 @CR-MS
#Scenario: Verify that Authenticated user is able proceed to checkout by adding payment details in Payment Form modal if existing credit card has been expired
# Given user launches the browser and navigates to "ASO_HOME" page
#    And user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "userhavingexpiredcreditcard" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUForBuyNow" and navigates to PDP
#    Then Verify below Sub/Main Module of PDP
#    |#Verify following elements in PDP modal popup|
#    |Default_Payment_Option_btn|
#    When User clicks on Enable Buy Now button
##    Then verify the error message

@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K6655-8906 @CR-MS
Scenario: Verify that user is able to proceed with checkout if user does not selects required product attributes
 Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBuyNow" and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Default_Payment_Option_btn|
    When User clicks on Enable Buy Now button
#   Then user verifies the order number

@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K6655-11946 @CR-MS
Scenario: Verify that user is able to proceed with checkout if user does not selects required product attributes
 Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "OutOfStockSKUNumber" and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Default_Payment_Option_btn|
    When User clicks on Enable Buy Now button
#   Then user verifies the order number

@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K6655-12030 @CR-MS
Scenario: Verify that if Prop65 shipping restricted to CA, and user has CA as default address in profile then error message is displayed and Buy Now is disabled on the PDP
 Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithDefaultCaliforniaAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBuyNow" and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Default_Payment_Option_btn|
    When User clicks on Enable Buy Now button
#    Then verify the error message

@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K6655-12031 @CR-MS
Scenario: Verify that if Prop65 shipping restricted to CA, and user has CA as default address in profile then error message is displayed on checkout
 Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithDefaultCaliforniaAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBuyNow" and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Default_Payment_Option_btn|
    When User clicks on Enable Buy Now button
#    Then verify the error message

@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K6655-11947 @CR-MS
Scenario: Verify that Buy Now CTA is not displayed when shipping method and/ or shipping method price are not fetched
 Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutShipDetails" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBuyNow" and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |EnableBuyNow_btn|
    
@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K6655-12032 @CR-MS
Scenario: Verify that user should be displayed with error message if they try to ship restricted items to restricted shipping address
 Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithDefaultCaliforniaAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SOFSKUNumber" and navigates to PDP
	Then user should not able to see the Enable BUY NOW button on the PDP     
   
@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K6655-12033 @CR-MS
Scenario: Verify that if Prop65 shipping restricted to CA, and user has CA as default address in profile then error message is displayed on checkout
 Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithDefaultCaliforniaAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBuyNow" and navigates to PDP
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Default_Payment_Option_btn|
    When User clicks on Enable Buy Now button
#    Then verify the error message

@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K6655-8903 @CR-MS
Scenario: Verify that user should be displayed with error message if they try to ship restricted items to restricted shipping address
 Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithDefaultCaliforniaAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SOFSKUNumber" and navigates to PDP
	Then user should not able to see the Enable BUY NOW button on the PDP
	
@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-7040 @ZYP_CHECKOUT_K6655-8908 @CR-MS
Scenario: Verify that user should be displayed with error message if they try to ship restricted items to restricted shipping address
 Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithDefaultCaliforniaAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "OutOfStockSKUNumber" and navigates to PDP
	Then user should not able to see the Enable BUY NOW button on the PDP	





 




