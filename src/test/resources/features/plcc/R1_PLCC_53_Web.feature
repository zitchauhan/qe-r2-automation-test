Feature: PLCC: Credit Card Application Modal
Scenario: Verify user is able to Edit all the required information on credit card application model 
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
	And user click on CONTINUE button