Feature: PLCC:Credit Card Application Modal_Consent Model

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	
	
@C-PLCC @Regression @All @PLCC-58 @CR-VS
 Scenario: Verify Submit button is not clickable when Terms and condition check box is unchecked_Pre-Screen Consent
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER 
 	And user expect element STEP 1 :PRESCREEN ACCEPTANCE present
	And user enter Last four SSN "Last4DigitsOfSSNP"
	And user enter Confirm Last four SSN "ConfirmSSNP"
	And user enetr Date of Birth "DOB" 
	And user enter Annual Income "AnnualIncome"
	And user enter Street Address "StreetAddress" 
	And user enter Suite or Apartment "SuiteOrApartment"
	And user select State "State"
	And user enter Zip Code on credit card Application Modal "ZipCode"
	And user enter Email Address on credit card Application Modal "EmailId"
	And user enter Mobile Phone "MobilePhone"
	And user enter Alternate Phone "AlternatePhone"
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	When user click on SUBMIT button
	Then user expect submit button not clickable
	
@C-PLCC @Regression @All @PLCC-58 @CR-VS @AutomationSanityR2
 Scenario: Verify Submit button is clickable when Terms and condition check box is checked_Pre-Screen Consent 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER 
 	And user expect element STEP 1 :PRESCREEN ACCEPTANCE present
	And user enter Last four SSN "Last4DigitsOfSSNP"
	And user enter Confirm Last four SSN "ConfirmSSNP"
	And user enetr Date of Birth "DOB" 
	And user enter Annual Income "AnnualIncome"
	And user enter Street Address "StreetAddress" 
	And user enter Suite or Apartment "SuiteOrApartment"
	And user select State "State"
	And user enter Zip Code on credit card Application Modal "ZipCode"
	And user enter Email Address on credit card Application Modal "EmailId"
	And user enter Mobile Phone "MobilePhone"
	And user enter Alternate Phone "AlternatePhone"
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	When user click on SUBMIT button
	And user select credit application modal agree message 
	Then user expect submit button clickable
	
@C-PLCC @Regression @All @PLCC-58 @CR-VS
 Scenario: Verify Submit button is not clickable when Terms and condition check box is unchecked_Generic Consent
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
	When user click on SUBMIT button
	Then user expect submit button not clickable
	
@C-PLCC @Regression @All @PLCC-58 @CR-VS
 Scenario: Verify Submit button is clickable when Terms and condition check box is checked_Generic Consent
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
	Then user expect submit button clickable