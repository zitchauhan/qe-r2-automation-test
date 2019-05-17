Feature: [Web]Restricted shipping to PO,APO , FPO boxes 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058
@ZYP_CHECKOUT_K4058-9833 @CR-RKA @C1-Message 
Scenario: Verify user will be prevented from adding restricted products to PO box in shipping address. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak 
	Then usr select the kayak and navigate to PDP page 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user click on viewcart button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZipCodeForPO" 
	And user click on Go To Shipping Method button in Checkout page 
	#	    Then Verify the message on the page
	#	    |#verify following MSG should come|
	#	  |Please select a different state or remove the item(s) from cart.|
	
	
	
	
	
	
@R2_Web @R2_Regression @R2_All @P-High @1HR_R2 @C-Checkout @KER-4058
@ZYP_CHECKOUT_K4058-9834 @CR-RKA @C1-Message 
Scenario: Verify user will be prevented from adding restricted products to APO box in shipping address. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak 
	Then usr select the kayak and navigate to PDP page 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user click on viewcart button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZipCodeForAPO" 
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|#verify following MSG should come|
		|Please select a different state or remove the item(s) from cart.|
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058
@ZYP_CHECKOUT_K4058-9835 @CR-RKA @C1-Message 
Scenario: Verify user will be prevented from adding restricted products to FPO box in shipping address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak 
	Then usr select the kayak and navigate to PDP page 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user click on viewcart button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZipCodeForAPO" 
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|#verify following MSG should come|
		|Please select a different state or remove the item(s) from cart.|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058
@ZYP_CHECKOUT_K4058-9836 @CR-RKA @C1-Message 
Scenario: Verify if user selected PO Box address in shipping section, user can see the error message when adding the restricted items in cart. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak 
	Then usr select the kayak and navigate to PDP page 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user click on viewcart button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZipCodeForPO" 
	And user click on Go To Shipping Method button in Checkout page 
	#	    Then Verify the message on the page
	#	    |#verify following MSG should come|
	#	    |Please select a different state or remove the item(s) from cart.|
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058
@ZYP_CHECKOUT_K4058-9837 @CR-RKA @C1-Message 
Scenario: Verify if user selected APO Box address in shipping section, user can see the error message when adding the restricted items in cart. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak 
	Then usr select the kayak and navigate to PDP page 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user click on viewcart button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZipCodeForAPO" 
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|#verify following MSG should come|
		|Please select a different state or remove the item(s) from cart.|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058
@ZYP_CHECKOUT_K4058-9839 @CR-RKA @C1-Message 
Scenario: Verify if user selected FPO Box address in shipping section,user can see the error message when adding the restricted items in cart. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak 
	Then usr select the kayak and navigate to PDP page 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user click on viewcart button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZipCodeForFPO" 
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|#verify following MSG should come|
		|Please select a different state or remove the item(s) from cart.|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058
@ZYP_CHECKOUT_K4058-9840 @CR-RKA @C1-Message 
Scenario: Verify if unauthenticated user selected PO Box address in shipping section, unauthenticated user can see the error message when sign in on checkout page. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak 
	Then usr select the kayak and navigate to PDP page 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user click on viewcart button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZipCodeForPO" 
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|#verify following MSG should come|
		|Please select a different state or remove the item(s) from cart.|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058
@ZYP_CHECKOUT_K4058-9842 @CR-RKA @C1-Message 
Scenario: Verify if unauthenticated user selected APO Box address in shipping section, unauthenticated user can see the error message when sign in on checkout page. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak 
	Then usr select the kayak and navigate to PDP page 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user click on viewcart button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZipCodeForAPO" 
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|#verify following MSG should come|
		|Please select a different state or remove the item(s) from cart.|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058
@ZYP_CHECKOUT_K4058-9843 @CR-RKA @C1-Message 
Scenario: Verify if unauthenticated user selected FPO Box address in shipping section, unauthenticated user can see the error message when sign in on checkout page. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak 
	Then usr select the kayak and navigate to PDP page 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user click on viewcart button 
	Then user click on checkout from ATC pop up 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZipCodeForFPO" 
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|#verify following MSG should come|
		|Please select a different state or remove the item(s) from cart.|
		
		
		
		#	    @R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058 @ZYP_CHECKOUT_K4058-9845 @CR-RKA
		#	   Scenario: Verify that ASO application restricts the user to select minimum threshold value to schedule a delivery.
		#	   
		#	          Given user launches the browser and navigates to "ASO_HOME" page 
		#	Then user navigate to L_Three Kayak  
		#	Then usr select the kayak and navigate to PDP page 
		#	And user click on Add to Cart Button 
		#	Then user click on checkout from ATC pop up
		#	  And user enter First name "FirstName" 
		#     	And user enter Last name "LastName" 
		#    	And user enter Phone number "PhoneNumber" 
		#	    
		
		
		
		
		
		
		
		
	   