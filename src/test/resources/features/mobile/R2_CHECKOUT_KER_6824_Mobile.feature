Feature: Verfiy Gift Card - Unauthenticated User Applying Gift Card at Checkout 


@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6824-8632 @CR-DPK 
Scenario: Verify the Hide Gift Card CTA behavior
	Given user launches the browser and navigates to "ASO_HOME" page  
	And User clicks on the burger menu 
	 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	Then user click on checkout button in Cart page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	And user click on go to payment present in shipping method
	Then user click on GiftCard Plus icon in Checkout page
	Then Verify below Sub/Main Module of Checkout Page
	|#%%%%%  Gift Card  %%%%%%%%%%|
		|Hide_GiftCard|
		|GiftCardNumber_Txt|
		|GiftCardNumber_Input|
		|GiftCardNumber_Tooltip|
		|Pin_Txt|
		|Pin_Input|
		|toolTip_pin|
		|Apply_Btn|
	Then user click on GiftCard Minus icon in Checkout page	 	
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6824-10196 @CR-DPK
	Scenario: Verify the error message when user enters valid new Gift card with valid old PIN in Checkout for payment
	Given user launches the browser and navigates to "ASO_HOME" page  
	And User clicks on the burger menu 
	 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	Then user click on checkout button in Cart page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	And user click on go to payment present in shipping method 
	Then user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "validGiftCardNumber"
	And user enter Pin Number "OldPinNumber" 
	And user click on Apply button
	Then Verify the message on the page
   |#Verify following error Msg in Gift card section |
   |Invalid Gift Card Number/Insufficient Funds|
		