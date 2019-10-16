Feature: BOPIS Unuthenticated Order Cancellation
		

@C-BOPIS @R2_Web @R2_All @CB-MyAccount @KER-4328 @ZYP_MYACCOUNT_K4328-10920
Scenario: Verify that the Guest user is able to navigate to check order status page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user click on the check order button available in footer
	Then Verify the message on the page 
		|# Following Message should show on the page| 
		|Order Number|
		|Billing Zip Code|

@C-BOPIS @R2_Web @R2_All @CB-MyAccount @KER-4328 @ZYP_MYACCOUNT_K4328-10923
Scenario: 	BOPIS-Verify that order is not cancelled if user clicks on No CTA on confirmation modal 	
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user click on the check order button available in footer
	And user enter the orderid "BOPIS_OrderID" and billing zipcode "BOPIS_OrderID_Zipcode"
	And user click on check button
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
      
@C-BOPIS @R2_Web @R2_All @CB-MyAccount @KER-4328 @ZYP_MYACCOUNT_K4328-10924 @HP
Scenario: BOPIS-Verify that order is gets cancelled if user clicks on Yes, Cancel my Order CTA on confirmation modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	#When User select store with "BOPIS_Store2" 
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
	Then user click on order history
	And user wait for two minute to cancel the order
	When User Clicks on Cancel Order link
	And user click on yes cancel my order button
	And user should be able to see cancellation message "BOPIS_Order_Cancel_Message"
	And user should be able to see order cancelation date
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Back_To_Order_Lnk|

@C-BOPIS @R2_Web @R2_All @CB-MyAccount @KER-4328 @ZYP_MYACCOUNT_K4328-10925
Scenario: BOPIS-Verify that UnAuthenticated User is able to navigate back to order details page from cancellation confirmation page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
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
	And user wait for two minute to cancel the order
	Then user click on order history
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Cancel_lnk|	
	When User Clicks on Cancel Order link
	And user click on yes cancel my order button
	And user should be able to see cancellation message "BOPIS_Order_Cancel_Message"
	And user should be able to see order cancelation date
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Back_To_Order_Lnk|
	And User verify Cancel Order link is not present		
		
@C-BOPIS @R2_Web @R2_All @CB-MyAccount @KER-4328 @ZYP_MYACCOUNT_K4328-10922
Scenario: Verify that for UnAuthenticated user Cancel Order CTA is displayed for orders having BOPIS items
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
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
	Then user click on order history
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Cancel_lnk|		
		
		
		
		      