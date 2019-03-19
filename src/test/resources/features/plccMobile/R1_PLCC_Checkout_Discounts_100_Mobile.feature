Feature: PLCC: Discounts_5% Off_Mobile 

Background: Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on burger menu 
	And user click on My Account link of mobile
	And user enter Email address in sign-in page "Email_FivePercentDiscount" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	And user clears everything in cart
	And user click on Academy Logo Icon
	Then user navigates to ASO-Home page 

@C-PLCC @Regression @All @PLCC-100 @CR-VS @Mobile	
Scenario: Verify user is able to get 5% discount for any of the item in academy application
    When user enters "SKUIdOfProductLs15" in the search box plcc for mobile
	And user click on search icon for mobile
	And user click on Add to Cart button
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	When user handles adding new card "ValidPLCCCard" if already card is saved
	And user click on REVIEW ORDER button
	And user expect element Order Summary to be present
	And user expect discount text to be present 
	Then user expect five percent discount 
	And user expect element free shipping should not be available
	And user clears everything in cart
	And user click on Academy Logo Icon
	And user navigates to ASO-Home page 
	When user click on burger menu 
	And user click on My Account link of mobile
	And user click on Payments link
	Then delete all credit cards from My Account
	
@C-PLCC @Regression @All @PLCC-100 @CR-VS @Mobile
Scenario: Verify user is able to apply 5% discount along with free shipping offer
    When user enters "SKUIdOfProductGr15" in the search box plcc for mobile
	And user click on search icon for mobile
	And user click on Add to Cart button
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	When user handles adding new card "ValidPLCCCard" if already card is saved
	And user click on REVIEW ORDER button
	And user expect element Order Summary to be present
	And user expect element free shipping should be available 
	And user clears everything in cart
	And user click on Academy Logo Icon
	And user navigates to ASO-Home page 
	When user click on burger menu 
	And user click on My Account link of mobile
	And user click on Payments link
	Then delete all credit cards from My Account
	