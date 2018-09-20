Feature: B04-250- Guest Checkout Flow 

@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8237 @CR-GK 
Scenario: Verify the guest user is able to view the Zipcode on checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And enters the "FindAsStoreZIPCode" zip on the Cart page 
	And click on submit button on calculate shipping model 
	And user click on checkout button in Cart page 
	Then Guest User should be able to see the "FindAsStoreZIPCode" zipcode pre-populated on Checkout page 
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8239 @CR-GK 
Scenario: 
	Verify the guest user is able to view the Checkout Header and Footer on Checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page|
		|checkout_YouAreCheckingOutAsGuest_txt		|
		|checkout_CheckoutHeader_txt				|
		|CheckOut_CheckOutFooter                    |
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8240 @CR-GK 
Scenario: 
	Verify the guest user is able to see the pre-populated City/State with Zipcode 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And enters the "FindAsStoreZIPCode" zip on the Cart page 
	And click on submit button on calculate shipping model 
	And user click on checkout button in Cart page 
	Then Guest User should be able to see the "FindAsStoreZIPCode" zipcode pre-populated on Checkout page 
	And City/State on the basis of the Zipcode should also be pre-populated on Checkout page 
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8241 @CR-GK 
Scenario: 
	Verify the guest user is able to enter the shipping address details on Checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	Then user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter a zip code|
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8242 @CR-GK 
Scenario: 
	Verify the system triggers the Address Verification (AVS) to guest user on wrong address entry 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
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
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8244 @CR-GK 
Scenario: 
	Verify the guest user is able to edit the Saved address in the Shipping address
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page 
	And Verify below Sub/Main Module of Checkout Page 
		|#%%%%  Verify below in shipping drawer in checkout page %%%%%%%|
		|checkout_ShippingAddress_Edit_lnk		|
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8245 @CR-GK 
Scenario: 
	Verify the guest user is displayed with required validations and errors on shipping address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
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
	
	
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8246 @CR-GK 
Scenario: 
	Verify the guest user is able to select the shipping method from the list
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
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
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8248 @CR-GK 
Scenario: 
	Verify the guest user is able to select the Credit Card payment method in order to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
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
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8249 @CR-GK 
Scenario: 
	Verify the guest user is able to select the PayPal payment method in order to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
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
	Then user click on paypal 
	And  Verify below Sub/Main Module of Checkout Page 
		|#%%%%%%   Verify user is able to see paypal checkout button %%%%%%%%%%|
		|PayPalCheckOut_Btn|
		
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8250 @CR-GK 
Scenario: 
	Verify the guest user is able to select the Gift Card payment method in order to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
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
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8251 @CR-GK 
Scenario: 
	Verify the guest user is able to add new Credit Card as payment method in order to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
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
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8253 @CR-GK 
Scenario: 
	Verify the guest user is able to enter a different Billing address on Payment drawer 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
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
		
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8254 @CR-GK 
Scenario: Verify the guest user is able to place the order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
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
	And user fill the email address and click on review order btn 
	And user able to see the button place order 
	Then Verify below Sub/Main Module of Checkout Page 
		|#%%  verify order below attributes on order confirmation page %%|
		|txtOrderSuccesfullStatus|
		|OrderConfirmationPage_OrderNumber|
		|OrderConfirmationPage_OrderNumber_txt|
		
		
		#@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
		#@ZYP_CHECKOUT_K3165-8255 @CR-GK 
		#Scenario: 
		#	Verify the guest user's address is saved in My Address on registering from Order confirmation 
		#	Given user launches the browser and navigates to "ASO_HOME" page 
		#	When User searches a product "productName" and navigates to PDP 
		#	And user click on Add to Cart Button 
		#	And user is navigated to Add to cart Notification popup 
		#	And user will click on View Cart button 
		#	And user navigate to Cart page 
		#	And user click on checkout button in Cart page 
		#	And  user enter First name "FirstName" 
		#	And  user enter Last name "LastName" 
		#	And  user enter Phone number "PhoneNumber" 
		#	And  user enter Address "AVSAddress" 
		#	And  user enter Zipcode "zipcode" 
		#	And  user click on Go To Shipping Method button in Checkout page 
		#	And  user selects the suggested address instead of entered address 
		#	And  clicks on Use Selected Address button 
		#	And user clicks on edit shipping method cta 
		#	And user click on go to payment present in shipping method 
		#	And user fill the credit card detail in payment 
		#	And user fill the email address for shipment and click on review order btn 
		#	And user able to see the button place order 
		#	And registers for the account from the Order confirmation screen with "Password" 
		#	Then Verify the message on the page 
		#		|# Then guest user should be displayed with a banner message for successful account creation|
		#		|created an account|
		#	And user navigates from Order successful page to address book in my account 
		#	And Verify below Sub/Main Module of My Account 
		#		|# Then guest user should be displayed with the below attributes|
		#		|AddressPage_Edit_btn|
		
		
	