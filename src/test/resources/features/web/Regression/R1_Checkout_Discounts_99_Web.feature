Feature: PLCC: Checkout - Free Shipping 

Background: Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Email_SavedCard" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then user navigates to ASO-Home page 
#	When user click on My Account link 
#	And user click on Payments link 
#	Then delete all credit cards from My Account 
	
@C-PLCC @All @PLCC-99 @CR-Manju @RegressionP2 @PLCC @SR-1318 @TC-OMNI-13413
Scenario: Verify user is able to get Free shipping offer with Item value >15$ 
	When user enters "SKUIdOfProductGr15" in the search box plcc 
	And user click on search icon 
	And user click on ship it button 
	And user click on viewcart button 
	Then user navigates to Cart Page 
	And user clicks on checkout button on cart page 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element free shipping should be available 
	When user click on edit my cart link 
	Then user click on remove from cart 
	
@C-PLCC @All @PLCC-99 @CR-Manju
Scenario: Verify user is unable to get Free shipping offer with Item value <15$ 
	When user enters "SKUIdOfProductLs15" in the search box plcc 
	And user click on search icon 
	And user click on ship it button 
	And user click on viewcart button 
	Then user navigates to Cart Page 
	And user clicks on checkout button on cart page 
	And user clicks on checkout button and navigates to checkout page 
	And user click on REVIEW ORDER button 
	And user expect element free shipping should not be available 
	And user expect discount text to be present 
	When user click on edit my cart link 
	Then user click on remove from cart 
	
	@C-PLCC @All @PLCC-99 @CR-Manju
Scenario: Verify user is unable to get Free shipping offer with Item value <15$ 
	When user enters "SKUIdOfProductGr25" in the search box plcc 
	And user click on search icon 
	And user click on ship it button 
	And user click on viewcart button 
	Then user navigates to Cart Page 
	And user clicks on checkout button on cart page 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element free shipping should be available
	When user click on edit my cart link
	And user expect Standard free shipping over 25$ 
	Then user click on remove from cart