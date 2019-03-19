Feature: PLCC: CCAM-Generic Modal

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal 
	
@C-PLCC @Regression @All @PLCC-90 @CR-VS 
Scenario: Verify the system behavior when user clicks on Continue button on Application model by providing valid required information/details
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
	
@C-PLCC @Regression @All @PLCC-90 @CR-VS 
Scenario: Verify the system behavior when user clicks on Continue button on Application model by providing valid required information/details
	When user enter First Name on credit card Application Modal "invalidFirstName" 
	Then user enter Last Name on credit card Application Modal "invalidLastName"
	And user enter Last four SSN "invalidSSNP"
	And user enetr Date of Birth "invalidDOBP" 
	And user enter Annual Income "invalidAnnualIncomeP" 
	And user enter Street Address "StreetAddress" 
	And user enter Suite or Apartment "SuiteOrApartment" 
	And user enter City "invalidCity" 
	And user select State "State" 
	And user enter Zip Code on credit card Application Modal "invalidZipCodeP" 
	And user enter Email Address on credit card Application Modal "invalidEmailP"  
	And user enter Mobile Phone "invalidMobilePhoneP" 
	And user enter Alternate Phone "invalidAlternateMobilePhoneP" 
	And user click on CONTINUE button  
	And user click on CONTINUE button
	And user expect error message on first name field
	And user expect error message on last name field
	And user expect error message on email id field
	And user expect error message on email id field
	And user expect error message on ssn field
	And user expect error message on confirm ssn field
	And user expect error message on mobile phone field
	And user expect error message on alternate phone field
	And user expect error message on annual income field
	And user expect error message on dob field
	
@C-PLCC @Regression @All @PLCC-90 @CR-VS 
Scenario: Verify the system behavior when user clicks on Continue button on Application model by missing any of the mandatory field
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
	And user expect error message on first name field
	And user expect error message on last name field

@C-PLCC @Regression @All @PLCC-90 @CR-Manju 
Scenario: Verify the system behavior when user clicks on Print button on Consent Page of Application Modal
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
	And user verify presence of Print icon
	And user click on Print button
	