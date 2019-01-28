Feature: PLCC: Credit Card Application Modal

Scenario: Verify the display of elements available on credit card application model 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user expect element STEP1:PRESCREEN ACCEPTANCE present 
	And user expect element steps indicator to be present
	And user expect element Your Personal Information text to be present
	And user expect element FirstName text Field on CC Aplication Modal to be present 
	And user expect element LastName text Field on CC Aplication Modal to be present 
	And user expect element SSN text Field on CC Aplication Modal to be present 
	And user expect element Confirm SSN text Field on CC Aplication Modal to be present
	And user expect element DOB text Field on CC Aplication Modal to be present 	
	And user expect element Annual Income text Field on CC Aplication Modal to be present
	And user expect element disclosure text to be present 
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
		
 Scenario: Verify user is able to Edit prefilled data available on Prescreen model
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user expect element STEP1:PRESCREEN ACCEPTANCE present  
	When user enter First Name on credit card Application Modal "FirstNameP"
	Then user enter Last Name on credit card Application Modal "LastNameP"
	And user clear and enter Last four SSN "Last4DigitsOfSSNP"
	And user clear and enter Date of Birth "DOBP" 
	And user clear and enter Annual Income "AnnualIncomeP"
	And user clear and enter Street Address "StreetAddressP" 
	And user clear and enter Suite or Apartment "SuiteOrApartmentP"
	And user clear and enter City "CityP"
	And user clear and select State "StateP"
	And user clear and enter Zip Code on credit card Application Modal "ZipCodeP"
	And user clear and enter Email Address on credit card Application Modal "EmailIdP"
	And user clear and enter Confirm Email Address "ConfirmEmailIdP"
	And user clear enter Mobile Phone "MobilePhoneP"
	And user clear enter Alternate Phone "AlternatePhoneP"
	And user click on CONTINUE button

Scenario: Verify user is able provide data's which are not prefilled/prepopulated
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user expect element STEP1:PRESCREEN ACCEPTANCE present  
	And user clear and enter Last four SSN "Last4DigitsOfSSNP"
	And user clear and enter Last four SSN "ConfirmSSNP"
	And user clear and enter Annual Income "AnnualIncomeP"
	And user clear enter Alternate Phone "AlternatePhoneP"
	
Scenario: Verify user is able provide data's which are not prefilled/prepopulated
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to ASO-Home page
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user expect element STEP1:PRESCREEN ACCEPTANCE present  
	And user clear and enter Last four SSN "Last4DigitsOfSSNP"
	And user clear and enter Last four SSN "ConfirmSSNP"
	And user clear and enter Annual Income "AnnualIncomeP"
	And user clear enter Alternate Phone "AlternatePhoneP"
