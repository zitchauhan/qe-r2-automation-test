Feature: B07-250 - Gift Card - Authenticated User Using Saved GC at Checkout 


@R2_Web @R2_Regression @R2_All @P-Highest @1HR @C-Checkout @KER-6823 
@ZYP_CHECKOUT_K6823-8657 @CR-RKA @1HR_R2 
Scenario: 
	Verify choose gift card option for authenticated User with 13 and 16 digit Gift Card having 4 or 8 digit PIN 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then user click on My Account and navigate to payment 
	And user deletes all the GiftCards in MyAccount Payment page 
	When user clicks on Add New Gift Card button 
	Then user fill the gift card in My Account 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#Then user click on Add to Cart Button 
	And user click on ship it button 
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	#Then user click on checkout from ATC pop up 
	And user click on GiftCard Plus icon in Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify in choose gift card dropdown default gift card is showing|
		|ChoosegiftCard_Dd|
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6823 
@ZYP_CHECKOUT_K6823-8671 @CR-RKA 
Scenario: Verify one gift card applied and Balance is not covered in full 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	And user deletes all the GiftCards in MyAccount Payment page 
	When user clicks on Add New Gift Card button 
	Then user fill the gift card in My Account 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user click on checkout from ATC pop up 
	And user click on GiftCard Plus icon in Checkout page 
	Then user click on choose Gift card Dropdown 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify add new giftcard is displayed |
		|AddAnewGiftCard_Txt|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6823 
@ZYP_CHECKOUT_K6823-11184 @CR-RKA 
Scenario: 
	To verify the GC in 'Choose Gift Card' drop down should be disabled for an authenticated user if full balance of the GC utilized in order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then user click on My Account and navigate to payment 
	And user deletes all the GiftCards in MyAccount Payment page 
	When user clicks on Add New Gift Card button 
	Then user fill the gift card in My Account 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	Then user change the quantity of item in PDP 
	#Then user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page 
	#  Then user click on checkout from ATC pop up
	And user click on GiftCard Plus icon in Checkout page 
	Then user click on choose Gift card Dropdown 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify add new giftcard is displayed |
		|AddAnewGiftCard_Txt|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6823 
@ZYP_CHECKOUT_K6823-8672 @CR-RKA 
Scenario: 
	Verify saved another gift card drop down having 13 and 16 digit GC with 4 or 8 digit PIN 

	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	Then user fill the gift card in My Account 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#Then user click on Add to Cart Button 
	And user click on ship it button 
	#  Then user click on checkout from ATC pop up
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page 
	And user click on GiftCard Plus icon in Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify user is able to see choose gift card Drop down|
		|ChoosegiftCard_Dd|
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-6823 
@ZYP_CHECKOUT_K6823-8673 @CR-RKA 
Scenario: Verify No second Saved Gift Card for Authenticated user 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then user click on My Account and navigate to payment 
	And user deletes all the GiftCards in MyAccount Payment page 
	When user clicks on Add New Gift Card button 
	Then user fill the gift card in My Account 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#Then user click on Add to Cart Button
	And user click on ship it button  
	#  Then user click on checkout from ATC pop up
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page 
	And user click on GiftCard Plus icon in Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify user is able to see Gift cart ending digit in choose gift card Dropdown|
		|ChoosegiftCard_Dd|
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-6823 
@ZYP_CHECKOUT_K6823-8675 @CR-RKA 
Scenario: Verify +Add another Gift card is Suppressed 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then user click on My Account and navigate to payment 
	And user deletes all the GiftCards in MyAccount Payment page 
	When user clicks on Add New Gift Card button 
	Then user fill the gift card in My Account 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	#Then user click on checkout from ATC pop up 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify in choose gift card dropdown default gift card is showing|
		|ChoosegiftCard_Dd| 
	And user click on apply giftcard button 
	And user click on remove gift card 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-6823 
@ZYP_CHECKOUT_K6823-8682 @CR-RKA 
Scenario: Verify remove all gift cards 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then user click on My Account and navigate to payment 
	And user deletes all the GiftCards in MyAccount Payment page 
	When user clicks on Add New Gift Card button 
	Then user fill the gift card in My Account 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#Then user click on Add to Cart Button 
	And user click on ship it button 
	#  Then user click on checkout from ATC pop up
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page 
	And user click on GiftCard Plus icon in Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify user is able to see choose gift card Drop down|
		|ChoosegiftCard_Dd|
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-6823 
@ZYP_CHECKOUT_K6823-8658 @CR-RKA 
Scenario: Verify Gift Card Chronology and Balance 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then user click on My Account and navigate to payment 
	And user deletes all the GiftCards in MyAccount Payment page 
	When user clicks on Add New Gift Card button 
	Then user fill the gift card in My Account 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#Then user click on Add to Cart Button 
	And user click on ship it button 
	#  Then user click on checkout from ATC pop up
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page 
	And user click on GiftCard Plus icon in Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#verify user is able to see chronology and balance in choose gift card|
		|ChoosegiftCard_Dd|
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-6823 
@ZYP_CHECKOUT_K6823-8659 @CR-RKA 
Scenario: Verify Gift card drop down supressed 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	Then user click on My Account and navigate to payment 
	And user deletes all the GiftCards in MyAccount Payment page 
	When user clicks on Add New Gift Card button 
	Then user fill the gift card in My Account 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#Then user click on Add to Cart Button 
	And user click on ship it button  
	#  Then user click on checkout from ATC pop up
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page 
	And user click on GiftCard Plus icon in Checkout page 
	Then user click on apply giftcard button 
	Then user click on remove gift card 
		
		