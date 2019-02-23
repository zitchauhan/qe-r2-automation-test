Feature: PLCC: Checkout - Payment Using PLCC 

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "skuIdGr150" in the search box 
	And user click on search icon 
	And user click on Add to Cart button 

Scenario: Verify user is able to get Annual offer of $15 off by providing the promo code
 	And usr click on view cart and navigates to cart page
 	And user click on add promo code link on cart page
 	And user enter promocode on cart page
 	And click on submit promo code button
 	And user clicks on checkout button and navigates to checkout page 
 	Then user expect fifteen dollars discount 
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 