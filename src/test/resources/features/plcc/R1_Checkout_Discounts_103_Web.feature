Feature: PLCC: Checkout_Payment Annual offer of $15 

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Promotions" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "skuIdGr150" in the search box plcc
	And user click on search icon 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	When user clicks on cart icon
 	Then user navigates to cart page
	
@C-PLCC @Regression @All @PLCC-102 @CR-VS @AutomationSanityR2
Scenario: Verify user is able to get Annual offer of $15 off by providing the promo code 
 	And user increases quantity "ItemQuantity1" of product
 	And user click on add promo code link on cart page
 	And user element expect promo code section to be present
 	And user enter promocode "promocodeA" on cart page
 	And click on submit promo code button
 	And user clicks on checkout button on cart page
 	When user handles adding new card "ValidPLCCCard" if already card is saved 
 	And user click on REVIEW ORDER button
 	And user expect discount text to be present
 	Then user expect fifteen dollars discount 
	When user click on edit my cart link 
	And user click on remove promo card link
	Then user click on remove from cart 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	
	
		
	