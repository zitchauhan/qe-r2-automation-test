Feature: PLCC: Checkout - Payment Using PLCC 

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_UserWithSavedAddressAndPayment" 
	And user enter password in sign-in page "BuynowPwd" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	 
@C-PLCC @Regression @All @PLCC-101 @CR-Manju @AutomationSanityR2
Scenario: Verify user is able to get Welcome offer of ten Percent off by providing the promo code
	When user enters "skuIdGr150" in the search box plcc
	And user click on search icon 
	And user click on Add to Cart button 
 	And usr click on view cart and navigates to cart page
 	Then user navigates to cart page
 	And user click on add promo code link on cart page
 	And user element expect promo code section to be present
 	And user enter promocode "promocodeW" on cart page
 	And click on submit promo code button
 	And user clicks on checkout button on cart page
 	And user click on REVIEW ORDER button
 	And user expect element Order Summary to be present
 	And user expect discount text to be present
 	Then user expect ten percent discount 
	When user click on edit my cart link 
	And user click on remove promo card link
	Then user click on remove from cart 