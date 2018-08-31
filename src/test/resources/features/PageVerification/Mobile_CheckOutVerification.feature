Feature: Debug


	Scenario: Verify Checkout for Web
	Then Verify below Sub/Main Module of Checkout Page 
	##########Starts CR-SK
		|#Verify following elements in checkout page|
		|checkout_YouAreCheckingOutAsGuest_txt		|
		|#Below Elements has same name in PO		|
		|checkout_SignIn_lnk						|
		
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
		|Estimatedshippint_txt| #Not finalised|
		|EstimatedShippingPrice_txt|#Not finalised|
		|Taxes_Txt|
		|TaxesPrice_Txt|
		|EstimatedTax_Txt|#Not finalised|
		|EstimatedPrice_Txt|#Not finalised|
		|TotalDiscount_Txt|
		|TotalDiscountPrice_Txt|
		|Total_price|
		|Total_txt|
		
		|#%%%%%  ITems under Order Summary  %%%%%|
		|Item_Txt|#Not finalised|
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
		|EditMyCart_Link|#Not finalised|
		
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
		|#%%%%%%   Billing Information  %%%%%%%%%%|
		|BillingInformation_Txt|
		|SameAsShippingAddress_Txt|
		|SameAsShippingAddress_checkBox|
		|FirstName_Input|
		|LastName_Input|
		|PhoneNumber_Input|
		|SendSMSTextUpdatesAboutMyOrder_checkbox|
		|Adderss_Input|#Not finalised|
		|AddCompanyNameAptNumberEtcOptional_Txt|#Not finalised|
		|AddCompanyNameAptNumberEtcOptional_Input|
		|ZipCode_Input|
		|Payment_Input|#Not finalised|
		|State_DD|#Not finalised|
		|EmailAddressforOrderConfirmation_Input|#Not finalised|
		|SignuptogetHotDeals_checkBox|#Not finalised|
		|ReviewOrder_Btn|#Not finalised|
		|#%%%%%%%  PayPal  %%%%%%%%%%|
		|PayPal_radioBtm|#Not finalised|
		|PayPalCheckOut_Btn|#Not finalised|
		##########Ends CR-RKA	
		
	
		
			
		