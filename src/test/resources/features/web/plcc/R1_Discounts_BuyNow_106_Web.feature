Feature: PLCC: Discounts for Buy now 


@C-PLCC @Regression @All @PLCC-106 @CR-Manju @Rahul
Scenario: Verify user can process the order for Buy Now
	Given user launches the browser and navigates to "ASO_HOME" page plcc
#	When user click on My Account link 
#	#And user expect element Email Address to be present 
#	And user enter Email address in sign-in page "Email_UserWithSavedAddressAndPayment" 
#	And user enter password in sign-in page "BuynowPwd" 
#	Then user click on Signin-button 
	
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Email_UserWithSavedAddressAndPayment" 
	And user enter the valid password "BuynowPwd" 
	And user click on signin button
	
	Then user should get logged in successfully
#	And user navigates to ASO-Home page 
	When user enters "SKUForBuyNow" in the search box plcc
	And user click on search icon 
	And user click on Buy Now button
	And user click on Buy Now button in pop up modal	
	#Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	And user expect element free shipping should be available
	And user expect discount text to be present
	Then user expect five percent discount 
