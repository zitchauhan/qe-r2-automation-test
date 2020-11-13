Feature: PLCC: CCAM_Response Modals_Existing Account

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Email_Address_2" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then user navigates to ASO-Home page
	When user click on My Account link 
  And user click on Payments link 
  Then delete all credit cards from My Account 
  And user clears everything in cart 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal


@RegressionP2 @TC-OMNI-13409
Scenario: Verify approved PLCC card saved in My account
	When user enter First Name on credit card Application Modal "FirstNamePlcc" 
	Then user enter Last Name on credit card Application Modal "LastNamePlcc"
	And user enter Last four SSN "Last4DigitsOfSSN"
	And user enetr Date of Birth "DOB" 
	And user enter Annual Income "AnnualIncome" 
	And user enter Street Address "StreetAddress" 
	And user enter Suite or Apartment "SuiteOrApartment" 
	And user enter City "City" 
	And user select State "State" 
	And user enter Zip Code on credit card Application Modal "zipcode" 
	And user enter Email Address on credit card Application Modal "EmailId" 
	And user enter Confirm Email Address "ConfirmEmailId" 
	And user enter Mobile Phone "MobilePhone" 
	And user enter Alternate Phone "AlternatePhone" 
	And user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT
	And user select credit application modal agree message 
	When user click on SUBMIT button
	#Then user navigates to existing account modal
	Then user navigates to credit card approval modal
	When user click on close icon of success modal
	Then user expect Landing page to be present 
	And user click on MyAccount
	And user clicks on payment tab
	Then user verify PLCC Credit card details in Payments	


@RegressionP2 @OMNI-13410
Scenario: verify Latest added card saved as default card in My account
	When user enter First Name on credit card Application Modal "FirstNamePlcc" 
	Then user enter Last Name on credit card Application Modal "LastNamePlcc"
	And user enter Last four SSN "Last4DigitsOfSSN"
	And user enetr Date of Birth "DOB" 
	And user enter Annual Income "AnnualIncome" 
	And user enter Street Address "StreetAddress" 
	And user enter Suite or Apartment "SuiteOrApartment" 
	And user enter City "City" 
	And user select State "State" 
	And user enter Zip Code on credit card Application Modal "zipcode" 
	And user enter Email Address on credit card Application Modal "EmailId" 
	And user enter Confirm Email Address "ConfirmEmailId" 
	And user enter Mobile Phone "MobilePhone" 
	And user enter Alternate Phone "AlternatePhone"
	And user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT
	And user select credit application modal agree message 
	When user click on SUBMIT button
	Then user navigates to credit card approval modal
	When user click on close icon of success modal
	Then user expect Landing page to be present 
	And user click on MyAccount
	And user clicks on payment tab
 	Then user verify ACC Default Card
		

@C-PLCC @Regression @All @PLCC-94 @CR-VS
Scenario: Verify the elements available on  Existing Account(FPO) model
	When user enter First Name on credit card Application Modal "FirstNameEX"  
	Then user enter Last Name on credit card Application Modal "LastNameEX"
	And user enter Last four SSN "Last4DigitsOfSSNEX"
	And user enetr Date of Birth "DOBEX" 
	And user enter Annual Income "AnnualIncomeEX" 
	And user enter Street Address "StreetAddressEX" 
	And user enter Suite or Apartment "SuiteOrApartmentEX" 
	And user enter City "CityEX" 
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
	Then user navigates to existing account modal
	And user expect element disclosure text on existing account modal to be present
	And user expect element Error Card Modal Image to be present
	And user expect element continue To Checkout button to be present
	And user expect element close icon on error modal is present
	
@C-PLCC @Regression @All @PLCC-94 @CR-VS
Scenario: Verify user is able to navigate to cart page after clicking on Continue to Checkout button
	When user enter First Name on credit card Application Modal "FirstNameEX" 
	Then user enter Last Name on credit card Application Modal "LastNameEX"
	And user enter Last four SSN "Last4DigitsOfSSNEX"
	And user enetr Date of Birth "DOBEX" 
	And user enter Annual Income "AnnualIncomeEX" 
	And user enter Street Address "StreetAddressEX" 
	And user enter Suite or Apartment "SuiteOrApartmentEX" 
	And user enter City "CityEX" 
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
	Then user navigates to existing account modal
	And user expect element disclosure text on existing account modal to be present
	And user click on continue to checkout button on existing user modal
	And user navigates to cart page

	
@C-PLCC @Regression @All @PLCC-94 @CR-VS
Scenario: Verify user is able to close  Existing Account(FPO) model after clicking on Close button
	When user enter First Name on credit card Application Modal "FirstNameEX"  
	Then user enter Last Name on credit card Application Modal "LastNameEX"
	And user enter Last four SSN "Last4DigitsOfSSNEX"
	And user enetr Date of Birth "DOBEX" 
	And user enter Annual Income "AnnualIncomeEX" 
	And user enter Street Address "StreetAddressEX" 
	And user enter Suite or Apartment "SuiteOrApartmentEX" 
	And user enter City "CityEX" 
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
	Then user navigates to existing account modal
	And user expect element disclosure text on existing account modal to be present
	When user click on close icon of error modal
	Then user expect Landing page to be present 
