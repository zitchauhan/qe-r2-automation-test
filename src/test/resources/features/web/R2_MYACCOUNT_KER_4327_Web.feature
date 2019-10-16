Feature: B06-280 - BOPIS Authenticated Order Cancellation 

@C-BOPIS @R2_Web  @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order   @KER-4327 
@ZYP_MYACCOUNT_K4327-10912 @CR-MS 
Scenario: 
	Verify that for Authenticated user Cancel Order CTA is displayed for orders having BOPIS items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then user click on checkout button 
	Then user click on review order button 
	And user able to see the button place order 
	And user navigates from Order successful page to Orders in my account 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_View_Details_Btn|
	When user click on view Details 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Cancel_lnk|
		
@C-BOPIS @R2_Web @R2_All @CB-MyAccount @KER-4327 @ZYP_MYACCOUNT_K4327-10917
Scenario: Verify that Authenticated User is able to navigate back to order details page from cancellation confirmation page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	When user clicks on Go to payment CTA
	Then user click on paypal radiobtn
	And user click on paypal checkout button
	Then user switch to iframe and enter the paypal login "PayPalEmail" "PayPalPassword" 
	And user able to see the button place order
	And user is navigated to order confirmation page and captures order number
	And user click on MyAccount  
	When user click on Orders link
	And user wait for two minute to cancel the order
	Then user click on view Details
	When User Clicks on Cancel Order link
	And user click on yes cancel my order button
	When User clicks on Back to Order details Link on cancellation confirmation page 
	And User verify Cancel Order link is not present
		
@C-BOPIS @R2_Web @R2_All @CB-MyAccount @KER-4327 @ZYP_MYACCOUNT_K4327-10915 
Scenario: 	BOPIS-Verify that order is not cancelled if user clicks on No CTA on confirmation modal 	
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	And user click on MyAccount  
	When user click on Orders link
	Then user click on view Details having orderid "BOPIS_NOT_Processed_Order"
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Cancel_lnk|
	When User Clicks on Cancel Order link
	And user click on NO button
	Then user should not be able to see order cancel modal pop up
	Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | MyAccount_OrderDetailsPage_SubTotalAmount              |
      | Order_Taxes_Price                                      |
      | Order_OrderTotal                                       |
      | Order_Bopis_In_Store_Pickup_txt                        |
      | MyAccount_OrderDetailsPage_SubTotalAmount              |
      #| #Order_Bopis_Print_Receipt_lnk                          |
		
@C-BOPIS @R2_Web @R2_All @CB-MyAccount @KER-4327 @ZYP_MYACCOUNT_K4327-10916
Scenario: BOPIS-Verify that order is gets cancelled if user clicks on Yes, Cancel my Order CTA on confirmation modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	When user clicks on Go to payment CTA
	Then user click on paypal radiobtn
	And user click on paypal checkout button
	Then user switch to iframe and enter the paypal login "PayPalEmail" "PayPalPassword" 
	And user able to see the button place order
	And user is navigated to order confirmation page and captures order number
	And user click on MyAccount  
	When user click on Orders link
	And user wait for two minute to cancel the order
	Then user click on view Details
	When User Clicks on Cancel Order link
	And user click on yes cancel my order button
	And user should be able to see cancellation message "BOPIS_Order_Cancel_Message"
	And user should be able to see order cancelation date
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Back_To_Order_Lnk|
	
@C-BOPIS @R2_Web @R2_All @CB-MyAccount @KER-4327 @ZYP_MYACCOUNT_K4327-10914
Scenario: 	BOPIS-Verify that order is not cancelled if user clicks on No CTA on confirmation modal 	
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	And user click on MyAccount  
	When user click on Orders link
	Then user click on view Details having orderid "BOPIS_NOT_Processed_Order"
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Cancel_lnk|
	When User Clicks on Cancel Order link
	Then Verify the message on the page 
		|#verify the message|
		| ARE YOU SURE YOU WANT TO CANCEL THIS ORDER?| 	
