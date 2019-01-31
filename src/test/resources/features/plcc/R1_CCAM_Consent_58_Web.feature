Feature: PLCC:Credit Card Application Modal_Consent Model

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	
	
@C-PLCC @Regression @All @PLCC-58 @CR-VS
 Scenario: Verify Submit button is not clickable when Terms and condition check box is unchecked_Pre-Screen
 And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER 
 	And user enter Last four SSN "Last4DigitsOfSSNP"
	And user enter Confirm Last four SSN "ConfirmSSNP"
	And user enetr Date of Birth "DOBP"
	And user enter Annual Income "AnnualIncomeP"
	And user enter Email Address on credit card Application Modal "EmailIdP"
	And user enter Mobile Phone "MobilePhoneP"
	And user enter Alternate Phone "AlternatePhoneP"
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	When user click on SUBMIT button
	Then user expect submit button not clickable
	
@C-PLCC @Regression @All @PLCC-58 @CR-VS
 Scenario: Verify Submit button is clickable when Terms and condition check box is checked_Pre-Screen
    And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER 
 	And user enter Last four SSN "Last4DigitsOfSSNP"
	And user enter Confirm Last four SSN "ConfirmSSNP"
	And user enetr Date of Birth "DOBP"
	And user enter Annual Income "AnnualIncomeP"
	And user enter Email Address on credit card Application Modal "EmailIdP"
	And user enter Mobile Phone "MobilePhoneP"
	And user enter Alternate Phone "AlternatePhoneP"
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	When user click on SUBMIT button
	And user select credit application modal agree message 
	Then user expect submit button clickable
	
@C-PLCC @Regression @All @PLCC-58 @CR-VS
 Scenario: Verify Submit button is not clickable when Terms and condition check box is unchecked_Generic
 And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER 
 	And user enter Last four SSN "Last4DigitsOfSSNP"
	And user enter Confirm Last four SSN "ConfirmSSNP"
	And user enetr Date of Birth "DOBP"
	And user enter Annual Income "AnnualIncomeP"
	And user enter Email Address on credit card Application Modal "EmailIdP"
	And user enter Mobile Phone "MobilePhoneP"
	And user enter Alternate Phone "AlternatePhoneP"
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	When user click on SUBMIT button
	Then user expect submit button not clickable
	
@C-PLCC @Regression @All @PLCC-58 @CR-VS
 Scenario: Verify Submit button is clickable when Terms and condition check box is unchecked_Generic
    When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal 
 	And user enter Last four SSN "Last4DigitsOfSSNP"
	And user enetr Date of Birth "DOBP"
	And user enter Annual Income "AnnualIncomeP"
	And user enter Email Address on credit card Application Modal "EmailIdP"
	And user enter Mobile Phone "MobilePhoneP"
	And user enter Alternate Phone "AlternatePhoneP"
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	When user click on SUBMIT button
	And user select credit application modal agree message 
	Then user expect submit button clickable