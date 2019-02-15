Feature: PLCC: MyAccount

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal 	
@C-PLCC @Regression @All @PLCC-115 @CR-VS
Scenario: Verify PLCC card information saved under customer profile
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
	When user click on continue to checkout 
	Then user click on MyAccount and navigate to payment 
	Then Verify below Sub/Main Module of MyAccount 
		|#Verify following elements in Payments > Add new credit card section	|
		|PaymentPage_PaymentsHeader_label				|
	And user verifies the credit card saved and set as default 
	And user expect element saved card on payment section of checkout page to be present
	Then Verify below Sub/Main Module of MyAccount 
		|#Verify following elements in Payment page		|
		|PaymentPage_CrediCardList_txt|
	And delete all credit cards from My Account
	
	
	

	
	
	
	