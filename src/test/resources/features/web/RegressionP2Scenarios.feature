Feature: Regression P2 scenarios

	@P2 @SearchRemoved
	Scenario: Validate navigation to Hot Deals page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithDefaultAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on Deals menu
	Then user click on Hot Deals menu and navigate to Hot Deals page
	And Shop By Category section is displayed
	And user should be able to see the listed products
	
	@RegressionP2
	Scenario: Verify the functionality of 'See All >' button
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithDefaultAddress"
	And user enter the valid password "Password"
	And user click on signin button
	And user clicks on Shop menu
	And user hover on the "Outdoors" category
	Then user clicks on See All > button
	And user should be navigated to "Outdoors" PLP
	
#	@RegressionP2
#   Scenario: Search a Gift card and verify URL,Image,Attributes on the PDP page
#   Given user launches the browser and navigates to "ASO_HOME" page
#   When User searches a product "SKUForGiftCard" and navigates to PDP
#   Then user should be able to see PDP mention in the current url
#   And user should be able to see Image of the product
#   And user should be able to see the search term in the GiftCard title

	@RegressionP2 @SR-1311 @def
	Scenario: Verify user is able to get acquisition/first time promotion for the new PLCC approved card[5% up to $15 and Flat $15 for cart 
	total >$15]
	Given user launches the browser and navigates to "ASO_HOME" page
	And User searches a product "productName" and navigates to PDP 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 
	Then user navigates to Generic Credit Card Application Modal
	When user enter First Name on credit card Application Modal "FirstNamePlcc" 
	Then user enter Last Name on credit card Application Modal "LastNamePlcc"
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
	Then user clicks on Continue to Checkout CTA on PLCC approval modal
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	Then user fill the email address and click on review order btn
	Then user should get first time promotion PLCC discount
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	
	