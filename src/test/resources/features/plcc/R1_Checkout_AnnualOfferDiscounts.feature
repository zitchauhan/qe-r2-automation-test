Feature: PLCC: Checkout_Payment Using Annual Offer

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_UserWithSavedAddressAndPayment" 
	And user enter password in sign-in page "BuynowPwd" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	 
@C-PLCC @Regression @All @PLCC-101 @CR-Manju	
Scenario: Verify user is able to get Annual offer of ten Percent off by providing the promo code
	When user enters "skuIdGr150" in the search box plcc
	And user click on search icon 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
 	#And user increases quantity "ItemQuantity" of product
 	And user click on add promo code link on cart page
 	And user element expect promo code section to be present
 	And user enter promocode "promocodeA" on cart page
 	And click on submit promo code button
 	And user clicks on checkout button on cart page
 	And user click on REVIEW ORDER button
 	And user expect element Order Summary to be present
 	And user expect discount text to be present
 	Then user expect ten percent discount 
	When user click on edit my cart link 
	And user click on remove promo card link
	Then user click on remove from cart 
	
