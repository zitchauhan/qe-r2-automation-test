Feature: B06-175- Mixed Cart - Order Confirmation screen

@C-BOPIS @R2_Web  @R2_All @P-Highest  @1HR_R2 @C-NonOrder @CC-Checkout_Order   @KER-2856 @ZYP_CHECKOUT_K2856-10865 @CR-RK 
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods Ship to Home and BOPIS 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When user enters "SKUForBopisProduct" in the search box 
	When user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user click on continue shopping 
	When user enters "productName" in the search box 
	And user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on checkout button in Cart page 
	And user adds shipment address on checkout page for "authenticated" user 
	And user selects shipment method on check out page for "authenticated" user 
	And user add "credit card" details in payment method for "authenticated" user 
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 
	
	@C-BOPIS @R2_Web  @R2_All @P-High_B_Order @C-NonOrder @CC-Checkout_Order   @KER-2856 @ZYP_CHECKOUT_K2856-10866 @CR-RK
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods BOPIS and SOF 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "SOFemail" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	When User searches a product "SOFSKUNumber" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on continue shopping 
	When user enters "SKUForBopisProduct" in the search box 
	When user click on Add to cart button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page 
	And Verify below Sub/Main Module of Checkout Page 
		|# Verify following section SPECIAL ORDER SHIP TO STORE in checkout page|
		|ShipToStoreforSOF_Txt|
		|ShipToStoreforSOF_compliance_Txt|
		|ShipToStoreforSOF_Payment_Btn|		
	And user does accepts the firearm specific compliance 
	And user clicks on Continue button 
	Then verify that user navigates to payment drawer 
	And user add "credit card" details in payment method for "authenticated" user 
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 
	
	@C-BOPIS @R2_Web  @R2_All @P-High_B_Order @C-NonOrder @CC-Checkout_Order   @KER-2856 @ZYP_CHECKOUT_K2856-10867 @CR-RK
    Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods SOF and Ship to Home
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	When User searches a product "SOFSKUNumber" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on continue shopping 
	When user enters "productName" in the search box 
	When user click on Add to cart button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	And user does accepts the firearm specific compliance 
	And user clicks on Continue button 
	Then verify that user navigates to payment drawer 
	And user add "credit card" details in payment method for "guest" user 
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 
	
	@C-BOPIS @R2_Web  @R2_All @P-High_B_Order @C-NonOrder @CC-Checkout_Order   @KER-2856 @ZYP_CHECKOUT_K2856-10868 @CR-RK	
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods for BOPIS, Sequence - Un authenticated user 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	When User searches a product "SOFSKUNumber" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on continue shopping 
	When user enters "productName" in the search box 
	When user click on Add to cart button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page 
	And Verify below Sub/Main Module of Checkout Page 
		|# Verify following section SPECIAL ORDER SHIP TO STORE in checkout page|
		|ShipToStoreforSOF_Txt|
		|ShipToStoreforSOF_compliance_Txt|
		|ShipToStoreforSOF_Payment_Btn|		
	And user does accepts the firearm specific compliance 
	And user clicks on Continue button 
	Then verify that user navigates to payment drawer 
	And user add "credit card" details in payment method for "guest" user 
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|Order_Bopis_In_Store_Pickup_txt|
		
	@C-BOPIS @R2_Web  @R2_All @P-High_B_Order @C-NonOrder @CC-Checkout_Order  @C1-Message  @KER-2856 @ZYP_CHECKOUT_K2856-10869 @CR-RK
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods SOF and Ship to Home 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	When User searches a product "SOFSKUNumber" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on continue shopping 
	When user enters "productName" in the search box 
	When user click on Add to cart button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	And user does accepts the firearm specific compliance 
	And user clicks on Continue button 
	Then verify that user navigates to payment drawer 
	And user add "credit card" details in payment method for "guest" user 
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 
	Then Verify the message on the page 
		|# Following Message should show on the page|
		|SPECIAL ORDER SHIP TO STORE				|
		|SHIPPING ITEMS								|