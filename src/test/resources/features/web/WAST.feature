Feature: WAST

@R2_Web @R2_WAST-05 @P2 @AutomationSmoke
Scenario: TC_6-Verify and Search an item and  navigate to  View Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User should be able to see Search Box on Homepage 
	When User searches a product "productName" and navigates to PDP 
	And user verifies the entered SKU id 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user will click on View Cart button 
	Then user navigate to Cart page 
	
	#===========unit testing pending as search is not working
@R2_Web @R2_WAST-06 @P2 @AutomationSmoke
Scenario: TC_7-Verify and Search - Checkout from ATC Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User should be able to see Search Box on Homepage 
	When User searches a product "productName" and navigates to PDP 
	And user verifies the entered SKU id 
#	And user click on Add to Cart Button 
#	When user click on checkout button 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	Then user is navigated to checkout page 
	
	
@R2_Web @R2_WAST-07 @AutomationSmoke
Scenario: TC_8-Verify Cat Nav - View Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User Navigates L2 form Homepage Header 
	And User clicks on product in PLP 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	
	
@R2_Web @R2_WAST-08 @AutomationSmoke
Scenario: TC_9-Verify Cat Nav - Checkout from ATC Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User Navigates L2 form Homepage Header 
	And User clicks on product in PLP 
	#	And user click on Add to Cart Button 
#	When user click on checkout button 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	Then user is navigated to checkout page 
	
@R2_WAST-22 @BrokenLink @Broken @TC_BL_06 
Scenario: TC_25- Verify all broken URL's on Cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button
	And user click on ship it button
	And user will click on View Cart button 
	Then verfy all link url's status code is 200 
	
@R2_WAST-23 @BrokenLink @Broken @TC_BL_07 
Scenario: TC_26- Verify all broken URL's on Checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button
	And user click on ship it button
	And user click on view cart button 
	When user click on checkout button in Cart page 
	Then user is navigated to checkout page 
	Then verfy all link url's status code is 200 
	
@R2_WAST-24 @BrokenLink @Broken @TC_BL_08  
Scenario: TC_27- Verify all broken URL's on MyAccount page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then verfy all link url's status code is 200 
	
@R2_WAST-25 @BrokenLink @Broken @TC_BIM_06 
Scenario: TC_28- Verify all broken Images on Cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button
	And user click on ship it button
	And user will click on View Cart button 
	Then verfy all Image link urls status code is 200 
	
@R2_WAST-26 @BrokenLink @Broken @TC_BIM_07 
Scenario: TC_29- Verify all broken Images on Checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "productName" and navigates to PDP 
	#Then user click on Add to Cart Button
	And user click on ship it button 
	And user click on view cart button 
	When user click on checkout button in Cart page 
	Then user is navigated to checkout page 
	Then verfy all Image link urls status code is 200 
	
@R2_WAST-27 @BrokenLink @Broken @TC_BIM_08 
Scenario: TC_30- Verify all broken Images on MyAccount page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then verfy all Image link urls status code is 200 
	
@R2_WAST-27 @BrokenLink @Broken @TC_BIM_08 
Scenario: TC_30- Verify all broken Images on MyAccount page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then verfy all Image link urls status code is 200 
	
#@C-PLCC @Regression @All @PLCC-84 @CR-VS 
#Scenario: Verify user is able to place order using PLCC card
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user click on My Account link 
#	And user expect element Email Address to be present 
#	And user enter Email address in sign-in page "Email_Address_2" 
#	And user enter password in sign-in page "Password_2" 
#	And user click on Signin-button 
#	Then user navigates to ASO-Home page 
#	#And user expect element ASO Home Page Title to be present
#	When user enters "SKUIdOfProduct" in the search box 
#	And user click on search icon 
#	#Then user click on Add to Cart Button
#	#And user click on checkout from ATC pop up
#	And user click on ship it button
#	And user click on viewcart button
#	Then user navigates to Cart Page
#	And user clicks on checkout button on cart page 
#	And user clicks on checkout button and navigates to checkout page 
#	#And user selects credit card radio button
#	And user expect element credit card text field is present
#	When user enter visa card "ValidPLCCCard"
#	And user click on REVIEW ORDER button
#	And user click on PLACE ORDER button
#	Then user navigates to order confirmation page
#	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
#	And user expect element Order Number to be present
#	And user expect element a confirmation email is on its way to be present
#	And user expect element print link to be present
#	And user expect element my account link to be present
#	When user click on My Account link
#	And user click on Payments link
#	Then delete all credit cards from My Account
