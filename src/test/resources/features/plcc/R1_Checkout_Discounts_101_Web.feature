Feature: PLCC: Checkout_Discounts-First time promotions 

Background: Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_FirstTimePromotions" 
	And user enter password in sign-in page "passwordPlcc" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
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
	When user click on return to application
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	And user clears everything in cart 
	  

@C-PLCC @Regression @All @PLCC-101 @CR-VS @AutomationSanityR2	
Scenario: First Time Promotion Available for item less than or equal to <15$
    When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page
	When user handles adding new card "ValidPLCCCard" if already card is saved
	And user click on REVIEW ORDER button
	And user expect element Order Summary to be present
	And user expect discount text to be present 
	Then user expect five percent discount 
	And user expect element free shipping should not be available 
	When user click on edit my cart link 
	Then user click on remove from cart 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	
@C-PLCC @Regression @All @PLCC-101 @CR-VS @AutomationSanityR2
Scenario: First Time Promotion Available for item greater than >15$
    When user enters "SKUIdOfProductGr15" in the search box plcc
	And user click on search icon 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page
	When user handles adding new card "ValidPLCCCard" if already card is saved
	And user click on REVIEW ORDER button
	And user expect element Order Summary to be present
	And user expect element free shipping should be available 
	And user expect discount text to be present 
 	Then user expect fifteen dollars discount
	When user click on edit my cart link 
	Then user click on remove from cart 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	
	
	
	
#@C-PLCC @Regression @All @PLCC-101 @CR-VS 
#    Scenario: To verify Celarance Product price on PDP
#    Given user launches the browser and navigates to "ASO_HOME" page 
#    Then User navigates to L2 page plcc
#    Then Navigate to PLP and select one product with clearance for plcc
#    And User should able to see Strike Through Price with Actual price for plcc
#    When user click on My Account link
#	And user click on Payments link
#	Then delete all credit cards from My Account
	