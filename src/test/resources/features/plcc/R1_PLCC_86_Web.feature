Feature: PLCC: Checkout - Payment Using PLCC 

Background: 
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal 
	When user enter First Name "FirstName"
	And user enter Last Name "LastName" 
	And user enter Last four SSN "Last4DigitsOfSSN"
	And user enetr Date of Birth "DOB" 
	And user enter Annual Income "Annual Income"
	And user enter Street Address "StreetAddress" 
	And user enter Suite or Apartment "SuiteOrApartment"
	And user enter City "City"
	And user select State "State"
	And user enter Zip Code "ZipCode"
	And user enter Email Address "EmailId"
	And user enter Confirm Email Address "ConfirmEmailId"
	And user enter Mobile Phone "MobilePhone"
	And user enter Alternate Phone "AlternatePhone"
	And user click on CONTINUE button
	And user select credit application modal agree message 
	Then user navigates to credit card approval modal 
	When user click on continue to checkout 

@Regression @Web @All @C-VidyaSiddaramappa @PLCC-86
Scenario: Verify the default payment method when tries to  place an another order 
	And user clicks on checkout button and navigates to checkout page 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	And user click on Add to cart button 
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	#And user selects credit card radio button