Feature: PLCC: Credit Card Application Modal

@C-PLCC @Regression @All @PLCC-57 @CR-VS	
 Scenario: Verify the system behavior when user clicks on Back button_Pre-Screen
 	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER 
 	And user expect element STEP 1 :PRESCREEN ACCEPTANCE present
	And user enter Last four SSN "Last4DigitsOfSSN"
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
	When user clisk on back button of consent modal
	Then user expect element STEP 1 :PRESCREEN ACCEPTANCE present
	

@C-PLCC @Regression @All @PLCC-57 @CR-VS	
 Scenario: Verify the functionality of “I Consent” checkbox on consent model when user navigates from prescreen model by clicking on Back button in previous step
 	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER 
 	And user expect element STEP 1 :PRESCREEN ACCEPTANCE present 
	And user clear and enter First Name on credit card Application Modal "FirstName"
	And user clear and enter Last Name on credit card Application Modal "LastName"
	And user enter Last four SSN "Last4DigitsOfSSN"
	And user enetr Date of Birth "DOB" 
	And user enter Annual Income "AnnualIncome"
	And user enter Street Address "StreetAddress" 
	And user clear and enter Street Address "StreetAddress" 
	And user enter Suite or Apartment "SuiteOrApartment"
	And user clear and enter City "City"
	And user select State "State"
	And user enter Zip Code on credit card Application Modal "ZipCode"
	And user clear and enter Zip Code on credit card Application Modal "ZipCode"
	And user enter Email Address on credit card Application Modal "EmailId"
	And user enter Mobile Phone "MobilePhone"
	And user enter Alternate Phone "AlternatePhone"
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	And user expect element Accept Terms and Conditions checkbox to be unchecked 
	Then user expect submit button not clickable
	

@C-PLCC @Regression @All @PLCC-57 @CR-VS	
 Scenario: Verify the system behavior when user clicks on Back button_Generic
 	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal 
	And user clear and enter First Name on credit card Application Modal "FirstName"
	And user clear and enter Last Name on credit card Application Modal "LastName"
	And user enter Last four SSN "Last4DigitsOfSSN"
	And user enetr Date of Birth "DOB" 
	And user enter Annual Income "AnnualIncome"
	And user enter Street Address "StreetAddress" 
	And user clear and enter Street Address "StreetAddress" 
	And user enter Suite or Apartment "SuiteOrApartment"
	And user clear and enter City "City"
	And user select State "State"
	And user enter Zip Code on credit card Application Modal "ZipCode"
	And user clear and enter Zip Code on credit card Application Modal "ZipCode"
	And user enter Email Address on credit card Application Modal "EmailId"
	And user enter Mobile Phone "MobilePhone"
	And user enter Alternate Phone "AlternatePhone"
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	And user expect element Accept Terms and Conditions checkbox to be unchecked 
	When user clisk on back button of consent modal
	Then user navigates to Generic Credit Card Application Modal  
	