Feature: [Mobile] Populate Billing Address on Checkout page

@R2_Mobile @R2_Regression  @C-Checkout @KER-3132 @ZYP_CART_K3132-8116 @CR-RKA 
Scenario: Verify Billing address on check out Page - Same as Shipping Address
      Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
  	    And user enter First name "FirstName" 
     	And user enter Last name "LastName" 
    	And user enter Phone number "PhoneNumber" 
	    And user enter Address "Address" 
    	And user enter Zipcode "zipcode" 
	   And user click on Go To Shipping Method button in Checkout page 
      Then user compare Shipping Address is same as Billing Address 
      Then Verify below Sub/Main Module of Checkout Page 
      |checkout_ShippingAddress_txt								|
      |SameAsShippingAddress_Txt|
      
      
      @R2_Mobile @R2_Regression  @C-Checkout @KER-3132 @ZYP_CART_K3132-8118 @CR-RKA 
      Scenario: Verify Billing address on check out Page - new address information
       
         Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
  	    And user enter First name "FirstName" 
     	And user enter Last name "LastName" 
    	And user enter Phone number "PhoneNumber" 
	    And user enter Address "Address" 
    	And user enter Zipcode "zipcode" 
   And user click on Go To Shipping Method button in Checkout page 
	   Then user fill the payment details 
	   Then user click on edit Payment link and click on billing information 
	   
	   