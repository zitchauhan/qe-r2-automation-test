Feature: CHECKOUT - Apply discount for guest user on Academy Credit Card as Tender type

@Web @Regression @P1 @CR-MT	@RegressionP1 @abc
Scenario: Verfiy discount is applied for guest user place order with ACC as tender 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	Then user click on go to payment present in shipping method
	And user click on academy creditcard radiobtn 
	And user fills the academy credit card details in payment 
	And user enters a corresponding billing address
	And user enters order confirmation email
	And user click on REVIEW ORDER button
	And user expect discount text to be present 
	And user clicks on place order on checkout page
  Then verify user is able to successfully place the order 
	
	
	
	
	
	
	
	
	
	
	
	
	