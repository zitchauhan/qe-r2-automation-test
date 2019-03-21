Feature: PLCC: Credit Card Application Modal Response scenarios - Error States

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user click on expand all Academy services
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal
        
        
@C-PLCC @Regression @All @PLCC-96 @CR-Smeetha @Mobile 
Scenario: Verify is able to navigate to Time Out/Processing Error model
	When user enter First Name on credit card Application Modal "FirstName" 
	Then user enter Last Name on credit card Application Modal "LastNameEr"
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
	Then user navigates to error modal 
	And user expect element disclosure text on error modal to be present
	And user expect error text to be present

@C-PLCC @Regression @All @PLCC-96 @CR-Smeetha @Mobile 
Scenario: Verify the elements available on Time Out/Processing Error modal
	When user enter First Name on credit card Application Modal "FirstName" 
	Then user enter Last Name on credit card Application Modal "LastNameEr"
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
	Then user navigates to error modal 
	And user expect element disclosure text on error modal to be present
	And user expect error text to be present
	And user expect element Error Card Modal Image to be present
	And user expect element close icon on error modal is present
	And user expect element continue To Checkout button to be present
	When user expect element return to application to be present
	And user expect element continue to shopping button to be present
		
@C-PLCC @Regression @All @PLCC-96 @CR-Smeetha @Mobile 
Scenario: Verify user is able to navigate to checkout page after clicking on Continue to Checkout button
	When user enter First Name on credit card Application Modal "FirstName" 
	Then user enter Last Name on credit card Application Modal "LastNameEr"
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
	Then user navigates to error modal 
	When user click on continue to checkout button on error modal
	Then user navigates to cart page
	
@C-PLCC @Regression @All @PLCC-96 @CR-Smeetha @Mobile 
Scenario: Verify user is able to navigate to checkout page after clicking on Return to Application button
	When user enter First Name on credit card Application Modal "FirstName" 
	Then user enter Last Name on credit card Application Modal "LastNameEr"
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
	And user select credit application modal agree message 
	When user click on SUBMIT button
	Then user navigates to error modal 
	When user click on return to application on error modal
	Then user navigates to ASO-Home page
	
@C-PLCC @Regression @All @PLCC-96 @CR-Smeetha @Mobile 
Scenario: Verify user is able to close Application Error model after clicking on Close button
	When user enter First Name on credit card Application Modal "FirstName" 
	Then user enter Last Name on credit card Application Modal "LastNameEr"
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
	Then user navigates to error modal 
	When user click on close icon of error modal
	Then user expect Landing page to be present
	
