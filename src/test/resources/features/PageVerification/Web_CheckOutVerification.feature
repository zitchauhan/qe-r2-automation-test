Feature: Debug 


Scenario: Verify Checkout for Web 
	Then Verify below Sub/Main Module of Checkout Page 
	##########Starts CR-SK
		|#Verify following elements in checkout page|
		|checkout_YouAreCheckingOutAsGuest_txt		|
		|#Below Elements has same name in PO		|
		|checkout_SignIn_lnk						|
		|#After click on sign in|
		|WelcomeBackEmailAddress_Input|
		|WelcomeBackPassword_Input|
		|WelcomeBackSignIN_Btn|
		
		
		
		|# Verify following elements in Checkout > Shipping Address	|
		|checkout_ShippingAddress_FirstName_txt						|
		|checkout_ShippingAddress_LastName_txt						|
		|checkout_ShippingAddress_PhoneNumber_txt					|
		|checkout_ShippingAddress_Address_txt						|
		|checkout_ShippingAddress_ZipCode_txt						|
		|checkout_ShippingAddress_City_txt							|
		|checkout_ShippingAddress_Edit_lnk							|
		|checkOut_ShippingAddress_GoToShippingMethod_btn			|
		|#------Below Elements has same name in PO------			|
		|checkout_ShippingAddress_ShippingAddressHeader_txt			|
		|checkout_ShippingAddress_AddCompanyName_lnk				|
		|checkout_ShippingAddress_AddCompanyName_txt				|
		|checkout_ShippingAddress_State_btn							|
		|checkout_CheckoutHeader_txt								|
		|checkout_ShippingInformation_Header_txt					|
		|checkout_ShippingAddress_txt								|
		
		|#%%%%%%%  In-Store Pickup DropDown %%%%%%%%%% AKK|
		|MePickUp_Drpdwn|
		|StorePickupAlternatesFirstName_input|
		|StorePickupAlternatesLastName_input|
		|StorePickupAlternatesEmail_input|
		|StorePickupAlternatesPhoneNumber_input|	
		|ErrorMsgRequired|
		|PickupLocation_Lbl|
		|StoreNameandAddress_Txt|
		|ChangeLocation_Lnk|
		|ItemsForPickup_Itemcount_Txt|
		|ItemsForPickup_Itemthumbnail_Txt|
		|SeeInStorePickupInstructions_Dd|
		|SeeInStorePickupInstructions_Msg|
		|AlternatePhoneNumberErrorMsg_Txt|
		
		
		|# Verify following elements in Checkout > Shipping Method	|
		|#------Below Elements has same name in PO------			|
		|checkout_ShippingMethod_ShippingMethodHeader_txt			|
		|checkout_ShippingMethod_Edit_lnk							|
		|checkout_ShippingMethod_Shipment_txt						|
		|checkout_ShippingMethod_Items_txt							|
		|checkout_ShippingMethod_ItemImage_img						|
		|checkout_ShippingMethod_ShippingMethodType_btn				|
		|checkout_ShippingMethod_GoToPayment_btn					|
		|checkout_ShippingMethod_ShippingDetails					|
		
		|# Verify following elements in Checkout > Sign In	|
		|checkout_SignIn_EmailAddress_txt					|
		|checkout_SignIn_Password_txt						|
		|#------Below Elements has same name in PO------	|
		|checkout_SignIn_ForgotYourPassword_lnk				|
		|checkout_SignIn_SignIn_btn							|
		############End CR-SK
		
		##########Starts CR-RKA		
		|# Verify following elements in Checkout page "Order Summary"|
		|OrderSummary_Txt|
		|Subtotal_txt|
		|Subtotal_price|
		|Shipping_Txt|
		|ShippingPrice_Txt|
		|Estimatedshippint_txt|
		|EstimatedShippingPrice_txt|
		|Taxes_Txt|
		|TaxesPrice_Txt|
		|EstimatedTax_Txt|
		|EstimatedPrice_Txt|
		|TotalDiscount_Txt|
		|TotalDiscountPrice_Txt|
		|Total_price|
		|Total_txt|
		|giftCards_txt|
		|giftCardsPrice_txt|
		
		|#%%%%%  ITems under Order Summary  %%%%%|
		|Item_Txt|
		|ShippingItemAvailable_Txt|
		|ImageShippingItemAvailable|
		|NameShippingItemAvailable_Txt|
		|Color_Txt|
		|ColorInput_Txt|
		|Size_Txt|
		|SizeInput_Txt|
		|Quantity_Txt|
		|QuantityInput_Txt|
		|PriceShippingItemAvailable_Txt|
		|EditMyCart_Link|
		|DetailOrderSummary_txt|
		
		
		|# Verify following elements in Checkout page "Payment"|
		|#%%%%%  Payment Method %%%%%%%%%%% |
		|PaymentHeader_Txt|
		|PaymentMethodHeader_Txt|
		|CreditCard_radioBtn|
		|PayPal_radioBtn|
		|CreditCardNumber_Input|
		|ExpirationDate_Input|
		|Cvv_Input|
		|CvvToolTip|
		|UnrecognizedCardNumber_Txt|
		|PastExpirationDate_Txt|
		|PleaseEnteRaValidSecurityCode_Txt|
		|ChooseCreditcard_Dd|
		|#%%%%%  Gift Card  %%%%%%%%%%|
		|Plus_GiftCard|
		|Hide_GiftCard|
		|GiftCardNumber_Txt|
		|GiftCardNumber_Input|
		|GiftCardNumber_Tooltip|
		|InvalidGiftCardNumber_Txt|
		|Pin_Txt|
		|Pin_Input|
		|toolTip_pin|
		|InvalidGiftCardPin_Txt|
		|Apply_Btn|
		|txtGiftCardAppliedSuccessMessage|
		|btnToRemoveGiftCardOnCheckoutPage|
		|#%%%%%%   Billing Information  %%%%%%%%%%|
		|BillingInformation_Txt|
		|SameAsShippingAddress_Txt|
		|SameAsShippingAddress_checkBox|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
		|SendSMSTextUpdatesAboutMyOrder_checkbox|
		|Adderss_Input|
		|AddCompanyNameAptNumberEtcOptional_Txt|
		|AddCompanyNameAptNumberEtcOptional_Input|
		|ZipCode_Input|
		|City_Input|
		|State_DD|
		|EmailAddressforOrderConfirmation_Input|
		|SignuptogetHotDeals_checkBox|
		|ReviewOrder_Btn|
		|EditPayment_Link|
		|ChangeBillingInformation_Txt|
		|#%%%%%%%  PayPal  %%%%%%%%%%|
		|PayPal_radioBtm|
		|PayPalCheckOut_Btn|
		##########Ends CR-RKA	
		
		|# Verify following elements in Checkout page"We Accept"|
		|Visa_img|
		|MasterCard_img|
		|Paypal_img|
		|GooglePay_img|
		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|
		|# Verify following elements in Checkout footer_Lnk|
		|CheckoutFooterLegalLinkPrivacyPolicy_Lnk|
		|CheckoutFooterLegalLinkPrivacyPolicy_Txt|
		|CheckoutFooterChatNowLink_Lnk|
		|CheckoutFooterContactNumberLink_mobile_Lnk|
		|CheckoutFooterLegalLinkTermsConditions_lnk|
		|CheckoutFooterLegalLinkTermsConditions_Txt|
		|CheckoutFooterLegalLinkCaliforniaProposition65_Lnk|
		|CheckoutFooterLegalLinkCaliforniaProposition65_Txt|
		
		
		