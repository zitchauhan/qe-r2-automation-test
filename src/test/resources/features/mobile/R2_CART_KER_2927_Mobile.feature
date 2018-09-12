Feature: Display Estimated Tax and Total in Cart

####Executed
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2927 @ZYP_CART_K2927-8126_M @CR-SK 
Scenario: To verify Tax recalculation when items are edited 	
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And  user click on Add to Cart Button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user makes a note of tax calculation
	When user increases products quantity 
	Then cart page displays updated tax
	When user navigates to checkout page
	Then checkout page displays updated tax
		
	
#####Executed
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2927 @ZYP_CART_K2927-8127_M @CR-SK 
Scenario: To verify Tax recalculation when items are edited 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And  user click on Add to Cart Button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user makes a note of tax calculation
	When user increases products quantity 
	Then cart page displays increased tax
	When user navigates to checkout page
	Then checkout page displays increased tax

######Executed	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2927 @ZYP_CART_K2927-8128_M @CR-SK 
Scenario: To verify Tax recalculation when quantity is 0
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And  user click on Add to Cart Button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And User clicks on ASO Logo and should be navigated to Home Page
	And User clicks on the burger menu 
	And User navigates to L3 of women clothes 
	And user clicks on the product card and navigates to PDP 
	And  user click on Add to Cart Button
	And  user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user navigate to Cart page
	And user makes a note of tax calculation
	When user decreases product quantity to zero
	Then cart page displays updated tax
#	
########Executed	
#@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2927 @ZYP_CART_K2927-8119_M @CR-SK 
#Scenario: To Verify Estimated Tax under the Order Summary in Cart - Authentic User 
#	Given user launches the browser and navigates to "ASO_HOME" page
#	And User clicks on the burger menu 
#	And user should able to click on Signin button 
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button  
#	And User clicks on the burger menu 
#	And User navigates to LThree 
#	And user clicks on the product card and navigates to PDP 
#	And  user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	When user navigate to Cart page
#	Then estimated tax Is populated separately under Order Summary
#	And Total amount including Tax Is populated separately under Order Summary
#	When user navigates to checkout page
#	Then user verifies estimated tax and total on checkout page
#	
########### Failing - Manual as well - Taxes are being displayed 0
#@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2927 @ZYP_CART_K2927-8129_M @CR-SK 
#Scenario: To verify Tax recalculation when switch between Shipping & Store Pick up
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User clicks on the burger menu 
#	And User navigates to LThree 
#	And user clicks on the product card and navigates to PDP 
#	And  user click on Add to Cart Button
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	And user navigate to Cart page
#	And user selects Ship To Me radio button
#	And user makes a note of tax calculation
#	When user switches the shipping to Store Pick up
#	Then cart page displays updated tax
#	When user navigates to checkout page
#	Then checkout page displays updated tax

############# Failing - Manual as well - Taxes are being displayed as 0
@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2927 @ZYP_CART_K2927-9652_M @CR-SK 
Scenario: To verify Tax recalculation when user switches from Shipping to store pickup 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And  user click on Add to Cart Button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user selects Ship To Me radio button
	And user makes a note of tax calculation
	When user switches the shipping to Store Pick up
	Then cart page displays updated tax
	When user navigates to checkout page
	Then checkout page displays updated tax


############### Failing - Manual as well - Taxes are being displayed as 0
#@R2_Mobile @R2_Regression @R2_All @1HR_R2 @P-Highest @C-Cart @KER-2927 @ZYP_CART_K2927-9653_M @CR-SK
#Scenario: To verify Tax recalculation when user switches from store pickup to  Shipping
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User clicks on the burger menu 
#	And User navigates to LThree 
#	And user clicks on the product card and navigates to PDP 
#	And  user click on Add to Cart Button
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page
#	And user selects the ship to Store Pick up radio button
#	And user makes a note of tax calculation
#	When user switches from Store Pick up to Shipping
#	Then cart page displays updated tax
#	When user navigates to checkout page
#	Then checkout page displays updated tax
#
######## Execution pending-------------Incorrect
#@R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-2927 @ZYP_CART_K2927-8130_M @CR-SK 
#Scenario: To verify Tax recalculation when switch between Shipping & Store Pick up
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User clicks on the burger menu 
#	And User navigates to LThree 
#	And user clicks on the product card and navigates to PDP 
#	And  user click on Add to Cart Button
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user navigate to Cart page
#	And user selects Ship To Me radio button
#	And user makes a note of tax calculation
#	When user switches the shipping to Store Pick up
#	Then cart page displays updated tax
#	When user navigates to checkout page
#	Then checkout page displays updated tax
#
#	