Feature: CHECKOUT Registered user Academy Credit Card Tender

@MobileAutomationSmoke
Scenario: Checkout -  Registered user Place Order with ACC as tender 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "Email_MultiOderPlacement" 
	And user enter the valid password "passwordPlcc" 
	And user click on signin button  
	#Then user navigates to ASO-Home page 
	Given user navigate and deletes existing items in cart
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page
	When user handles adding new card "ValidPLCCCard" if already card is saved 
	#And user uncheck Save Payment Info for Later Checkbox 
	And user click on REVIEW ORDER button 
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					|
 