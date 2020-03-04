Feature: Add to cart via URL for simple products - Non Signed in user

 
	@OMNI-2295 @C-Order @Regression @CR-SB @C-Checkout @Web
	Scenario: Verify for DSV item from vendor which have lead day greater than 3, google pay option is not visible under 
	payments in checkout page
	
		Given user launches the browser and navigates to "ASO_HOME" page
		And User searches a product "DSV_Vendor" and navigates to PDP
		And user click on ship it button
		And user click on viewcart button
		Then user navigates to Cart Page
		And user clicks on checkout button on cart page
		And user adds shipment address on checkout page for "guest" user
		And user selects shipment method on check out page for "guest" user
		And user verify "GooglePay" option is not displayed
		
			
		
	@OMNI-2295 @C-Order @Regression @CR-SB @C-Checkout @Web 
	Scenario Outline: Verify for DSV item from vendor which have lead day greater than 3, google pay option is not visible under payments in checkout page and user places order with other payment option
	
#payment is not working current because of captcha visible on review order	
		Given user launches the browser and navigates to "ASO_HOME" page
		And User searches a product "DSV_Vendor" and navigates to PDP
		And user click on ship it button
		And user click on viewcart button
		Then user navigates to Cart Page
		And user clicks on checkout button on cart page
		And user adds shipment address on checkout page for "guest" user
		And user selects shipment method on check out page for "guest" user
		And user verify "GooglePay" option is not displayed
		And user add "<Payment Type>" details in payment method for "guest" user
		And user clicks on place order on checkout page 
		Then verify user is able to successfully place the order
		Examples: 
		|Payment Type	|
		|Credit Card - VISA	| 
		
	
	@OMNI-2295 @C-Order @Regression @CR-SB @C-Checkout @Web 
	Scenario: Verify user should not see GooglePay option for multi product order in which one item is a DSV item fromd vendor with lead day greater than 3
	
		Given user launches the browser and navigates to "ASO_HOME" page
		And User searches a product "DSV_Vendor" and navigates to PDP
		And user click on ship it button
		And user click on viewcart button
		And User searches a product "productName" and navigates to PDP
		And user click on ship it button
		And user click on viewcart button
		Then user navigates to Cart Page
		And user clicks on checkout button on cart page
		And user adds shipment address on checkout page for "guest" user
		And user selects shipment method on check out page for "guest" user
		And user verify "GooglePay" option is not displayed
		
		
	@OMNI-2295 @C-Order @Regression @CR-SB @C-Checkout @Web 
	Scenario: Verify for DSV item from vendors which have lead day less than or equal to 3, GooglePay option is visible under Payment section
	
		Given user launches the browser and navigates to "ASO_HOME" page
		And User searches a product "dsv_sku" and navigates to PDP
		And user click on ship it button
		And user click on viewcart button
		Then user navigates to Cart Page
		And user clicks on checkout button on cart page
		And user adds shipment address on checkout page for "guest" user
		And user selects shipment method on check out page for "guest" user
		Then user click on googlePay radiobtn
		And user click on googlePay checkout button
		#Then user switch to iframe and enter the google login "GooglePayEmail_New" "GooglePayPassword_New" and places order	 
		#And user is navigated to order confirmation page and captures order number
		
	@OMNI-2295 @C-Order @Regression @CR-SB @C-Checkout @Web
	Scenario: Verify GooglePay option is not visible for DSV item from vendor which have lead day greater than 3 for logged in user
	
	#login is not working current because of captch
		Given user launches the browser and navigates to "ASO_HOME" page
		And user clicks on SignIn link from global header 
		And user logs in as "UserWithSavedAddressAndPayment" 
		And user navigate and deletes existing items in cart 	
		And User searches a product "DSV_Vendor" and navigates to PDP
		And user click on ship it button
		And user click on viewcart button
		Then user navigates to Cart Page
		And user clicks on checkout button on cart page
		And user adds shipment address on checkout page for "guest" user
		And user selects shipment method on check out page for "guest" user
		And user verify "GooglePay" option is not displayed
  
	
	 	