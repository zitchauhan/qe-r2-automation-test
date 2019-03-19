Feature: PLCC: Credit Card Application Modal_Cart Page

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Generic" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user click on My Account link 
    And user click on Payments link 
    Then delete all credit cards from My Account 
    And user clears everything in cart 
	#And user expect element ASO Home Page Title to be present
	When user enters "SKUIdOfProduct" in the search box plcc
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on viewcart button
	Then user navigates to Cart Page 
	And user click on plcc banner of cart button
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS @AutomationSanityR2
Scenario: Verify the display of generic banner via cart page apply now banner
	And user navigates to Generic Credit Card Application Modal
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the display of elements available on credit card application model from cart page
	And user navigates to Generic Credit Card Application Modal
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
	And user expect element CANCEL on CC Aplication Modal to be present
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify user is able to Edit all the required information on credit card application modal from cart page
	And user navigates to Generic Credit Card Application Modal
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
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the system behavior when user clicks on Continue button on Credit Card application modal 1 from cart page
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

@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the display of elements available on consent modal from cart page
	And user navigates to Generic Credit Card Application Modal
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
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify user is able to select check box to accept terms and condition when navigated to CCAM from cart page
	And user navigates to Generic Credit Card Application Modal
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
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the application behavior when user unselects the check box on consent model when user navigates to CCAM from cart page
	And user navigates to Generic Credit Card Application Modal
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
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the display of Cancel link on Generic Credit Card model when user navigates to CCAM from cart page
	And user navigates to Generic Credit Card Application Modal
	When user click on cancel link
	Then user navigates to Cart Page
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the system behavior when user clicks on Cancel link when user navigates to CCAM from cart page
 	And user navigates to Generic Credit Card Application Modal
	When user click on cancel link
	Then user navigates to Cart Page
	
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the system behavior when user clicks on Close button when user navigates to CCAM from cart page
	And user navigates to Generic Credit Card Application Modal
	When user click on close icon
	Then user navigates to Cart Page

@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the system behavior when user clicks on Cancel link on consent modal when user navigates to CCAM from cart page
	And user navigates to Generic Credit Card Application Modal
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
	Then user navigates to Cart Page
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the system behaviour when uer clicks in close button on consent model when user navigates to CCAM from cart page
	And user navigates to Generic Credit Card Application Modal
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
	When user click on close icon
	Then user navigates to Cart Page
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the system behavior when user clicks on Back button on Consent modal when user navigates to CCAM from cart page
	And user navigates to Generic Credit Card Application Modal
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
	When user clisk on back button of consent modal
	Then user navigates to Generic Credit Card Application Modal
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS 
Scenario: Verify the display of Print link on consent model  when user navigates to CCAM from cart page
And user navigates to Generic Credit Card Application Modal
	And user expect element print link to be present on Credit card application modal 
		
@C-PLCC @Regression @All @PLCC-112 @CR-VS
 Scenario: Verify Submit button is not clickable when Terms and condition check box is unchecked when user navigates to CCAM from cart page
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
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS
 Scenario: Verify Submit button is clickable when Terms and condition check box is checked when user navigates to CCAM from cart page 
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
	

