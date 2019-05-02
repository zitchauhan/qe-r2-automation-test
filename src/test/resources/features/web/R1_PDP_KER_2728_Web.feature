Feature: Promotional messaging on PDP

@Regression @C-PDP @Web @All @KER-2728 @ZYP_PDP_K3728-2 @CR-AG 
Scenario: Verify that the user should be able to see promotional /marketing message on PDP if any
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	 Then User navigates to page having promo content
#	 And user able to see promo offer in grid and navigate to pdp of the product and see the same promocode in PDP
	Given user launches the browser and navigates to "ASO_HOME" page plcc 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Promotions" 
	And user enter password in sign-in page "passwordPlcc" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title wto be present
	When user enters "skuIdGr150" in the search box plcc
	And user click on search icon 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user increases quantity "ItemQuantity3" of product
 	And user click on add promo code link on cart page
 	And user element expect promo code section to be present
 	And user enter promocode "promocodeW" on cart page
 	And click on submit promo code button
 	And user clicks on checkout button on cart page
 	When user handles adding new card "ValidPLCCCard" if already card is saved
 	And user click on REVIEW ORDER button
 	And user expect discount text to be present
	 