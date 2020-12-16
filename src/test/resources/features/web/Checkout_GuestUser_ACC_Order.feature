Feature: CHECKOUT - Apply discount for guest user on Academy Credit Card as Tender type

@Web @Regression @P1 @CR-MT	@RegressionP1 @TC-OMNI-13475
Scenario: Verfiy discount is applied for guest user place order with ACC as tender 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
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
	
	
	
   @RegressionP2   @TC-OMNI-13528
Scenario: Validate for guest user when the order total is equal to and above $34.99, then shipping should be free. Verify the charges on checkout and order confirmation screen and order details page also
   Given user launches the browser and navigates to "ASO_HOME" page 
   And User should be able to click on Find Store 
   And Find Store Modal should pop-up 
   When User select store with "BOPIS_OrderID_Zipcode"
   And User searches a product "RegularItemabove" and navigates to PDP 
   And user click on ship it button
   And user click on viewcart button
   Then user navigates to Cart Page
   And user validates that free shipping is applied
   And user clicks on checkout button on cart page
   And validates that shipping is free on order summary
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
  And Validate that shipping is free on order confirmation page 
   
	
	
	
	 @RegressionP2 @TC-OMNI-13529
   Scenario: Validate for registered user if the order total equal to and above 24.99, then user should have free shipping. Verify the charges on checkout and order confirmation screen and order details page also	
   Given user launches the browser and navigates to "ASO_HOME" page 
   When user clicks on SignIn link from global header
    And user enter the valid emailaddress "LoginUseruat7new"
    And user enter the valid password "Password"
    And user click on signin button
   And User should be able to click on Find Store 
   And Find Store Modal should pop-up 
   When User select store with "BOPIS_OrderID_Zipcode"
   And User searches a product "RegularItemabovereguser" and navigates to PDP 
   And user click on ship it button
   And user click on viewcart button
   Then user navigates to Cart Page
   And user validates that free shipping is applied
   And user clicks on checkout button on cart page
   And validates that shipping is free on order summary
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
  And Validate that shipping is free on order confirmation page 
	
	

	 @RegressionP2   @TC-OMNI-13530
	Scenario: Validate for registered user, when STH + BOPIS items are added and the combined order total is equal to and above 24.99, then shipping will be free for both the ship modes. Verify the charges on checkout and order confirmation screen and order details page also
   Given user launches the browser and navigates to "ASO_HOME" page 
   When user clicks on SignIn link from global header
    And user enter the valid emailaddress "LoginUseruat7new"
    And user enter the valid password "Password"
    And user click on signin button
   And User should be able to click on Find Store 
   And Find Store Modal should pop-up 
   When User select store with "BOPIS_OrderID_Zipcode"
   And User searches a product "BOPIS_item" and navigates to PDP 
   And user click on ship it button
   And user click on continue button
   And User searches a product "STH_item" and navigates to PDP
   And user click on ship it button
   And user click on viewcart button
   Then user navigates to Cart Page
   And user validates that free shipping is applied
   And user clicks on checkout button on cart page
   And validates that shipping is free on order summary
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
  And Validate that shipping is free on order confirmation page 
		
	
	@RegressionP2   @TC-OMNI-13531
Scenario: Validate for guest user, when STH + BOPIS items are added and the combined order total is equal to and above 34.99, then shipping will be free for both the ship modes. Verify the charges on checkout and order confirmation screen and order details page also
   Given user launches the browser and navigates to "ASO_HOME" page 
   And User should be able to click on Find Store 
   And Find Store Modal should pop-up 
   When User select store with "BOPIS_OrderID_Zipcode"
   And User searches a product "BOPIS_item" and navigates to PDP 
   And user click on ship it button
   And user click on continue button
   And User searches a product "STH_item" and navigates to PDP
   And user click on ship it button
   And user click on viewcart button
   Then user navigates to Cart Page
   And user validates that free shipping is applied
   And user clicks on checkout button on cart page
   And validates that shipping is free on order summary
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
  And Validate that shipping is free on order confirmation page 
	
	
	
	
	
	
	
	