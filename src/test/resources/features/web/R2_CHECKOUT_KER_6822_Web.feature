Feature: B07-250 - Gift Card - Authenticated User: Add New Gift Card at Checkout 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7949 @CR-GK 
Scenario: Verify Add new Gift Card fields 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	And user selects add new gift card option from the dropdown 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%  Gift Card form in payment drawer%%%%%%%%%%|
		|GiftCardNumber_Input|
		|Pin_Input|
		|Apply_Btn| 
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7956 @CR-GK 
Scenario: Verify Gift card balance is Stored in My account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	And user selects add new gift card option from the dropdown 
	And user enter Gift card Number "GiftcardNumber" 
	And user enter Pin Number "PinNumber" 
	And user click on Apply button 
	And user clicks on edit payment cta 
	Then applied gift card "GiftcardNumber" should be displayed 
	And User navigates from checkout to payments in myaccount 
	Then user should be able to see "GiftcardNumber" Gift card 
	
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7953 @CR-GK 
Scenario: Verify Gift card fields displayed - No Previous Gift Cards Saved 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%  Gift Card form in payment drawer%%%%%%%%%%|
		|GiftCardNumber_Input|
		|Pin_Input|
		|Apply_Btn|
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7917 @CR-GK 
Scenario: Verify Add new gift card during checkout user has Saved Gift Cards 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	And user clicks on edit payment cta 
	And user click on GiftCard Plus icon in Checkout page 
	And user selects add new gift card option from the dropdown 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%  Gift Card form in payment drawer%%%%%%%%%%|
		|GiftCardNumber_Input|
		|Pin_Input|
		|Apply_Btn|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-7954 @CR-GK 
Scenario: Verify Valid gift card is applied for purchases 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	Then user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "GiftcardNumber" 
	And user enter Pin Number "PinNumber" 
	And user click on Apply button 
	Then gift card balance is applied towards the purchase 
	And Verify below Sub/Main Module of Checkout Page 
		|# Following button and success message on checkout page|
		|GiftCardAppliedSuccessMsg|
		
		
@R2_Web @R2_Regression @R2_All @P-Highest @1HR @C-Checkout @KER-6822 
@ZYP_CHECKOUT_K6822-10193 @CR-GK 
Scenario: 
	Verify the user can enter valid new Gift card with 13 or 16 digit in Checkout for payment 
			verify the display of error message when an unauthenticated user is trying to add a GC that starts with 777 series at checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	And user is navigated to order summary page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page 
	And user click on GiftCard Plus icon in Checkout page 
	And user enter Gift card Number "Series777GiftCard" 
	And user enter Pin Number "Series777GiftCardPin" 
	When user click on Apply button 
	Then Verify the message on the page 
		|# Following physical gift card retention message should show on the page	|
		|Please keep your physical gift card for future reference to assit with any returns or oder cancellations.	|
	And Verify below Sub/Main Module of Checkout Page 
		|# Following button and success message on checkout page|
		|GiftCardAppliedSuccessMsg|
		|btnToRemoveGiftCardOnCheckoutPage|