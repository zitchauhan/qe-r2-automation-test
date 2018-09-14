Feature: B03-500-SOF Checkout landing and variations

# KER-12636
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-7033 @ZYP_CHECKOUT_K7033-10043 @CR-MS
Scenario:  Verify that the user is able to see the firearm specific compliance rules
    Given user launches the browser and navigates to "ASO_HOME" page
    And User clicks on the burger menu
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User clicks on the burger menu
	When user clicks on one of the category and navigates to LOne SOF
	Then user clicks on one of the subcategory and navigates to LTwo SOF
	Then user clicks on one of the product category and navigates to LThree SOF
	Then User is navigated to pdp page
	And user click on Add to Cart Button
	And user will click on View Cart button 
	And user navigate to Cart page  
	When user will click on Checkout button and navigates to Checkout page
	    And Verify below Sub/Main Module of Checkout Page 
		|# Following button and success message on checkout page|
		|ShipToStoreforSOF_Txt|
		|ShipToStoreforSOF_compliance_Txt|
		|ShipToStoreforSOF_Payment_Btn|

#KER-12636		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-7033 @ZYP_CHECKOUT_K7033-10048 @CR-MS
Scenario:  Verify that user is able to proceed to checkout after accepting the firearm specific compliance rules
    Given user launches the browser and navigates to "ASO_HOME" page
    And User clicks on the burger menu
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User clicks on the burger menu
	When user clicks on one of the category and navigates to LOne SOF
	Then user clicks on one of the subcategory and navigates to LTwo SOF
	Then user clicks on one of the product category and navigates to LThree SOF
	Then User is navigated to pdp page
	And user click on Add to Cart Button
	And user will click on View Cart button 
	And user navigate to Cart page  
	When user will click on Checkout button and navigates to Checkout page
	    And Verify below Sub/Main Module of Checkout Page 
		|# Following button and success message on checkout page|
		|ShipToStoreforSOF_Txt|
		|ShipToStoreforSOF_compliance_Txt|
		|ShipToStoreforSOF_Payment_Btn|
	And user does accepts the firearm specific compliance
	And user clicks on Continue button	
    Then verify that user navigates to payment drawer
		
		
		
		
		
		
		
		
				