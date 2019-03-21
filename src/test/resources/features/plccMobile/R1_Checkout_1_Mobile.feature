Feature: PLCC: Checkout - Sign In Link for Guest User for Mobile

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user click on expand all Academy services
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal
	
@C-PLCC @Regression @All @PLCC-1 @CR-Manju @Mobile
Scenario: Verify User is able to get the Approved Modal for guest User
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
	And user click on Academy Logo Icon
	When user enters "SKUIdOfProduct" in the search box plcc for mobile
	And user click on search icon for mobile
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page
	And user expecte element Sign in link for guest user
	
#@C-PLCC @Regression @All @PLCC-1 @CR-Manju @Mobile
#Scenario: Verify the Signin Link for Guest user available on Check out page
#	When user enter First Name on credit card Application Modal "FirstName" 
#	Then user enter Last Name on credit card Application Modal "LastName"
#	And user enter Last four SSN "Last4DigitsOfSSN"
#	And user enetr Date of Birth "DOB" 
#	And user enter Annual Income "AnnualIncome" 
#	And user enter Street Address "StreetAddress" 
#	And user enter Suite or Apartment "SuiteOrApartment" 
#	And user enter City "City" 
#	And user select State "State" 
#	And user enter Zip Code on credit card Application Modal "ZipCode" 
#	And user enter Email Address on credit card Application Modal "EmailId" 
#	And user enter Confirm Email Address "ConfirmEmailId" 
#	And user enter Mobile Phone "MobilePhone" 
#	And user enter Alternate Phone "AlternatePhone" 
#	And user click on CONTINUE button 
#	And user verify presence of STEP2: CONSENT
#	And user select credit application modal agree message 
#	When user click on SUBMIT button
#	#Then user navigates to credit card approval modal
#	When user click on continue to checkout button
#	Then user navigates to cart page
#	When user enters "SKUForBuyNow" in the search box plcc
#	And user click on search icon
#	And user click on Add to Cart button
#	And user click on checkout from ATC pop up plcc
#	And user clicks on checkout button and navigates to checkout page
#	And user expect element Order Summary to be present
#	And user expecte element Sign in link for guest user
	#And user expect element
		

	

	
	

	
	
	