Feature: B03-500-SOF Checkout landing and variations

# KER-12636
@R2_Mobile @R2_Regression @R2_All @P1 @C-Checkout @KER-7033 @ZYP_CHECKOUT_K7033-10043 @CR-MS @1HR_R2
Scenario:  Verify that the user is able to see the firearm specific compliance rules
    Given user launches the browser and navigates to "ASO_HOME" page
    And User clicks on the burger menu
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "SOFemail" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart
	Then User searches a product "SOFSKUNumber" and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	    And Verify below Sub/Main Module of Checkout Page 
		|# Following button and success message on checkout page|
		|ShipToStoreforSOF_Txt|
		|ShipToStoreforSOF_compliance_Txt|
		|ShipToStoreforSOF_Payment_Btn|

#KER-12636		
@R2_Mobile @R2_Regression @R2_All @P2 @1HR_R2 @C-Checkout @KER-7033 @ZYP_CHECKOUT_K7033-10048 @CR-MS
Scenario:  Verify that user is able to proceed to checkout after accepting the firearm specific compliance rules
    Given user launches the browser and navigates to "ASO_HOME" page
    And User clicks on the burger menu
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "SOFemail" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart
	Then User searches a product "SOFSKUNumber" and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	    And Verify below Sub/Main Module of Checkout Page 
		|# Following button and success message on checkout page|
		|ShipToStoreforSOF_Txt|
		|ShipToStoreforSOF_compliance_Txt|
		|ShipToStoreforSOF_Payment_Btn|
	And user does accepts the firearm specific compliance
	And user clicks on Continue button	
    Then verify that user navigates to payment drawer
    

#KER-12653		
@R2_Mobile @R2_Regression @R2_All @P2 @C-Checkout @KER-7033 @ZYP_CHECKOUT_K7033-10044 @CR-MS
Scenario:  Verify that user is able to proceed to checkout after accepting the firearm specific compliance rules
    Given user launches the browser and navigates to "ASO_HOME" page
    And User clicks on the burger menu
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "SOFemail" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user navigate and deletes existing items in cart
	Then User searches a product "SOFSKUNumber" and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	    And Verify below Sub/Main Module of Checkout Page 
		|# Following button and success message on checkout page|
		|ShipToStoreforSOF_Txt|
		|ShipToStoreforSOF_compliance_Txt|
		|ShipToStoreforSOF_Payment_Btn|
	And user clicks on Continue button	
    And Verify below Sub/Main Module of Checkout Page 
		|# Verify following section SPECIAL ORDER SHIP TO STORE in checkout page|
		|ShipToStoreforSOF_Txt|    
		
		
		
		
		
		
		
		
				