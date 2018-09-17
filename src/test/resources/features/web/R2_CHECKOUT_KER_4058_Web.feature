Feature: [Web]Restricted shipping to PO,APO , FPO boxes

#@R2_Web @R2_Regression @KER-4058 @ZYP_CART_K4058-9833 @CR-RKA 
#Scenario: Verify user will be prevented from adding restricted products to PO box in shipping address.
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then user navigate to GunStorageAndSafty L_Three   
#    Then user select the product from L_Three and navigate to PDP
#    And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button 
#	And user click on checkout button in Cart page
#	Then user fill the PO box in shipping address and verify error message 
	##not to include
	
	
	
	
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058 @ZYP_CHECKOUT_K4058-9834 @CR-RKA
	Scenario: Verify user will be prevented from adding restricted products to APO box in shipping address.
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak  
	Then usr select the kayak and navigate to PDP page 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up
	  And user enter First name "FirstName" 
     	And user enter Last name "LastName" 
    	And user enter Phone number "PhoneNumber" 
	    And user enter Address "Address" 
    	And user enter Zipcode "ZipCodeForAPO" 
	   And user click on Go To Shipping Method button in Checkout page 
	    Then Verify the message on the page
	    |#verify following MSG should come|
	    |We are unable to ship to PO, APO and FPO. Please change your shipping address.|
	   
	   
	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058 @ZYP_CHECKOUT_K4058-9835 @CR-RKA
	   Scenario: Verify user will be prevented from adding restricted products to FPO box in shipping address
	   Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak  
	Then usr select the kayak and navigate to PDP page 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up
	  And user enter First name "FirstName" 
     	And user enter Last name "LastName" 
    	And user enter Phone number "PhoneNumber" 
	    And user enter Address "Address" 
    	And user enter Zipcode "ZipCodeForAPO" 
	   And user click on Go To Shipping Method button in Checkout page 
	    Then Verify the message on the page
	    |#verify following MSG should come|
	    |We are unable to ship to PO, APO and FPO. Please change your shipping address.|
	   
	   @R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4058 @ZYP_CHECKOUT_K4058-9836 @CR-RKA
	   Scenario: Verify if user selected PO Box address in shipping section, user can see the error message when adding the restricted items in cart.
	   
	    Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to L_Three Kayak  
	Then usr select the kayak and navigate to PDP page 
	And user click on Add to Cart Button 
	Then user click on checkout from ATC pop up
	  And user enter First name "FirstName" 
     	And user enter Last name "LastName" 
    	And user enter Phone number "PhoneNumber" 
	    And user enter Address "Address" 
    	And user enter Zipcode "ZipCodeForPO" 
	   And user click on Go To Shipping Method button in Checkout page 
	    Then Verify the message on the page
	    |#verify following MSG should come|
	    |We are unable to ship to PO, APO and FPO. Please change your shipping address.|
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   