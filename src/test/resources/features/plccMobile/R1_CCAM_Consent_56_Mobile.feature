Feature: PLCC:Credit Card Application Modal_Consent Model for Mobile
	
@C-PLCC @Regression @All @PLCC-56 @CR-Manju @Mobile
Scenario: Verify the display of elements available on consent model_Generic Consent Modal
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user click on expand all Academy services
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
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
	When user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT 
	Then user expect element credit card image to be present 
	And user expect element ACCOUNT TERMS AND CONDITIONS to be present 
	And user expect element didclosure text one on consent modal to be present 
	And user expect element didclosure text two on consent modal to be present 
	And user expect element CONSENT TO ACCOUNT TERMS AND CONDITIONS to be present 
	And user expect element CONSENT TO ACCOUNT Iframe to be present 
	And user expect element CONSENT TO FINANCIAL TERMS OF THE ACCOUNT to be present 
	And user expect element CONSENT TO FINANCIAL Iframe to be present 
	And user expect element I agree TandCs on consent modal to be present 
	And user expect element SUBMIT button to be present 
	And user expect element Cancel link to be present 
	And user expect element print link to be present on Credit card application modal 
	
@C-PLCC @Regression @All @PLCC-56 @CR-Manju @Mobile 
Scenario: Verify user is able to select check box to accept terms and condition_Generic Consent Modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user click on expand all Academy services
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
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
	When user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT  
	When user click on SUBMIT button 
	And user select credit application modal agree message 
	Then user expect submit button clickable 
	
@C-PLCC @Regression @All @PLCC-56 @CR-Manju @Mobile 
Scenario: Verify the application behavior when user unselects the check box on consent model
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user click on expand all Academy services
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
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
	When user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT 
	Then user expect submit button not clickable
	
@C-PLCC @Regression @All @PLCC-56 @CR-Manju @Mobile 
Scenario: Verify the system behavior when user clicks on Cancel link_Pre-Screen Modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user click on expand all Academy services 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER
	When user click on cancel link
	Then user expect Landing page to be present 
	
	
@C-PLCC @Regression @All @PLCC-56 @CR-Manju @Mobile 
Scenario: Verify the system behavior when user clicks on Cancel link_Pre-Screen Consent
	Given user launches the browser and navigates to "ASO_HOME" page 
And user click on expand all Academy services
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
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
	When user click on cancel link
	Then user expect Landing page to be present
	
@C-PLCC @Regression @All @PLCC-56 @CR-VS @Mobile
Scenario: Verify the system behavior when user clicks on Cancel link_Generic 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on expand all Academy services
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal
	When user click on cancel link
	Then user expect Landing page to be present 
	
@C-PLCC @Regression @All @PLCC-56 @CR-VS @Mobile
Scenario: Verify the system behavior when user clicks on Cancel link_Generic Consent
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
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
	When user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT 
	When user click on cancel link
	Then user expect Landing page to be present 
	
#@C-PLCC @Regression @All @PLCC-56 @CR-Manju @Mobile 
#Scenario: Verify the system behavior when user clicks on Close button_Pre-Screen Modal
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And user click on expand all Academy services
#	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
#	Then user expect Landing page to be present 
#	And user expect Preescreen Code Text Field is to be present
#	And user enter Preescreen Code "Valid_PrescreenCode_1"
#	And user click on ACCEPT OFFER
#	When user click on close icon 
#	Then user expect Landing page to be present
#	
#@C-PLCC @Regression @All @PLCC-56 @CR-VS 
#Scenario: Verify the system behavior when user clicks on Close icon_Generic 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user navigates to ASO-Home page 
#	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
#	Then user expect Landing page to be present 
#	When user click on APPLY NOW button 
#	Then user navigates to Generic Credit Card Application Modal
#	When user click on close icon 
#	Then user expect Landing page to be present
#	
#@C-PLCC @Regression @All @PLCC-56 @CR-VS 
#Scenario: Verify the system behavior when user clicks on Close button_Generic Consent
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user navigates to ASO-Home page 
#	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
#	Then user expect Landing page to be present 
#	When user click on APPLY NOW button 
#	Then user navigates to Generic Credit Card Application Modal 
#	When user enter First Name on credit card Application Modal "FirstName" 
#	Then user enter Last Name on credit card Application Modal "LastName" 
#	And user enter Last four SSN "Last4DigitsOfSSN" 
#	And user enetr Date of Birth "DOB" 
#	And user enter Annual Income "AnnualIncome" 
#	And user enter Street Address "StreetAddress" 
#	And user enter Suite or Apartment "SuiteOrApartment" 
#	And user enter City "City" 
#	And user select State "State" 
#	And user enter Zip Code on credit card Application Modal "ZipCode" 
#	And user enter Email Address on credit card Application Modal "EmailId" 
#	And user enter Confirm Email Address "ConfirmEmailId" 
#	And user enter Mobile Phone "MobilePhone" 
#	And user enter Alternate Phone "AlternatePhone" 
#	When user click on CONTINUE button 
#	And user verify presence of STEP2: CONSENT
#	When user click on close icon 
#	Then user expect Landing page to be present
#	
#