@C-PLCC @Regression @All @PLCC-112 @CR-VS @AutomationSanityR2
 Scenario: Verify user able to navigate to Success Modal when nvaigate to CCAM from Cart Page 
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
	Then user navigates to credit card approval modal 
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS
 Scenario: Verify user able to navigate to Application Under Review Modal when nvaigate to CCAM from Cart Page 
	When user enter First Name on credit card Application Modal "FirstNameUR" 
	Then user enter Last Name on credit card Application Modal "LastNameUR"
	And user enter Last four SSN "Last4DigitsOfSSNUR"
	And user enetr Date of Birth "DOB" 
	And user enter Annual Income "AnnualIncomeUR" 
	And user enter Street Address "StreetAddress" 
	And user enter Suite or Apartment "SuiteOrApartment" 
	And user enter City "CityUR" 
	And user select State "State" 
	And user enter Zip Code on credit card Application Modal "ZipCodeUR" 
	And user enter Email Address on credit card Application Modal "EmailIdUR" 
	And user enter Confirm Email Address "ConfirmEmailIdUR" 
	And user enter Mobile Phone "MobilePhone" 
	And user enter Alternate Phone "AlternatePhone" 
	And user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT
	And user select credit application modal agree message 
	When user click on SUBMIT button
	Then user navigates to error modal
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS
 Scenario: Verify user able to navigate to Error state Modal when nvaigate to CCAM from Cart Page 
	When user enter First Name on credit card Application Modal "FirstName" 
	Then user enter Last Name on credit card Application Modal "LastNameEr"
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
	When user click on SUBMIT button
	Then user navigates to error modal 
	And user expect element disclosure text on error modal to be present
	And user expect error text to be present
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS
 Scenario: Verify user able to navigate to Existing Account Modal when nvaigate to CCAM from Cart Page 
	When user enter First Name on credit card Application Modal "FirstNameEX" 
	Then user enter Last Name on credit card Application Modal "LastNameEX"
	And user enter Last four SSN "Last4DigitsOfSSNEX"
	And user enetr Date of Birth "DOBEX" 
	And user enter Annual Income "AnnualIncomeEX" 
	And user enter Street Address "StreetAddressEX" 
	And user enter Suite or Apartment "SuiteOrApartmentEX" 
	And user enter City "CityEX" 
	And user select State "State" 
	And user enter Zip Code on credit card Application Modal "ZipCode" 
	And user enter Email Address on credit card Application Modal "EmailId" 
	And user enter Confirm Email Address "ConfirmEmailId" 
	And user enter Mobile Phone "MobilePhone" 
	And user enter Alternate Phone "AlternatePhone" 
	And user click on CONTINUE button
	And user verify presence of STEP2: CONSENT
	And user select credit application modal agree message 
	When user click on SUBMIT button
	Then user navigates to existing account modal
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS
 Scenario: Verify user able to close Existing Account Modal when nvaigate to CCAM from Cart Page 
	When user enter First Name on credit card Application Modal "FirstNameEX"  
	Then user enter Last Name on credit card Application Modal "LastNameEX"
	And user enter Last four SSN "Last4DigitsOfSSNEX"
	And user enetr Date of Birth "DOBEX" 
	And user enter Annual Income "AnnualIncomeEX" 
	And user enter Street Address "StreetAddressEX" 
	And user enter Suite or Apartment "SuiteOrApartmentEX" 
	And user enter City "CityEX" 
	And user select State "State" 
	And user enter Zip Code on credit card Application Modal "ZipCode" 
	And user enter Email Address on credit card Application Modal "EmailId" 
	And user enter Confirm Email Address "ConfirmEmailId" 
	And user enter Mobile Phone "MobilePhone" 
	And user enter Alternate Phone "AlternatePhone" 
	And user click on CONTINUE button 
	And user verify presence of STEP2: CONSENT
	And user select credit application modal agree message 
	When user click on SUBMIT button
	Then user navigates to existing account modal
	And user expect element disclosure text on existing account modal to be present
	When user click on close icon of error modal
	Then user expect Landing page to be present 
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS
 Scenario: Verify user able to close Error state Modal when nvaigate to CCAM from Cart Page 
 	When user enter First Name on credit card Application Modal "FirstName" 
	Then user enter Last Name on credit card Application Modal "LastNameEr"
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
	When user click on SUBMIT button
	Then user navigates to error modal 
	When user click on close icon of error modal
	Then user expect Landing page to be present

@C-PLCC @Regression @All @PLCC-112 @CR-VS
 Scenario: Verify user able to close Success Modal when nvaigate to CCAM from Cart Page 
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
	When user click on SUBMIT button
	Then user navigates to credit card approval modal
	When user click on close icon of success modal
	Then user expect Landing page to be present
	
#@C-PLCC @Regression @All @PLCC-112 @CR-VS
 #Scenario: Verify user able to close Application under Modal when navigate to CCAM from Cart Page 


	

	
	