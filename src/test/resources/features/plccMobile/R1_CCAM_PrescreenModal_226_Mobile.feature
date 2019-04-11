Feature: PLCC: Credit Card Application Modal_Cart Page Invalid Prescreen Code for Mobile

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc 
	When user navigates to ASO-Home page 
	And user click on expand all Academy services
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "InvalidValid_PrescreenCode_1"
	And user click on ACCEPT OFFER 

	
@C-PLCC @Regression @All @PLCC-226 @CR-Manju @Mobile
Scenario: Verify Prescreen Modal when user enter invalid pre screen code
	And user expect element error message for invalid prescreen code to be present
	
	
#@C-PLCC @Regression @All @PLCC-226 @CR-Manju @Mobile
#Scenario: Verify the display of elements available on Prescreen  model 
#	And user expect element STEP 1 :PRESCREEN ACCEPTANCE present 
#	And user expect element disclosure Text one on Pre-Screen Modal to be present
#	And user expect element notice iframe one to be present
#	And user expect element FirstName text Field on CC Aplication Modal to be present 
#	And user expect element LastName text Field on CC Aplication Modal to be present 
#	And user expect element SSN text Field on CC Aplication Modal to be present 
#	And user expect element DOB text Field on CC Aplication Modal to be present 
#	And user expect element Annual Income text Field on CC Aplication Modal to be present 
#	And user expect element Street Address text Field on CC Aplication Modal to be present 
#	And user expect element Suite or Apartment text Field on CC Aplication Modal to be present 
#	And user expect element city text Field on CC Aplication Modal to be present 
#	And user expect element state drop down on CC Aplication Modal to be present 
#	And user expect element zip code text field on CC Aplication Modal to be present 
#	And user expect element email text field on CC Aplication Modal to be present 
#	And user expect element confirm email text field on CC Aplication Modal to be present 
#	And user expect element disclosure Text two on Pre-Screen Modal to be present
#	And user expect element Mobile Phone text field on CC Aplication Modal to be present 
#	And user expect element Alternate Phone text field on CC Aplication Modal to be present 
#	And user expect element CONTINUE on CC Aplication Modal to be present
#	And user expect element CANCEL on CC Aplication Modal to be present
#	
#
#	
#@C-PLCC @Regression @All @PLCC-226 @CR-Manju @Mobile
# Scenario: Verify the system behavior when user clicks on Continue button on Prescreen model by missing any of the mandatory field
# 	And user enter Last four SSN "invalidSSNP"
#	And user enter Email Address on credit card Application Modal "invalidEmailP"
#	And user click on CONTINUE button
#	And user expect error message on email id field
#	And user expect error message on ssn field
#	
#@C-PLCC @Regression @All @PLCC-226 @CR-Manju @Mobile
#Scenario: Verify the system behavior when user clicks on Continue button on Prescreen modal 1 
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
#	And user click on CONTINUE button 
#	And user verify presence of STEP2: CONSENT
#	And user select credit application modal agree message 
#	
#@C-PLCC @Regression @All @PLCC-226 @CR-Manju @Mobile
#Scenario: Verify the display of elements available on consent modal from cart page
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
#	And user click on CONTINUE button 
#	And user verify presence of STEP2: CONSENT
#	And user select credit application modal agree message 
#	Then user expect element credit card image to be present 
#	And user expect element ACCOUNT TERMS AND CONDITIONS to be present 
#	And user expect element didclosure text one on consent modal to be present 
#	And user expect element didclosure text two on consent modal to be present 
#	And user expect element CONSENT TO ACCOUNT TERMS AND CONDITIONS to be present 
#	And user expect element CONSENT TO ACCOUNT Iframe to be present 
#	And user expect element CONSENT TO FINANCIAL TERMS OF THE ACCOUNT to be present 
#	And user expect element CONSENT TO FINANCIAL Iframe to be present 
#	And user expect element I agree TandCs on consent modal to be present 
#	And user expect element SUBMIT button to be present 
#	And user expect element Cancel link to be present 
#	And user expect element print link to be present on Credit card application modal
#
#@C-PLCC @Regression @All @PLCC-226 @CR-Manju @Mobile
#Scenario: Verify the system behavior when user clicks on Continue button on Prescreen modal 1 
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
#	And user click on CONTINUE button 
#	And user verify presence of STEP2: CONSENT
#	And user select credit application modal agree message
#	Then user expect submit button clickable  
#	
##@C-PLCC @Regression @All @PLCC-226 @CR-Manju 
##Scenario: Verify the system behavior when user clicks on Continue button on Prescreen modal 1 
##	When user enter First Name on credit card Application Modal "FirstName" 
##	Then user enter Last Name on credit card Application Modal "LastName"
##	And user enter Last four SSN "Last4DigitsOfSSN"
##	And user enetr Date of Birth "DOB" 
##	And user enter Annual Income "AnnualIncome" 
##	And user enter Street Address "StreetAddress" 
##	And user enter Suite or Apartment "SuiteOrApartment" 
##	And user enter City "City" 
##	And user select State "State" 
##	And user enter Zip Code on credit card Application Modal "ZipCode" 
##	And user enter Email Address on credit card Application Modal "EmailId" 
##	And user enter Confirm Email Address "ConfirmEmailId" 
##	And user enter Mobile Phone "MobilePhone" 
##	And user enter Alternate Phone "AlternatePhone" 
##	And user click on CONTINUE button 
##	And user verify presence of STEP2: CONSENT
##	Then user expect submit button not clickable 
#
##@C-PLCC @Regression @All @PLCC-226 @CR-Manju 
##Scenario: Verify the system behavior when user click on cancel link in Prescreen modal
##	And user navigates to Generic Credit Card Application Modal
##	When user click on cancel link
##	Then user navigates to Cart Page
	
	
	