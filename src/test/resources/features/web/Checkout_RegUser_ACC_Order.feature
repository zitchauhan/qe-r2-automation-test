Feature: CHECKOUT Registered user Academy Credit Card Tender

@AutomationSmoke 
Scenario: Checkout -  Registered user Place Order with ACC as tender 
	Given user launches the browser and navigates to "ASO_HOME" page plcc 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	And user clears everything in cart
	When user enters "SKUIdOfProduct1" in the search box plcc 
	And user click on search icon 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page
	#And user expect element credit card text field is present 
	When user handles adding new card "ValidPLCCCard" if already card is saved 
	And user enters a corresponding billing address
	#And user check same as shipping address 
	#And user uncheck Save Payment Info for Later Checkbox 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button 
	Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	Then user able to see order number 
	And User navigates to Check Oder status Page 
	Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode" 
	And User clicks on Check button
	When User Clicks on Cancel Order link
	And user click on yes cancle my order button
    And Verify that the order cancellation confirmation page is displayed