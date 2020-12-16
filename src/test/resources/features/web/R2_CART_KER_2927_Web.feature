Feature: Display Estimated Tax and Total in Cart 

@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2927
@ZYP_CART_K2927-8126 @CR-SK @1HR_R2 @C-BOPIS    @TC-OMNI-13472
Scenario: To verify Tax recalculation when items are edited 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	And user makes a note of tax calculation 
	When user increases products quantity 
	Then cart page displays updated tax 
	When user navigates to checkout page 
	Then checkout page displays updated tax 
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2927 @ZYP_CART_K2927-8127  @TC-OMNI-13472
@CR-SK @C-BOPIS @RegressionP2
Scenario: To verify Tax recalculation when items are edited 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	And user makes a note of tax calculation 
	When user increases products quantity 
	Then cart page displays increased tax 
	When user navigates to checkout page 
	Then checkout page displays increased tax 
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2927 @ZYP_CART_K2927-8128
@CR-SK @C-BOPIS 
Scenario: To verify Tax recalculation when quantity is 0 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And User clicks on ASO Logo and should be navigated to Home Page 
	And User navigates to L2 Womens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	And user makes a note of tax calculation 
	When user decreases product quantity to zero 
	Then cart page displays updated tax 
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2927 @ZYP_CART_K2927-8119
@CR-SK @C-BOPIS 
Scenario: To Verify Estimated Tax under the Order Summary in Cart - Authentic User 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	Then estimated tax Is populated separately under Order Summary 
	And Total amount including Tax Is populated separately under Order Summary 
	When user navigates to checkout page 
	Then user verifies estimated tax and total on checkout page 
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2927
@ZYP_CART_K2927-8129 @CR-SK @C-BOPIS 
Scenario: To verify Tax recalculation when switch between Shipping & Store Pick up 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	And user selects Ship To Me radio button 
	And user makes a note of tax calculation 
	When user switches the shipping to Store Pick up 
	Then cart page displays updated tax 
	When user navigates to checkout page 
	Then checkout page displays updated tax 
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2927
@ZYP_CART_K2927-9652 @CR-SK @C-BOPIS 
Scenario: To verify Tax recalculation when user switches from Shipping to store pickup 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	And user selects Ship To Me radio button 
	And user makes a note of tax calculation 
	When user switches the shipping to Store Pick up 
	Then cart page displays updated tax 
	When user navigates to checkout page 
	Then checkout page displays updated tax 
	
@R2_Mobile @R2_NonRegression @R2_All @1HR_R2 @P1 @CB-Cart @KER-2927
@ZYP_CART_K2927-9653 @CR-SK @C-BOPIS @vidya
Scenario: To verify Tax recalculation when user switches from store pickup to  Shipping 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	And user enters "ZIPCODE" in change zipcode field in cart page 
	And user selects the ship to Store Pick up radio button 
	And user makes a note of tax calculation 
	When user switches from Store Pick up to Shipping 
	Then cart page displays updated tax 
	When user navigates to checkout page 
	Then checkout page displays updated tax 
	
	
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2927 @ZYP_CART_K2927-8120
@CR-SK @C-BOPIS 
Scenario: To Verify Estimated Tax under the Order Summary in Cart - Unauthenticated User 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	And user makes a note of tax calculation 
	When user enters "FindStoreZipcode" in change zipcode field in cart page 
	Then cart page displays updated tax 
	And estimated tax Is populated separately under Order Summary 
	And Total amount including Tax Is populated separately under Order Summary 
	When user navigates to checkout page 
	Then user verifies estimated tax and total on checkout page 
	
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2927 @ZYP_CART_K2927-8125
@CR-SK @C-BOPIS 
Scenario: To Verify Estimated Tax under the Order Summary in Cart - Unauthenticated User 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	When user enters "FindStoreZipcode" in change zipcode field in cart page 
	Then cart page displays updated tax 
	And tax displayed on cart is greater than zero 
	And user makes a note of tax and total amount 
	When user navigates to checkout page 
	Then tax and total amount displayed in checkout page is same as cart page 
	
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-8124 @ZYP_CART_K2927-8124
@CR-SK @C-BOPIS 
Scenario: To Verify Available Taxes and Tax is > $0.00 - Authenticated User 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "UserWithTaxableAddress" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	And user enters "FindStoreZipcode" in change zipcode field in cart page 
	Then tax displayed on cart is greater than zero 
	And user makes a note of tax and total amount 
	When user navigates to checkout page 
	Then tax and total amount displayed in checkout page is same as cart page 
	
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2927 @ZYP_CART_K2927-8121
@CR-SK @C-BOPIS 
Scenario: To Verify Estimated Tax under the Order Summary in Cart - Unauthenticated User 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user enters "SKUForBopisProduct" in the search box 
	#	And  user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	#	And user navigate to Cart page
	Then user navigates to Cart Page 
	And user selects the ship to Store Pick up radio button 
	And user makes a note of tax calculation 
	When user switches from Store Pick up to Shipping 
	Then cart page displays updated tax 
	And estimated tax Is populated separately under Order Summary 
	And Total amount including Tax Is populated separately under Order Summary 
	When user navigates to checkout page 
	Then user verifies estimated tax and total on checkout page 
	
	