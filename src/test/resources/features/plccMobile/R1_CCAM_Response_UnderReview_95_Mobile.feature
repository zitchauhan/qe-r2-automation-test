Feature: PLCC: Response Modals_Application Under Review Modal

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	When user click on burger menu 
	And user click on My Account link of mobile
	And user enter Email address in sign-in page "Email_Promotions" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	And user clears everything in cart
	And user click on Academy Logo Icon 
	And user click on expand all Academy services
	When user click on AcademyCreditCard link in the footer section of ASO-Home page  
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal
	
@C-PLCC @Regression @All @PLCC-95 @CR-Smeetha @Mobile 
Scenario: Verify is able to navigate to Application Under Review model
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
	
@C-PLCC @Regression @All @PLCC-95 @CR-Smeetha @Mobile 
Scenario: Verify the elements available on Application Under Review model
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
	And user expect element Error Card Modal Image to be present
	And user expect element Application Under Review Text to be present
	And user expect element disclosure Message on Error Modal to be present
	And user expect element continue To Checkout button to be present
	And user expect element close icon on error modal is present 
		
@C-PLCC @Regression @All @PLCC-95 @CR-Smeetha @Mobile 
Scenario: Verify user is able to navigate to checkout page after clicking on Continue to Checkout button
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
	When user click on continue to checkout button of application under review
	Then user navigates to cart page
	
@C-PLCC @Regression @All @PLCC-95 @CR-VS
Scenario: Verify user is able to close Application Under Review model after clicking on Close button
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
	When user click on close icon of error modal
	Then user expect Landing page to be present 
	

	
	
	
	