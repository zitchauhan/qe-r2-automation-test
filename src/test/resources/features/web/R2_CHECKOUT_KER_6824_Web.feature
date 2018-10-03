Feature: Verfiy Gift Card - Unauthenticated User Applying Gift Card at Checkout 


@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6824-8628 @CR-DPK
	Scenario: Verify the gift card fields displayed to Unauthenticated user
	Given user launches the browser and navigates to "ASO_HOME" page  
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
	
@R2_Web @R2_Regression @R2_All @P-Highest @1HR_R2 @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6824-8629 @CR-DPK
	Scenario: Verify 13 or 16 digit Gift Card with 4 or 8 digit PIN applied is reflected on Order summary
	Given user launches the browser and navigates to "ASO_HOME" page  
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
	And user enter Gift card Number "GiftcardNumber"
	And user enter Pin Number "PinNumber" 
	And user click on Apply button
	Then Verify below Sub/Main Module of Checkout Page 
	|# Verify following elements in Checkout page "Order Summary"|
	|giftCards_txt|
	|giftCardsPrice_txt|
	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6824-8630 @CR-DPK
	Scenario: Verify the gift card fields displayed on addition of extra card
	Given user launches the browser and navigates to "ASO_HOME" page  
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
	And user enter Gift card Number "LowBalanceGiftCard"
	And user enter Pin Number "LowBalanceGiftCardPin" 
	And user click on Apply button
	Then Verify below Sub/Main Module of Checkout Page 
	|#%%%%%  Gift Card  %%%%%%%%%%|
	|Plus_AddAnotherGiftCard_Txt|
	
	
@R2_Web @R2_Regression @R2_All @P-Highest @1HR_R2  @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6824-8631 @CR-DPK
	Scenario: Verify +Add Another Gift card link is Suppressed in non-availability of remaining order amount
	Given user launches the browser and navigates to "ASO_HOME" page  
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
	And user enter Gift card Number "GiftcardNumber"
	And user enter Pin Number "PinNumber" 
	And user click on Apply button
	Then Verify below Sub/Main Module of Checkout Page 
	|# Verify following elements in Checkout page "Order Summary"|
	|giftCards_txt|
	|giftCardsPrice_txt|
	Then +Add Another Gift Card should be suppressed	



@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6824-8632 @CR-DPK 
Scenario: Verify the Hide Gift Card CTA behavior
	Given user launches the browser and navigates to "ASO_HOME" page  
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
	


@R2_Web @R2_Regression @R2_All @P-Highest @1HR_R2 @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6824-8646 @CR-DPK
	Scenario: Verify Remove Gift Card behavior for 13 and 16 digit gift card with 4 or 8 digit PIN
	Given user launches the browser and navigates to "ASO_HOME" page  
	And User Navigates L2 form Homepage Header 
   And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	Then user click on checkout button in Cart page
	And user adds shipment address on checkout page for "guest" user
	And user click on go to payment present in shipping method
	Then user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "GiftcardNumber"
	And user enter Pin Number "PinNumber" 
	And user click on Apply button
	Then Verify below Sub/Main Module of Checkout Page 
	|# Verify following elements in Checkout page "Order Summary"|
	|btnToRemoveGiftCardOnCheckoutPage|
	And clicking on Remove and Remove icon should remove the applied GC
	
		
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6824-10196 @CR-DPK
	Scenario: Verify the error message when user enters valid new Gift card with valid old PIN in Checkout for payment
	Given user launches the browser and navigates to "ASO_HOME" page  
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
	And user enter Gift card Number "13DigitsGiftCardNumber"
	And user enter Pin Number "OldPinNumber" 
	And user click on Apply button
	Then Verify the message on the page
   |#Verify following error Msg in Gift card section |
   |Invalid Gift Card Number/Insufficient Funds|	