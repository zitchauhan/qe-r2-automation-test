Feature: B04-250- Guest Checkout Flow 

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8237 @CR-GK 
Scenario: Verify the guest user is able to view the Zipcode on checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user click on viewcart button
	And user click on checkout button 
	And user navigate to Cart page 
	And enters the "FindAsStoreZIPCode" zip on the Cart page 
	And click on submit button on calculate shipping model 
	And user click on checkout button in Cart page 
	Then Guest User should be able to see the "FindAsStoreZIPCode" zipcode pre-populated on Checkout page 
	
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8239 @CR-GK 
Scenario: Verify the guest user is able to view the Checkout Header and Footer on Checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page|
		|checkout_YouAreCheckingOutAsGuest_txt		|
		|checkout_CheckoutHeader_txt				|
		|CheckOut_CheckOutFooter                    |
		
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8240 @CR-GK 
Scenario: Verify the guest user is able to see the pre-populated City/State with Zipcode 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And enters the "FindAsStoreZIPCode" zip on the Cart page 
	And click on submit button on calculate shipping model 
	And user click on checkout button in Cart page 
	Then Guest User should be able to see the "FindAsStoreZIPCode" zipcode pre-populated on Checkout page 
	And City/State on the basis of the Zipcode should also be pre-populated on Checkout page 
	
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8241 @CR-GK 
Scenario: Verify the guest user is able to enter the shipping address details on Checkout page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	Then user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter a zip code|
		
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8242 @CR-GK 
Scenario: Verify the system triggers the Address Verification (AVS) to guest user on wrong address entry 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "AVSAddress" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Verify below in address verification model in  shipping %%%%%%%%%%|
		|AddressVerificationSystemModelPopUp                 |
		|checkout_ShippingAddress_AVSModelSuggestedAddress   |
		|checkout_ShippingAddress_AVSModelSelectAddress_btn  |
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8244 @CR-GK 
Scenario: Verify the guest user is able to edit the Saved address in the Shipping address
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page 
	And Verify below Sub/Main Module of Checkout Page 
		|#%%%%  Verify below in shipping drawer in checkout page %%%%%%%|
		|checkout_ShippingAddress_Edit_lnk		|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8245 @CR-GK 
Scenario: Verify the guest user is displayed with required validations and errors on shipping address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter the First Name|
		|Please Enter a Last Name|
		|Please enter a phone number|
		|Please enter a street address|
		|Required|		
		|Please enter a zip code|
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	Then  user click on Go To Shipping Method button in Checkout page 
	Then  Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Verify below in address verification model in  shipping %%%%%%%%%%|
		|AddressVerificationSystemModelPopUp                 |
		|checkout_ShippingAddress_AVSModelSuggestedAddress   |
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	
	
	
@R2_Mobile @R2_Regression @R2_All @P1 @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8246 @CR-GK 
Scenario: Verify the guest user is able to select the shipping method from the list
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	Then  Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Verify below in checkout page shipping method drawer %%%%%%%%%%|
		|checkout_ShippingMethod_ShippingMethodHeader_txt			|
		|checkout_ShippingMethod_Shipment_txt						|
		|checkout_ShippingMethod_Items_txt							|
		|checkout_ShippingMethod_ItemImage_img						|
		|checkout_ShippingMethod_ShippingMethodType_btn				|
		|checkout_ShippingMethod_GoToPayment_btn					|		
		
		
@R2_Mobile @R2_Regression @R2_All @P1 @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8248 @CR-GK 
Scenario: Verify the guest user is able to select the Credit Card payment method in order to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	Then  Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Verify below in checkout page payment drawer %%%%%%%%%%|
		|PaymentMethodHeader_Txt|
		|CreditCard_radioBtn|
		|CreditCardNumber_Input|
		|ExpirationDate_Input|
		|Cvv_Input|
		|CvvToolTip|
		|BillingInformation_Txt|
		|SameAsShippingAddress_Txt|
		|SameAsShippingAddress_checkBox|
		|ReviewOrder_Btn|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8249 @CR-GK 
Scenario: Verify the guest user is able to select the PayPal payment method in order to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	Then user click on paypal radiobtn 
	And user switch to iframe to verify paypalcheckoutBtn 
	And  Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Verify user is able to see paypal checkout button %%%%%%%%%%|
		|PayPalCheckOut_Btn|
		
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8250 @CR-GK 
Scenario: Verify the guest user is able to select the Gift Card payment method in order to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And user clicks on Add Gift Card link 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%   Verify user is able to see below mentioned in checkout page %%|
		|Hide_GiftCard          |
		|GiftCardNumber_Input   |
		|GiftCardNumber_Tooltip |
		|Pin_Input              |
		|toolTip_pin            |
		|Apply_Btn              |
		|ReviewOrder_Btn        |
		
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8251 @CR-GK 
Scenario: Verify the guest user is able to add new Credit Card as payment method in order to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And user fill the credit card detail in payment 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%   user can see the credit card image logo %%|
		|Checkout_CreditCardPay_ImgLogo|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8253 @CR-GK 
Scenario: Verify the guest user is able to enter a different Billing address on Payment drawer 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And user uncheck the checkbox for Billing address different from shipping address 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "ShippingRestrictedZipCode" , "EmailAddress" 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%  user can see the review order button %%|
		|ReviewOrder_Btn|
		
		
		
@R2_Mobile @C-Order @CC-Checkout_Order @R2_All @P-High_Order  @KER-3165 
@ZYP_CHECKOUT_K3165-8254 @CR-GK 
Scenario: Verify the guest user is able to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "Credit Card" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 

		
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8243 @CR-GK 
Scenario: Verify the guest user is notified with an error on entering restricted address for the items in cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "ShippingRestrictedZipCode" 
	And  user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|We are unable to ship to AK, HI and PR. Please change your shipping address.|
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8247 @CR-GK 
Scenario: Verify the shipping method has no drop-down for single method available 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForGiftCard" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	Then Guest User should be able to see only one available method for the shipment displayed in shipping method 
	
	
@R2_Mobile @C-Order @CC-Checkout_Order @R2_All @P-Low   @KER-3165 
@ZYP_CHECKOUT_K3165-8255 @CR-GK 
Scenario: Verify the guest user's address is saved in My Address on registering from Order confirmation 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	And user click on checkout button
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
#	And user clicks on edit shipping method cta 
	And user click on go to payment present in shipping method 
	And user fill the credit card detail in payment 
	And user fill the email address for shipment and click on review order btn 
	And user able to see the button place order 
	And registers for the account from the Order confirmation screen with "Password"
	And User clicks on the burger menu 
	And user navigates from Order successful page to address book in my account 
	And Verify below Sub/Main Module of My Account 
		|# Then guest user should be displayed with the below attributes|
		|AddressPage_Edit_btn|
		