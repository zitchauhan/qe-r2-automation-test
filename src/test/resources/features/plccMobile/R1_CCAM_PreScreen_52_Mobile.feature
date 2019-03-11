Feature: PLCC: Pre-Screen Credit Card Application Modal_Mobile

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user click on expand all Academy services
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER 
	
@C-PLCC @Regression @All @PLCC-52 @CR-VS @Mobile
Scenario: Verify the display of elements available on Prescreen  model 
	And user expect element STEP 1 :PRESCREEN ACCEPTANCE present 
	And user expect element disclosure Text one on Pre-Screen Modal to be present
	And user expect element notice iframe one to be present
	And user expect element FirstName text Field on CC Aplication Modal to be present 
	And user expect element LastName text Field on CC Aplication Modal to be present 
	And user expect element SSN text Field on CC Aplication Modal to be present 
	And user expect element DOB text Field on CC Aplication Modal to be present 
	And user expect element Annual Income text Field on CC Aplication Modal to be present 
	And user expect element Street Address text Field on CC Aplication Modal to be present 
	And user expect element Suite or Apartment text Field on CC Aplication Modal to be present 
	And user expect element city text Field on CC Aplication Modal to be present 
	And user expect element state drop down on CC Aplication Modal to be present 
	And user expect element zip code text field on CC Aplication Modal to be present 
	And user expect element email text field on CC Aplication Modal to be present 
	And user expect element confirm email text field on CC Aplication Modal to be present 
	And user expect element disclosure Text two on Pre-Screen Modal to be present
	And user expect element Mobile Phone text field on CC Aplication Modal to be present 
	And user expect element Alternate Phone text field on CC Aplication Modal to be present 
	And user expect element CONTINUE on CC Aplication Modal to be present
	And user expect element CANCEL on CC Aplication Modal to be present
	
@C-PLCC @Regression @All @PLCC-52 @CR-VS @Mobile
 Scenario:	Verify the system behavior when user clicks on Continue button on Prescreen model by providing valid required information/details
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

@C-PLCC @Regression @All @PLCC-52 @CR-VS
 Scenario: Verify Submit button is clickable when Terms and condition check box is checked 
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
	


	

	
	

