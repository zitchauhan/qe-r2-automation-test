Feature: PLCC: CCAM_Pre-Screen Credit Credit Card Application Modal

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER 
	
@C-PLCC @Regression @All @PLCC-53 @CR-VS
 Scenario: Verify the system behavior when user clicks on Continue button on Prescreen model by providing valid required information/details
	And user enter Last four SSN "Last4DigitsOfSSNP"
	And user enter Confirm Last four SSN "ConfirmSSNP"
	And user enetr Date of Birth "DOBP"
	And user enter Annual Income "AnnualIncomeP"
	And user enter Email Address on credit card Application Modal "EmailIdP"
	And user enter Mobile Phone "MobilePhoneP"
	And user enter Alternate Phone "AlternatePhoneP"
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	And user select credit application modal agree message 

@C-PLCC @Regression @All @PLCC-53 @CR-VS	
Scenario: Verify the system behavior when user clicks on Continue button on Prescreen model by providing invalid  information/details
	And user enter Last four SSN "invalidSSNP"
	And user enter Confirm Last four SSN "invalidConfirmSSNP"
	And user enetr Date of Birth "invalidDOBP"
	And user enter Annual Income "invalidAnnualIncomeP"
	And user enter Email Address on credit card Application Modal "invalidEmailP"
	And user enter Mobile Phone "invalidMobilePhoneP"
	And user enter Alternate Phone "invalidAlternateMobilePhoneP"
	And user click on CONTINUE button
	And user expect error message on email id field
	And user expect error message on ssn field
	And user expect error message on confirm ssn field
	And user expect error message on mobile phone field
	And user expect error message on alternate phone field
	And user expect error message on annual income field
	And user expect error message on dob field
	
@C-PLCC @Regression @All @PLCC-53 @CR-VS
Scenario: Verify the system behavior when user clicks on Continue button on Prescreen model by missing any of the mandatory field
	And user enter Last four SSN "invalidSSNP"
	And user enter Email Address on credit card Application Modal "invalidEmailP"
	And user click on CONTINUE button
	And user expect error message on email id field
	And user expect error message on ssn field
	
@C-PLCC @Regression @All @PLCC-53 @CR-Manju
 Scenario: Verify the system behavior when user clicks on Print button on Consent Page of Prescreen Modal
	And user enter Last four SSN "Last4DigitsOfSSNP"
	And user enter Confirm Last four SSN "ConfirmSSNP"
	And user enetr Date of Birth "DOBP"
	And user enter Annual Income "AnnualIncomeP"
	And user enter Email Address on credit card Application Modal "EmailIdP"
	And user enter Mobile Phone "MobilePhoneP"
	And user enter Alternate Phone "AlternatePhoneP"
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	And user select credit application modal agree message 
#	And user verify presence of Print icon
	And user click on Print button