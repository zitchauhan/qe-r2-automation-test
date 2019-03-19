Feature: PLCC: Checkout_Saved Card 

Background: Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page 
	
@C-PLCC @Regression @All @PLCC-1 @CR-VS 
Scenario: Default ASO/PLcc credit card should be displayed on payment section for faster checkout process 
	When user enters "SKUIdOfProduct" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 
	When user handles adding new card "ValidPLCCCard" if already card is saved 
	And user check element payment section to be present 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button 
	And user navigates to order confirmation page 
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 
	And user expect element Order Number to be present 
	And user expect element a confirmation email is on its way to be present 
	And user expect element print link to be present 
	And user expect element my account link to be present 
	When user enters "SKUIdOfProduct" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page 
	Then user expect element saved card on payment section of checkout page to be present 
	And user click on PLACE ORDER button 
	Then user navigates to order confirmation page 
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 
	And user expect element Order Number to be present 
	And user expect element a confirmation email is on its way to be present 
	And user expect element print link to be present 
	And user expect element my account link to be present 
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	
@C-PLCC @Regression @All @PLCC-1 @CR-VS 
Scenario: Verify the default payment method when user tries to place an another order with the different session 
	When user enters "SKUIdOfProduct" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 
	When user handles adding new card "ValidPLCCCard" if already card is saved 
	And user check element payment section to be present 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button 
	And user navigates to order confirmation page 
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 
	And user expect element Order Number to be present 
	And user expect element a confirmation email is on its way to be present 
	And user expect element print link to be present 
	And user expect element my account link to be present 
	When user enters "SKUIdOfProduct" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page 
	Then user expect element saved card on payment section of checkout page to be present 
	And user click on PLACE ORDER button 
	Then user navigates to order confirmation page 
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 
	And user expect element Order Number to be present 
	And user expect element a confirmation email is on its way to be present 
	And user expect element print link to be present 
	And user expect element my account link to be present 
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	
	
@C-PLCC @Regression @All @PLCC-1 @CR-Manju 
Scenario: Verify User is able to get the Approved Modal for guest User 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal 
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
	And user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT 
	And user select credit application modal agree message 
	When user click on SUBMIT button 
	#Then user navigates to credit card approval modal
	When user click on continue to checkout button 
	Then user navigates to cart page 
	When user enters "SKUForBuyNow" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page 
	And user expecte element Sign in link for guest user 
	
@C-PLCC @Regression @All @PLCC-1 @CR-Manju 
Scenario: Verify the Signin Link for Guest user available on Check out page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal 
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
	And user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT 
	And user select credit application modal agree message 
	When user click on SUBMIT button 
	#Then user navigates to credit card approval modal
	When user click on continue to checkout button 
	Then user navigates to cart page 
	When user enters "SKUForBuyNow" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element Order Summary to be present 
	And user expecte element Sign in link for guest user 
	#And user expect element
	
	
