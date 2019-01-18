Feature: PLCC: Checkout - Payment Using PLCC 

Background: 
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal 
	When user enter First Name on credit card Application Modal "FirstName"
	And user enter Last Name "LastName" 
	And user enter Last four SSN "Last4DigitsOfSSN"
	And user enetr Date of Birth "DOB" 
	And user enter Annual Income "Annual Income"
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
	And user select credit application modal agree message 
	When user click on SUBMIT button
	Then user navigates to credit card approval modal 
	When user click on continue to checkout 

@C-PLCC @Regression @All @PLCC-86 @CR-VS
Scenario: Verify the default payment method when user tries to  place an another order 
	And user clicks on checkout button and navigates to checkout page 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	And user click on Add to cart button 
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	#And user selects credit card radio button
	#--Place an order using plcc card 
	#--Go to My account and check PLCC is a default card
	#also check user able to uncheck plcc as payment method
	
@C-PLCC @Regression @All @PLCC-86 @CR-VS
Scenario: Verify the default payment method when user tries to place another order with the same session
	And user clicks on checkout button and navigates to checkout page 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	And user click on Add to cart button 
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	#And user selects credit card radio button
	
	
	#--Place an order using plcc card 
	#--Go to My account and check PLCC is a default card
	#continue to shopping and place another order with same session
	
@C-PLCC @Regression @All @PLCC-86 @CR-VS
Scenario: Verify user is able to change default PLCC credit card to other credit on payment section of checkout page
	And user clicks on checkout button and navigates to checkout page 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	And user click on Add to cart button 
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	#And user selects credit card radio button
	#--Place an order using plcc card 
	#--Go to My account and check PLCC is a default card
	#And select any other payment type as default
	
@C-PLCC @Regression @All @PLCC-86 @CR-VS
Scenario: Verify the default payment method when user tries to place another order with the different session
	And user clicks on checkout button and navigates to checkout page 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	And user click on Add to cart button 
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	#And user selects credit card radio button
	#--Place an order using plcc card 
	#check Previously added Card details should be empty and allow the user to enter card details and should be able to place an order
	# Make sure no cards n account- clear all as we are using same account
	

	
	