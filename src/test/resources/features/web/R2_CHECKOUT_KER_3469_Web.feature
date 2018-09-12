Feature: B06-225 - BOPIS Pick-Up Person 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3469 
@ZYP_CHECKOUT_K3469-10872 @CR-GK 
Scenario: Verify BOPIS Pick Up Person - Authenticated user -Alternate Person 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user click on In-Store Pick up edit button 
	And user select me + alternate pickup person 
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page bopis pickup|
		|StorePickupAlternatesFirstName_input|
		|StorePickupAlternatesLastName_input|
		|StorePickupAlternatesEmail_input|
		|StorePickupAlternatesPhoneNumber_input|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3469 
@ZYP_CHECKOUT_K3469-10874 @CR-GK 
Scenario: 
	Verify BOPIS Pick Up Person - Un Authenticated user - Alternate Pick up 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user click on In-Store Pick up edit button 
	And user select me + alternate pickup person 
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page bopis pickup|
		|StorePickupAlternatesFirstName_input|
		|StorePickupAlternatesLastName_input|
		|StorePickupAlternatesEmail_input|
		|StorePickupAlternatesPhoneNumber_input|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3469 
@ZYP_CHECKOUT_K3469-10876 @CR-GK 
Scenario: Verify BOPIS Pick Up Person - Continue to Complete Payment 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And user click on In-Store Pick up edit button 
	When user click on confirm button 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify user can view the Payment drawer|
		|PaymentHeader_Txt|
		|PaymentMethodHeader_Txt|
		|CreditCard_radioBtn|
		|PayPal_radioBtn|
		|CreditCardNumber_Input|
		|ExpirationDate_Input|
		|Cvv_Input|
		|CvvToolTip|
