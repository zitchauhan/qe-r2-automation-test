Feature: Regression P2 scenarios

	@P2 @RegressionP2
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

	@RegressionP2 @SR-1311
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
	
  @RegressionP2 @SR-1312
	Scenario: Verify user is able to get 5% offer for every purchase
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user enter the valid emailaddress "Email_SavedCard" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart 
 	And User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user click on REVIEW ORDER button
	And user expect element Order Summary to be present
	And user expect discount text to be present 
	Then user expect five percent discount 
	And user expect element free shipping should not be available 
	When user click on edit my cart link 
	Then user click on remove from cart 
	
	 	
 	@PDP @RegressionP2 @SR-1313
 	Scenario: Estimate date is visible for STS item on PDP page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "STS_Regular_Product" and navigates to PDP 
	And user validates estimated date is visible on "PDP"
	And user click on ship it button 
	And user click on view cart
	Then user select in store pickup option
	And user validates estimated date is visible on "Cart"
	
	@PDP @RegressionP2 @SR-1314
 	Scenario: Validate Pickup Date for BOPIS elgiible items are correctly visible on PDP page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user validates Pick Up Today is visible on "PDP"
	And user click on ship it button 
	And user click on view cart
	Then user select in store pickup option
	And user validates Pick Up Today is visible on "Cart"
	
	@PDP @RegressionP2 @SR-1315
	Scenario: Validate Pickup Date for BOPIS elgiible items and Estimate date for STS eligible items should be 
	visible on Add to Cart modal when these items are added as STH, also PICKUP CTA should be there
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user validates Pick Up Today is visible on "PDP"
	And user click on ship it button
	Then user validates same bopis date is visible on cart modal as on PDP for "BOPIS"
	Then user click on continue shopping
	And User searches a product "STS_Regular_Product" and navigates to PDP 
	And user validates estimated date is visible on "PDP"
	And user click on ship it button 
	Then user validates same bopis date is visible on cart modal as on PDP for "STS"
	
	@Checkout @RegressionP2 @SR-1316
	Scenario: Verify user is able to apply promo code in cart page and place order using GC as tender type
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header
	And user enter the valid emailaddress "Email_SavedCard" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart 
	And User Navigates L2 form Homepage Header 
  And User clicks on product in PLP
	And user click on ship it button
	And user will click on View Cart button 
	When enter the "EnterQuantityGreaterThenOne" to X 
	And user view and Applied Promotions/Discounts "Promocode"    
	Then Verify below Sub/Main Module of Cart Page 
		|Total_txt|
		|SubTotal_txt|
		|EstimatedTaxes_txt|
		|Discount_Txt|	 
	And user clicks on checkout button on cart page	
	Then user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	And user enter the email address for order confirmation
	Then user click on review order button
	And user clicks on place order on checkout page 
	And verify user is able to successfully place the order  
	Then verify discount is displayed
	
	@Checkout @RegressionP2 @SR-1317
	Scenario: Verify discount should not be applied for PLCC+GC as payment type
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header
	And user enter the valid emailaddress "Email_SavedCard" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart 
	And User searches a product "High_Price_SKU" and navigates to PDP 
	And user click on ship it button
	And user will click on View Cart button 
	And user clicks on checkout button on cart page	
	Then user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	#And user enter the email address for order confirmation
	Then user click on review order button
	Then user expect element Discount not to be present
	
	