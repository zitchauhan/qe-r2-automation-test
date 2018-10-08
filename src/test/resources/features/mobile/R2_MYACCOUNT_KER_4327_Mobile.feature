Feature: B06-280 - BOPIS Authenticated Order Cancellation 

@C-BOPIS @R2_Mobile @R2_All @P-High_Order @C-Order @CC-MyAccount_Order @KER-4327 
@ZYP_MYACCOUNT_K4327-10912 @CR-MS 
Scenario: 
	Verify that for Authenticated user Cancel Order CTA is displayed for orders having BOPIS items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And user click on checkout button in Cart page 
	Then user click on review order button 
	And user able to see the button place order 
	Then User clicks on the burger menu 
	And user navigates from Order successful page to Orders in my account 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_View_Details_Btn|
	When user click on view Details 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Cancel_lnk|
		
@C-BOPIS @R2_Mobile @R2_All @P-High_Order @1HR_R2 @C-Order @CC-MyAccount_Order @KER-4327 
@ZYP_MYACCOUNT_K4327-10917 @CR-MS 
Scenario: 
	BOPIS-Verify that Authenticated User is able to navigate back to order details page from cancellation confirmation page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user click on MyAccount 
	And user click on Orders link 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_View_Details_Btn|
	And user click on view Details 
	Then User clicks on the burger menu 
	And user click on MyAccount 
	And user click on Orders link 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_View_Details_Btn|
		
@C-BOPIS @R2_Mobile @R2_All @P-High_Order @C-Order @CC-MyAccount_Order @KER-4327 
@ZYP_MYACCOUNT_K4327-10915 @CR-MS 
Scenario: 
	BOPIS-Verify that order is not cancelled if user clicks on No CTA on confirmation modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And user click on checkout button in Cart page 
	Then user click on review order button 
	And user able to see the button place order 
	Then User clicks on the burger menu 
	And user navigates from Order successful page to Orders in my account 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_View_Details_Btn|
	And user click on view Details 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Back_To_Order_Lnk|
		|Order_Cancel_lnk|
	When User Clicks on Cancel Order link 
	And User clicks on No Button on confirmation modal 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Back_To_Order_Lnk|
		|Order_Cancel_lnk|
		
@C-BOPIS @R2_Mobile @R2_All @P-Low @C-Order @CC-MyAccount_Order @KER-4327 
@ZYP_MYACCOUNT_K4327-10914 @CR-MS 
Scenario: BOPIS-Verify the elements of order cancel confirmation modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And user click on checkout button in Cart page 
	Then user click on review order button 
	And user able to see the button place order 
	Then User clicks on the burger menu 
	And user navigates from Order successful page to Orders in my account 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_View_Details_Btn|
	And user click on view Details 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Back_To_Order_Lnk|
		|Order_Cancel_lnk|
	When User Clicks on Cancel Order link 
	Then Verify the message on the page 
		|#verify the message|
		| ARE YOU SURE YOU WANT TO CANCEL THIS ORDER?| 
		
		#Defect-KER-13721
@C-BOPIS @R2_Mobile @R2_All @P-Low @C-Order @CC-MyAccount_Order @KER-4327 
@ZYP_MYACCOUNT_K4327-10914 @CR-MS 
Scenario: 
	BOPIS-Verify that order is gets cancelled if user clicks on Yes, Cancel my Order CTA on confirmation modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And user click on checkout button in Cart page 
	Then user click on review order button 
	And user able to see the button place order 
	Then User clicks on the burger menu 
	And user navigates from Order successful page to Orders in my account 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_View_Details_Btn|
	And user click on view Details 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Back_To_Order_Lnk|
		|Order_Cancel_lnk|
	When User Clicks on Cancel Order link 
	Then Verify the message on the page 
		|#verify the message|
		| ARE YOU SURE YOU WANT TO CANCEL THIS ORDER?| 	
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in my account order details|
		|Order_Back_To_Order_Lnk|
		
@C-BOPIS @R2_Mobile @R2_All @P-Highest @C-Order @CC-MyAccount_Order @KER-4327 
@ZYP_MYACCOUNT_K4327-10920 @CR-MS 
Scenario: 
	Verify that the Guest user is able to navigate to check order status page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User navigates to Check Oder status Page 
	Then Verify the message on the page 
		|# Following Message should show on the page| 
		|Order Number|
		|Billing Zip Code|    
		
    