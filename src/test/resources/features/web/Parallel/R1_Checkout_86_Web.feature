Feature: PLCC: Checkout_Payment Using PLCC  

	Background: Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page plcc
#	When user click on My Account link 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Email_OrderPlacement" 
	And user enter the valid password "passwordPlcc" 
	And user click on signin button
	
	Then user navigates to ASO-Home page 
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	And user clears everything in cart 
	When user enters "SKUIdOfProduct" in the search box plcc 
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page
	
	@C-PLCC @Regression @All @PLCC-86 @CR-VS
	Scenario: Verify the default payment method when tries to  place an another order
	When user handles adding new card "ValidPLCCCard" if already card is saved 
	And user click on REVIEW ORDER button
	And user click on PLACE ORDER button
	Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	#And user expect element print link to be present
	And user expect element my account link to be present
	When user enters "SKUIdOfProduct" in the search box plcc
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page
	And user click on PLACE ORDER button
	Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	#And user expect element print link to be present
	And user expect element my account link to be present
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	
@TC-OMNI-13452 @RegressionP3															
Scenario: Verify user is able to apply PLCC card through cart banner in the cart page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user click on cart icon
	When user click on apply button 
	When user enter First Name on credit card Application Modal "FirstName" 
	Then user enter Last Name on credit card Application Modal "LastName" 
	And user enter Last four SSN "Last4DigitsOfSSN" 
	And user enetr Date of Birth "DOB" 
	And user enter Annual Income "AnnualIncome" 
	And user enter Street Address "StreetAddress" 
	And user enter Suite or Apartment "SuiteOrApartment" 
	And user enter City "City" 
	And user select State "State" 
	And user enter Zip Code on credit card Application Modal "ZipCode" 
	And user enter Email Address on credit card Application Modal "EmailId" 
	And user enter Confirm Email Address "ConfirmEmailId" 
	And user enter Mobile Phone "MobilePhone" 
	And user enter Alternate Phone "AlternatePhone" 
	When user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT  
	When user click on SUBMIT button 
	And user select credit application modal agree message 
    When user click on SUBMIT button 
#    Then user expect element WELCOME ALWAYS APPROVE!
    Then user expect element Application Under Review Text to be present
						  
	@C-PLCC @Regression @All @PLCC-86 @CR-VS 
	Scenario: Verify user is able to change default PLCC credit card to other credit on payment section of checkout page
	When user handles adding new card "ValidPLCCCard" if already card is saved
	And user click on REVIEW ORDER button
	And user click on PLACE ORDER button
	Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	#And user expect element print link to be present
	And user expect element my account link to be present
	When user enters "SKUIdOfProduct" in the search box plcc
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page
	And user clicks on edit link on payment section
	And user select add new card option
	When user handles adding new card "ValidPLCCCard" if already card is saved
	And user click on confirm button plcc
	And user clicks on edit link on payment section
	And user click on credit card drop down
	And user select add new card option
	When user handles adding new card "ValidVISACard" if already card is saved
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvv"
	And user click on confirm button plcc
	And user clicks on edit link on payment section
	And user click on credit card drop down
	And user select add new card option
	When user handles adding new card "ValidMasterCard" if already card is saved
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvv"
	And user click on confirm button plcc
	And user clicks on edit link on payment section
	And user click on credit card drop down
	And user select add new card option
	When user handles adding new card "ValidAmexCard" if already card is saved
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvvAmex"
	And user click on confirm button plcc
	And user clicks on edit link on payment section
	And user click on credit card drop down
	And user select add new card option
	When user handles adding new card "ValidDiscoverCard" if already card is saved
	And user enter cvv "cvv"
	And user click on confirm button plcc

	
	
	
	
	
	