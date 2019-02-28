Feature: Response Modals_Existing Account

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal
	
@C-PLCC @Regression @All @PLCC-94 @CR-VS
Scenario: Verify user is able to navigate to Existing Account modal
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
	And user click on continue to checkout button
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
