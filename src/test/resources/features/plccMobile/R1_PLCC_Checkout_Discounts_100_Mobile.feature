Feature: PLCC: Discounts_5% Off 

Background: Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on burger menu 
	And user click on My Account link of mobile 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_FivePercentDiscount" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	

@C-PLCC @Regression @All @PLCC-100 @CR-Manju @Mobile
Scenario: Verify message when user applied gift card along with the discount
	When user enters "SKUIdOfProductLs15" in the search box plcc for mobile
	And user click on search icon for mobile
	And user click on Add to Cart button  
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page
	And user click on gift card link
	When user enter Gift card "ValidGiftCard"
	And user enter CVV number for Gift card "GiftCardCVV"
	And user click on gift card Apply Button
	And user expect element Gift card payment applied meesage to be present 
	
	