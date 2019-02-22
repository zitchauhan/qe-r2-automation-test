Feature: PLCC: Checkout - Payment Using PLCC 

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_Promotions" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "skuIdGr150" in the search box 
	And user click on search icon 
	And user click on Add to Cart button 
	

Scenario: Verify user is able to get Annual offer of $15 off by providing the promo code
 	And usr click on view cart and navigates to cart page
 	Then user navigates to cart page
 	And user increases quantity "ItemQuantity" of product
 	And user click on add promo code link on cart page
 	And user element expect promo code section to be present
 	And user enter promocode "promocodeA" on cart page
 	And click on submit promo code button
 	And user clicks on checkout button on cart page
 	When user enter plcc card "ValidPLCCCard" 
 	And user expect discount text to be present
 	Then user expect fifteen dollars discount 
	And user click on checkout from ATC pop up
	When user click on edit my cart link 
	Then user click on remove from cart 
	And user click on remove promo card link
	
		
	