Feature: PLCC: Credit Card Application Modal

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal 
	
@C-PLCC @Regression @All @PLCC-51 @CR-VS 
Scenario: Verify the display of elements available on credit card application model
	And user expect element STEP1: APPLICATION FORM present 
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
	And user expect element Mobile Phone text field on CC Aplication Modal to be present 
	And user expect element Alternate Phone text field on CC Aplication Modal to be present 
	And user expect element CONTINUE on CC Aplication Modal to be present 
	#And user expect element agree checkbox on CC Aplication Modal to be present
	#And user expect element SUBMIT on CC Aplication Modal to be present
	And user expect element CANCEL on CC Aplication Modal to be present
	
@C-PLCC @Regression @All @PLCC-51 @CR-VS 		
 Scenario: Verify user is able to Edit all the required information on credit card application model
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

@C-PLCC @Regression @All @PLCC-51 @CR-VS 
Scenario: Verify the system behavior when user clicks on Continue button on Credit Card application model 1
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
	

	
	
 