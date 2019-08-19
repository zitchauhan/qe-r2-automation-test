Feature: B03-500-SOF Checkout landing and variations

@R2_Web @Regression @R2_All @P-Low @C-Checkout @KER-7033 @ZYP_CHECKOUT_K7033-10048 @CR-MS 
Scenario: Verify that user is able to proceed to checkout after accepting the firearm specific compliance rules
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "SOFemail" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart
	When User searches a product "SOFSKUNumber" and navigates to PDP 
     #And user click on Add to Cart Button
    And user click on ship it button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page
	And user does accepts the firearm specific compliance
    And user clicks on Continue button
    Then verify that user navigates to payment drawer

@R2_Web @Regression @R2_All @P-Low @C-Checkout @KER-7033 @ZYP_CHECKOUT_K7033-10044 @CR-MS
Scenario: Verify that the user is not able to proceed to checkout without accepting the firearm specific compliance rules
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "SOFemail" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart
	When User searches a product "SOFSKUNumber" and navigates to PDP 
     #And user click on Add to Cart Button
    And user click on ship it button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page
	And user clicks on Continue button
	#NEED STEP TO VERIFY ERROR MSG	
    		