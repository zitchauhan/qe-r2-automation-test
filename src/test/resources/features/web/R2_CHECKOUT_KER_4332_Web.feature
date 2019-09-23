	Feature: B10-500 - Buy Now on PDP
	
	
	@R2_Web  @R2_All @P1 @P1Temp @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-9524 @CR-AKK @C1-Message @AutomationSmokeORIG  
	Scenario: FIX STEP Capture Order No & check it in MyAccount Verify user can navigate to Order confirmation page upon clicking Buy Now and can see order in MyAccount
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBuyNow" and navigates to PDP
	Then verify the buy now button is clickable
	And user enters CVV "CVV" on Buy Now Popup modal
	And user clicks Buy Now button on Buy Now Popup modal
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|Order Number|
	
#	@R2_Web  @R2_All @P1 @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-9525 @CR-AKK @C1-Message
#Scenario: FIX STEP Capture Order No & check it in MyAccount Verify user can see order placed in MyAccount for selected single SKU
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUForBuyNow" and navigates to PDP
#	Then verify the buy now button is clickable
#	And user enters CVV "CVV" on Buy Now Popup modal
#	And user clicks Buy Now button on Buy Now Popup modal
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#	|Order Number|
#	And user click on MyAccount
#	And user click on Orders link
#	Then Verify the message on the page
#    |# Following Message should show on the page|
#	|ORDERS|
	

#COMMENTED by HP 05_23_19 All these are being covered in first scenario
#	@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-10316 @CR-AKK @C1-Message
#Scenario: Verify user can see order placed for selected single SKU on the PDP
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUForBuyNow" and navigates to PDP
#	Then verify the buy now button is clickable
#	And user enters CVV "CVV" on Buy Now Popup modal
#	And user clicks Buy Now button on Buy Now Popup modal
#	Then Verify the message on the page
#    |# Following Message should show on the page|
#	|Order Number|
#	And user click on MyAccount
#	And user click on Orders link
#	Then Verify the message on the page
#    |# Following Message should show on the page|
#	|ORDER PLACED ON|
	 
#COMMENTED by HP 05_23_19 All these are being covered in first scenario
#	@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-10318 @CR-AKK @C1-Message
#Scenario: Verify Payment information is authorized successfully Then user should be navigated to Order confirmation page
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUForBuyNow" and navigates to PDP
#	Then verify the buy now button is clickable
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#	|Order Number|

#COMMENTED by HP 05_23_19 All these are being covered in first scenario	
#		@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-10329 @CR-AKK @C1-Message
#Scenario: Verify Academy.com should not consider any persistent item(s) in my cart while placing order using "Buy Now" from PDP
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUForBuyNow" and navigates to PDP
#	Then verify the buy now button is clickable
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#	|Order Number|
#	And user click on MyAccount
#	And user click on Orders link
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#	|ORDER PLACED ON|
	
	@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-10330 @CR-AKK @C1-Message
Scenario: FIX STEPS FOR THIS SCENARIO Verify The persistent cart should not be affect and any number of item(s) in the persistent cart should remain as is while placing order using Buy Now from PDP
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBuyNow" and navigates to PDP
	Then verify the buy now button is clickable
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|Order Number|
	And user click on MyAccount
	And user click on Orders link
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|ORDER PLACED ON|
	|ORDER NUMBER|
	
	
@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-10331 @CR-AKK @C1-Message
Scenario: FIX STEPS FOR THIS SCENARIO Verify The mini cart icon on the order confirmation header should display the total count of items in persistent cart while placing order using Buy Now from PDP
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBuyNow" and navigates to PDP
	Then verify the buy now button is clickable
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|Order Number|
	And User clicks on the minicart icon and navigated to minicart
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|YOUR CART|
	
	
@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-12336 @CR-AKK
Scenario: Verify Buy Now is applicable for Bundle / Package Item(s)
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBundleProducts" and navigates to PDP
	Then verify the buy now button is clickable
	
	@R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-12337 @CR-AKK
Scenario: Verify Buy Now is applicable for Baits
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBaitProduct" and navigates to PDP
	Then verify the buy now button is clickable
	
		@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-12339 @CR-AKK
Scenario: FIX STEPS FOR THIS SCENARIO Verify Buy Now is not applicable for following items SOF Age Restriction Items Item(s) having only In store Inventory while loading PDP
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBuyNow" and navigates to PDP
	Then verify the buy now button is clickable
	
	@R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order   @KER-4332 @ZYP_CHECKOUT_K4332-10322 @CR-AKK @C1-Message
Scenario: FIX STEPS FOR THIS SCENARIO Verify Shipping address and method has errors Then user should be navigated to shipping page with proper error message
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUForBuyNow" and navigates to PDP
	Then verify the buy now button is clickable
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|Order Number|
	
	
	