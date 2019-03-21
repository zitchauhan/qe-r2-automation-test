Feature: PLCC: Credit Card Application Modal_Cart Page_Mobile

Background:  Common Pre-requisite step
	Given user launches the browser and navigates to "ASO_HOME" page plcc 
	When user click on burger menu 
	And user click on My Account link of mobile
	And user enter Email address in sign-in page "Email_Promotions" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	And user clears everything in cart
	And user click on Academy Logo Icon
	When user enters "SKUIdOfProduct" in the search box plcc for mobile
    And user click on search icon for mobile
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page
	And user click on plcc banner of cart button
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS @Mobile
Scenario: Verify the display of generic banner on cart page
	And user navigates to Generic Credit Card Application Modal
	And user expect plcc credit banner on cart page

@C-PLCC @Regression @All @PLCC-112 @CR-VS @Mobile
Scenario: Verify the system behaviour when user clicks on Apply Now button
	And user navigates to Generic Credit Card Application Modal

@C-PLCC @Regression @All @PLCC-112 @CR-VS @Mobile 
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
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS @Mobile
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
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS @Mobile
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
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS @Mobile
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

@C-PLCC @Regression @All @PLCC-112 @CR-VS @Mobile 
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
	
@C-PLCC @Regression @All @PLCC-112 @CR-VS @Mobile
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