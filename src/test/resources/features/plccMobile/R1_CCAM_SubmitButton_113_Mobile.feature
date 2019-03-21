Feature: PLCC: Pre-Screen CCAM_Submit Button_Mobile

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user click on expand all Academy services
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
#	And user expect Preescreen Code Text Field is to be present
#	And user enter Preescreen Code "Valid_PrescreenCode_1"
#	And user click on ACCEPT OFFER 
	
@C-PLCC @Regression @All @PLCC-113 @CR-VS @Mobile
Scenario: Verify the system behavior when user clicks on Cancel link_Generic Consent Modal
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
	When user click on cancel link
	Then user expect Landing page to be present 
